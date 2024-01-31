package POOVI;

import javax.swing.JOptionPane;


public class CalculadoraDeImpuestos {
	private double precio;
	private final double impuesto;
	
	public CalculadoraDeImpuestos(double prec) {
		impuesto=1.10;
		precio=prec;
		
	}
	
	public double muestraprecio() {
		return precio;
	}
	public void dimeprecio(double precio) {
		this.precio=precio;
	}
	public double muestraimpuesto() {
		return impuesto;
	}
		public static void main(String[] args) {

			double precio=Double.parseDouble(JOptionPane.showInputDialog("Dime el precio: "));
			CalculadoraDeImpuestos calcu=new CalculadoraDeImpuestos(precio);
			
			JOptionPane.showMessageDialog(null, "El precio que introduciste es: "+calcu.muestraprecio()+" \n el precio con impuestos añadidos es: "+preciofinal(precio));
		}
		public static double preciofinal (double precio) {
			
			CalculadoraDeImpuestos calcu=new CalculadoraDeImpuestos(precio);
		
			double PrecioFin = precio*calcu.muestraimpuesto();
			return PrecioFin;
		
}
}

