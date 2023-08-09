import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class Interfaz1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblZona;
	private JComboBox cboZona;
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private TextArea txtS;
	private JButton btnProcesar;

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
		setBounds(100, 100, 473, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblZona = new JLabel("Zona");
		lblZona.setBounds(12, 39, 56, 16);
		contentPane.add(lblZona);
		
		cboZona = new JComboBox();
		cboZona.setModel(new DefaultComboBoxModel(new String[] {"Sur", "Norte", "Oriente", "Occidente", "Palco"}));
		cboZona.setBounds(96, 36, 158, 22);
		contentPane.add(cboZona);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(12, 97, 56, 16);
		contentPane.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(96, 94, 116, 22);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtS = new TextArea();
		txtS.setBounds(10, 143, 440, 180);
		contentPane.add(txtS);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(310, 35, 97, 25);
		contentPane.add(btnProcesar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			btnProcesarActionPerformed(arg0);
		}
	}
	
	
	
	// Variables Globales
		int zona, cantidad, obsequio;
		double precio, IC, ID, IP;
		DecimalFormat df = new DecimalFormat("#.##");
	
	protected void btnProcesarActionPerformed(ActionEvent arg0) {
		
		//Entrada de Datos
				zona=getZona();
				cantidad=getCantidad();
				
				//Proceso de calculo
				precio=conseguirPrecio(zona);
				IC=calcularIC(precio, cantidad);
				ID=calcularID(IC,cantidad);
				IP=calcularIP(IC,ID);
				obsequio=calcularObsequio(IP,cantidad);
				
				//Salida de Resultados
				mostrar();
				
	}
	int getZona(){
		return cboZona.getSelectedIndex();
	} 
	
	int getCantidad(){
		return Integer.parseInt(txtCantidad.getText());
	}
	
	static double conseguirPrecio(int z){
		double p=0;
		switch(z){
			case 0: p=99.9;
				break;
			case 1: p=109.9;
				break;
			case 2: p=199.9;
				break;
			case 3: p=299.9;
				break;
			default: p=399.9;
				break;
		}
		return p;
	}
	
	static double calcularIC(double p , int c){
		return p*c;
	}
	
	static double calcularID(double ic, int c){
		double id=0.0;
		if(c>=1 && c<3){
			id= 0.1*ic;
		}
		else if(c>=3 && c<6){
			id=0.125*ic;
		}
		else if(c>=6 && c<10){
			id=0.15*ic;
		}
		else if(c>=10){
			id=0.2*ic;
		}
		else{
			id=0;
		}
		return id;
		
	}
	
	static double calcularIP(double ic, double id){
		return ic-id;
	}
	
	static int calcularObsequio(double ip, int c){
		int obsequio=0;
		
		if(ip>=1000.0){
			obsequio=c*3;
		}
		else if(ip>=500 && ip<1000){
			obsequio=c*2;
		}
		else if(ip<500){
			obsequio=c/2;
		}
		return obsequio;
		
	}
	
	void mostrar(){
		txtS.setText("La Federación Peruana de Fútbol Peruana (FPF)");
		txtS.append("\nEl Importe de Compra es de: " + df.format(IC));
		txtS.append("\nEl Importe de Descuento es de: " + df.format(ID));
		txtS.append("\nEl Importe de Pago es de: " + df.format(IP));
		txtS.append("\nObsequio: " +obsequio);
	}
}
