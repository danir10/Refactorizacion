package Practica6;

public class Coche {
	String matricula;
	String atrib;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		atrib = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		atrib = c;
		modelo = mo;
		fabricante = f;
	}
	
	public String MetodoA(String modelo, String fabricante) {
		
		String resultado = ("Es un " + fabricante+ " " + modelo + "y gasta 1.137 € por litro.");
		
		return resultado;
	}
	
	public String MetodoB(String modelo, String fabricante) {
		String resultado = ("Es un " + fabricante+ " " + modelo + "y gasta 1.052 € por litro.");
		return resultado;  
	}
	
	public String MetodoC(String modelo, String fabricante) {
		String resultado = ("Es un " + fabricante+ " " + modelo + "y no necesita combustilbe.");
		return resultado;   
	}   

	public String metodo1() {
		String resultado = "";
		if (atrib == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += MetodoA(modelo, fabricante);
		} else if (atrib == "Diesel") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += MetodoB(modelo, fabricante);
		} else if (atrib == "Híbrido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += MetodoC(modelo, fabricante);
		} else {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}
}
