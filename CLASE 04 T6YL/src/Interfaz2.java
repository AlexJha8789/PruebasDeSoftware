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
	private JLabel lblTipo;
	private JComboBox cboTipo;
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
		setBounds(100, 100, 473, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(12, 29, 56, 16);
		contentPane.add(lblTipo);
		
		cboTipo = new JComboBox();
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Adulto", "Ni\u00F1os", "Adultos Mayores"}));
		cboTipo.setBounds(80, 26, 161, 22);
		contentPane.add(cboTipo);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(12, 76, 56, 16);
		contentPane.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(80, 73, 116, 22);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(312, 25, 97, 25);
		contentPane.add(btnProcesar);
		
		txtS = new TextArea();
		txtS.setBounds(10, 98, 440, 180);
		contentPane.add(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			btnProcesarActionPerformed(arg0);
		}
	}
	//variables Globales
	int tipo,cantidad,obsequio;
	double precio,IC,ID,IP;
	
	
	protected void btnProcesarActionPerformed(ActionEvent arg0) {
		
		/*
		 El Zoologico de Huachipa, ha puesto a la venta entradas a los precios dados en la 
		 siguiente tabla:

		Tipo de Entrada		Precio
		Adulto				S/. 19.9
		Niños				S/. 10.9
		Adultos Mayores		S/. 4.9

		Como oferta, aplica un porcentaje de descuento sobre el importe de la compra de 
		acuerdo a la siguiente tabla: 

		Cantidad de entradas	Porcentaje de descuento
		< 4						5.0 %
		>= 4 y<7				6.5 %
		>= 7 y<10				8.0 %
		>= 10					9.5 %

		Considere tambien que, por el mes de junio, se entregan como obsequio; bolsas de 
		cancha en base a su importe de pago de acuerdo a la siguiente tabla:

		Importe de Pago			Obsequio
		>= 60					2 bolsas de cancha por cada entrada
		>= 40 y<60				1 bolsas de cancha por cada entrada
		< 40					1 bolsas de cancha por cada 2 entradas

		Diseñe un algoritmo que determine el importe de la compra, el importe del descuento, 
		el importe a pagar y el obsequio; por la compra de cierta cantidad de entradas de 
		un mismo tipo. */
		
		
		//Entrada de Datos
		tipo=getTipo();
		cantidad=getCantidad();
		
		//Proceso de calculo
		precio=conseguirPrecio(tipo);
		IC=calcularIC(precio, cantidad);
		ID=calcularID(IC,cantidad);
		IP=calcularIP(IC,ID);
		obsequio=calcularObsequio(IP,cantidad);
		
		//Salida de Resultados
		mostrar();
		
		
		
	}
	int getTipo(){
		return cboTipo.getSelectedIndex();
	} 
	
	int getCantidad(){
		return Integer.parseInt(txtCantidad.getText());
	}
	
	static double conseguirPrecio(int t){
		double p=0;
		switch(t){
			case 0: p=19.9;
				break;
			case 1: p=10.9;
				break;
			default: p=4.9;
				break;
		}
		return p;
	}
	
	static double calcularIC(double p , int c){
		return p*c;
	}
	
	static double calcularID(double ic, int c){
		double id=0.0;
		if(c>=1 && c<4){
			id= 0.05*ic;
		}
		else if(c>=4 && c<7){
			id=0.065*ic;
		}
		else if(c>=7 && c<10){
			id=0.08*ic;
		}
		else if(c>=10){
			id=0.095*ic;
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
		
		if(ip>=60.0){
			obsequio=c*2;
		}
		else if(ip>=40 && ip<60){
			obsequio=c;
		}
		else if(ip<40){
			obsequio=c/2;
		}
		return obsequio;
		
	}
	
	void mostrar(){
		txtS.setText("ZOOLOGICO DE HUACHIPA");
		txtS.append("\nEl Importe de Compra es de: " + IC);
		txtS.append("\nEl Importe de Descuento es de: " + ID);
		txtS.append("\nEl Importe de Pago es de: " + IP);
		txtS.append("\n Obsequio" +obsequio);
	}
}
