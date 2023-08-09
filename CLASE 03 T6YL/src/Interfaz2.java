import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblSnack;
	private JComboBox cboSnack;
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private TextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz2 frame = new Interfaz2();
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
	public Interfaz2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblSnack = new JLabel("Snack:");
		lblSnack.setBounds(24, 28, 56, 16);
		contentPane.add(lblSnack);
		
		cboSnack = new JComboBox();
		cboSnack.setModel(new DefaultComboBoxModel(new String[] {"Lata peque\u00F1a Pringles-Pack de 6", "Tortees Picante-Pack de 6", "Papas Lays-Pack de 6", "Chifles Piuranos-Pack de 6", "Camote Natuchips-Pack de 6"}));
		cboSnack.setBounds(122, 25, 253, 22);
		contentPane.add(cboSnack);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(24, 70, 56, 16);
		contentPane.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(122, 67, 116, 22);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(460, 49, 97, 25);
		contentPane.add(btnProcesar);
		
		txtS = new TextArea();
		txtS.setBounds(24, 101, 533, 142);
		contentPane.add(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			btnProcesarActionPerformed(arg0);
		}
	}
	
	//variables globales
		int cantidad,tipo;
		double precio,IC,ID,IP;
		
	protected void btnProcesarActionPerformed(ActionEvent arg0) {
		//ENTRADA DE DATOS
		tipo=getTipo();
		cantidad=getcantidad();
		
		//PROCESO DE CLACULO
		precio=getPrecio(tipo);
		IC=calcularIC(cantidad,precio);
		//SALIDA DE RESULTADO
		mostrar();
		
		
	}
	int getTipo(){
		return cboSnack.getSelectedIndex();
	}
	
	int getcantidad(){
		return Integer.parseInt(txtCantidad.getText());
	}
	
	double getPrecio(int t){
		double p=0;
		switch(t){
			case 0: p=23.9;
				break;
			case 1: p=17.9;
				break;
			case 2: p=11.9;
				break;
			case 3: p=29.9;
				break;
			case 4: p=17.9;
				break;
		}
		return p;
	}
	static double calcularIC(int c,double p){
		return c*p;
	}
	void mostrar(){
		txtS.setText("   ...:::   BOLETA DE PAGO   :::...   ");
		txtS.append("\nEl importe de Compra es de: " + IC);
		
	}
	
}
