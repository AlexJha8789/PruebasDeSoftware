
public class Ejemplo_01 {
	
	public static int suma(int i,int j){
		
		return i+j;
	}
	
	public static int resta(int i,int j){
		return i-j;
		
	}
	public static int multiplica(int i,int j){
		return i*j;
	}
	
	public static int divide(int i,int j){
		return i/j;
	}
	
	public static double potencia(int i,int j){
		return Math.pow(i, j);
	}
	
	public static double areacirculo(int r){
		return  Math.round(3.1416 * Math.pow(r, 2) * 100.0) /100.0 ;
	}
	
	public static double perimetrocirculo(int r){
		return 2*3.1416 * r;
	}

}
