import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtPrecio;
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private JTextArea txtS;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Precio");
		lblNewLabel.setBounds(25, 33, 56, 16);
		contentPane.add(lblNewLabel);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(93, 30, 116, 22);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(25, 94, 56, 16);
		contentPane.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(93, 91, 116, 22);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(302, 29, 97, 25);
		contentPane.add(btnProcesar);
		
		txtS = new JTextArea();
		txtS.setBounds(25, 125, 379, 115);
		contentPane.add(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			btnProcesarActionPerformed(arg0);
		}
	}
	//variables globales
	int cantidad;
	double precio,IC;
	
	
	protected void btnProcesarActionPerformed(ActionEvent arg0) {
		
		//Entrada de datos
		cantidad=getCantidad();
		precio=getPrecio();
		
		//proceso de calculo
		IC=calcularIC(cantidad,precio);
		
		//salida de resultado
		mostrar();
		
		
	}
	int getCantidad(){
		return Integer.parseInt(txtCantidad.getText());
	}
	double getPrecio(){
		return Double.parseDouble(txtPrecio.getText());
	}
	static double calcularIC(int c,double p){
		return c*p;
	}
	void mostrar(){
		txtS.setText("   ...:::   BOLETA DE PAGO   :::...   ");
		txtS.append("\nEl importe de Compra es de: " + IC);
		
	}
}
