import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblMonto;
	private JTextField txtMonto;
	private JButton btnProcesar;
	private TextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz1 frame = new Interfaz1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMonto = new JLabel("Monto");
		lblMonto.setBounds(23, 35, 56, 16);
		contentPane.add(lblMonto);
		
		txtMonto = new JTextField();
		txtMonto.setBounds(92, 32, 116, 22);
		contentPane.add(txtMonto);
		txtMonto.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(277, 31, 97, 25);
		contentPane.add(btnProcesar);
		
		txtS = new TextArea();
		txtS.setBounds(0, 73, 446, 165);
		contentPane.add(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			btnProcesarActionPerformed(arg0);
		}
	}
	
	//variables Globales
	int monto;
	double jb,lb,ar,jd,bds,ca;
	
	protected void btnProcesarActionPerformed(ActionEvent arg0) {
		
		/*El Club Alianza Lima del Perú repartirá un monto de dinero entre sus jugadores por pasar a la siguiente fase de la Copa Libertadores. Los jugadores que se beneficiarán de este premio son: Josepmir Ballón, Leao Butrón, Alberto Rodríguez, Jean Deza, Beto Da Silva y Carlos Ascues. Cada jugador recibirá una cantidad equivalente a:

•	Josepmir Ballón: 24% del monto de dinero a repartir.
•	Leao Butrón: 45% del monto recibido por Alberto Rodríguez
•	Alberto Rodríguez: 36% del monto de dinero a repartir
•	Jean Deza: 25% del monto total recibido por Josepmir Ballón y Beto Da Silva.
•	Beto Da Silva: 20% del monto total recibido por Leao Butrón y Alberto Rodríguez.
•	Carlos Ascues: Lo que queda del dinero a repartir.

Dado el monto de dinero a repartir, diseñe un archivo del tipo JUnit que determine qué cantidad de dinero le corresponde a cada jugador. 
*/
		
		
		//Entrada de datos.
		monto=getMonto();
		
		//Proceso de calculo
		jb=calcularJB(monto);
		ar=CalcularAR(monto);
		lb=CalcularLB( ar);
		bds=CalcularBDS(lb,ar);
		jd=CalcularJD(jb,bds);
		ca=CalcularCA(monto,ar,lb,jb,jd,bds);
		
		//Salida de Resultados
		mostrar();
		
		
	}
	
	int getMonto(){
		return Integer.parseInt(txtMonto.getText());
	}
	
	static double calcularJB(int m){
		return 0.24*m;
	}
	
	static double CalcularAR(int m){
		return 0.36*m;
		
	}
	
	static double CalcularLB(double a){
		return  0.45*a;
	}
	
	static double CalcularBDS(double l ,double a){
		return 0.2*(l+a);
		
	}
	
	static double CalcularJD(double jo, double b){
		return 0.25*(jo+b);
	}
	
	static double CalcularCA(int m,double a, double l, double jo, double b, double je){
		return m-(a+l+jo+b+je) ;
	}
	
	void mostrar(){
		txtS.setText("PREMIOS COPA LIBERTADORES");
		txtS.append("\nEl monto para Josepmir Ballón es de:" + jb);
		txtS.append("\nEl monto para Alberto Rodríguez es de" + ar);
		txtS.append("\nEl monto para Leao Butrón es de" + lb);
		txtS.append("\nEl monto para Beto Da Silva es de" +bds);
		txtS.append("\nEl monto para Jean Deza es de" +jd);
		txtS.append("\nEl monto para Carlos Ascues es de" + ca);
		
	}
}
