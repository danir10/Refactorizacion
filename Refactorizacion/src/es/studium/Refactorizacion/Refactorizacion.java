package es.studium.Refactorizacion;

public class Refactorizacion
{

	public double calcularPrecio (int unidades, double precioUnitario) {

		final double iva = 1.21;
		return (unidades*precioUnitario)*(1.21); 
	}

}
