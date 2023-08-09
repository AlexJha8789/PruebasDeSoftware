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
import java.math.BigInteger;
import java.awt.event.ActionEvent;

public class Interfaz2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNumero;
	private JTextField txtNumero;
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
		setBounds(100, 100, 470, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNumero = new JLabel("Numero");
		lblNumero.setBounds(12, 37, 56, 16);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(95, 34, 116, 22);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(310, 33, 97, 25);
		contentPane.add(btnProcesar);
		
		txtS = new TextArea();
		txtS.setBounds(0, 73, 452, 193);
		contentPane.add(txtS);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			btnProcesarActionPerformed(arg0);
		}
	}
	//variables Globales
	BigInteger numero;
	int digitoMasRepetido;
	
	protected void btnProcesarActionPerformed(ActionEvent arg0) {
		
		// Entrada de Datos
		numero = getNumero();
		
		// Proceso de Calculo
		
		digitoMasRepetido=calcularDigitoMasRepetido(numero);
				
		// Salida de Resultados
		mostrar();
	}
	BigInteger getNumero() {
		return new BigInteger(txtNumero.getText());
	}
	
	static int calcularDigitoMasRepetido(BigInteger numero){
		int[] conteoDigitos = new int[10];

        // Convertir  en positivo 
       numero = numero.abs();

        // Contar las veces que aparece cada dígito
       while (numero.compareTo(BigInteger.ZERO) > 0) {
           BigInteger[] divisionRes = numero.divideAndRemainder(BigInteger.TEN);
           int digito = divisionRes[1].intValue();
           conteoDigitos[digito]++;
           numero = divisionRes[0];
       }

        // dígito que más veces se repite
        int digitoMasRepetido = 0;
        int maxRepeticiones = 0;
        for (int i = 0; i < conteoDigitos.length; i++) {
            if (conteoDigitos[i] > maxRepeticiones) {
                maxRepeticiones = conteoDigitos[i];
                digitoMasRepetido = i;
            }
        }

        return digitoMasRepetido;
	}
	
	
	
	void mostrar() {
		txtS.setText("Digito que mas se repite :" + digitoMasRepetido);
		
	}
}
