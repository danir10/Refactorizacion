package es.studium.Refactorizacion;

public class Refactorizacion
{

	private static final double Iva = 1.21;

	public double calcularPrecio (int unidades, double precioUnitario) {

		
		return (unidades*precioUnitario)*Iva; 
	}

}
