
public class Semana3 {
	
	public static boolean Bisiesto(int anho){
		
		if(anho%4==0)
		    return true;
		else
			return false;
	}
	
	public static boolean ExisteTriangulo(int lado1,int lado2,int lado3 ){
		
		if(lado1>lado2+lado3)
			return false;
		else if(lado2>lado1+lado3)
			return false;
		else if(lado3>lado1+lado2)
			return false;
		else
			return true;
	}
	
	
	/* En StarBucks, se aceptan diversos tipos de pago. Si pagas con efectivo te 

	 * hacen un descuento del 20%; pero al pagar con tarjeta hay un recargo. Si

	 * pagas con VISA te aumentan el 10%, y con MasterCard el 25%. Construir el método

	 * de la clase y su caso de prueba JUNIT. */
	
	public static double StarBucks(int tipo, double vcompra){
		double recargo,descuento;
		
		switch(tipo){
		
		case 0: descuento= 0.20 * vcompra;
				recargo=0;
				break;
				
		case 1: descuento= 0;
				recargo=0.10 * vcompra;
				break;
				
		case 2: descuento= 0;
				recargo=0.25 * vcompra;
				break;
				
		default:descuento= 0;
				recargo=0;
				break;
				
		}
		return vcompra + recargo -descuento;
	}

}
