package prueba;

public abstract class Vehiculo implements Comparable <Vehiculo>{

	protected String marca;
	protected String modelo;
	protected double precio;
	
	public Vehiculo(){

	}
	
	public Vehiculo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public abstract void mostrarVehiculos();
	
	@Override 
	public int compareTo(Vehiculo v1) {
		int result = 0;
		if(this.precio<v1.precio) {
		result = -1;
		}else if(this.precio>v1.precio) {
			result = 1;
		}return result;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
}
