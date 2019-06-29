package prueba;

public class Auto extends Vehiculo {

	private int puertas;

	public Auto(String marca, String modelo, int puertas, double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public void mostrarVehiculos() {
		System.out.println("Marca: " + marca + " // Modelo: " + modelo + " // Puertas: " + puertas + " // Precio: $" + precio );
	
	}
	
}
