package POOVI;

import javax.swing.JOptionPane;

public class ComprobadorDeEdadParaVoxtar {

	private int edad;
	private final int minEdad;
	public ComprobadorDeEdadParaVoxtar(int e) {
		edad=e;
		minEdad=18;
	}
		public int getEdad() {
		return edad;
	}
	 
	public void setEdad(int edad) {
		this.edad = edad;
	}
	 
	public int getMinEdad() {
		return minEdad;
	}
	public String comprobar( int edad, int minEdad) {
		String frase;
		if (edad<minEdad) {
			 frase = "no eres mayor de edad, puedes votar";
		}else if (edad>minEdad) {
			frase = "eres mayor de edad, no puedes votar";
		}else {
			frase = "eres mayor de edad, puedes votar";
		}
		return frase;
	}
	 
		public static void main(String[] args) {
			
	int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
	ComprobadorDeEdadParaVoxtar edades = new ComprobadorDeEdadParaVoxtar(edad);
	JOptionPane.showMessageDialog(null, edades.comprobar(edad, edades.getMinEdad()));
		}
	 
	}