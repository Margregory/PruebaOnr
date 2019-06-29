package prueba;

public class Motocicleta extends Vehiculo {

	private String cilindrada;
	
	public Motocicleta(String marca, String modelo, String cilindrada, double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	//public void setCilindrada(String cilindrada) {
		//this.cilindrada = cilindrada;
	//}

	@Override
	public void mostrarVehiculos() {
		System.out.println("Marca: " + marca + " // Modelo: " + modelo + " // Cilindrada: " + cilindrada + " // " + "Precio:  $" + precio );
		
	}
	
	
	
}
