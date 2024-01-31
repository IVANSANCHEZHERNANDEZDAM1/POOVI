package POOVI;

import javax.swing.JOptionPane;

public class ConversorDeTemperatura {

	private double Celsius;
	private final double Fahrenheit,ajuste;
	
	public ConversorDeTemperatura(double Cels) {
		Celsius=Cels;
		Fahrenheit=1.8;
		ajuste=32;
	}
	public void dimeCelsius(double Celsius) {
		this.Celsius=Celsius;
	}
	public double muestraCelsius() {
		return Celsius;
	}
	public double muestraFahrenheit() {
		return Fahrenheit;
	}
	public double muestraajuste() {
		return ajuste;
	}
	
	public static void main(String[] args) {

		double Celsius=Double.parseDouble(JOptionPane.showInputDialog("Dime los grados en Celsius: "));
		ConversorDeTemperatura conv= new ConversorDeTemperatura(Celsius);
		
		JOptionPane.showMessageDialog(null, "La temperatura que introjiste es : "+conv.muestraCelsius()+" \n el precio con impuestos añadidos es: "+temperaturaenFahrenheits(Celsius));

	}
	public static double temperaturaenFahrenheits (double Celsius) {
		
		ConversorDeTemperatura conv= new ConversorDeTemperatura(Celsius);
	
		double temperaturaFahrenheits = (Celsius*conv.muestraFahrenheit())+conv.muestraajuste();
		return temperaturaFahrenheits;
    }
}
