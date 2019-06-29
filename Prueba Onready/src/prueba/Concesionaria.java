package prueba;

import java.util.ArrayList;
import java.util.Collections;

public class Concesionaria implements IBusquedaVehiculo {

	private ArrayList<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();

	public Concesionaria() {
	}

	public void vehiculosConcesionaria() {

		Vehiculo vehiculo1 = new Auto("Peugeot", "206", 4, 200000.00);
		Vehiculo vehiculo2 = new Motocicleta("Honda", "Titan", "125c", 60000.00);
		Vehiculo vehiculo3 = new Auto("Peugeot", "208", 5, 250000.00);
		Vehiculo vehiculo4 = new Motocicleta("Yamaha", "YBR", "160c", 80500.50);

		// ArrayList<Vehiculos> misVehiculos = new ArrayList<>();

		misVehiculos.add(vehiculo1);
		misVehiculos.add(vehiculo2);
		misVehiculos.add(vehiculo3);
		misVehiculos.add(vehiculo4);

		for (Vehiculo vehiculo : misVehiculos) {
			vehiculo.mostrarVehiculos();
		}
	}

	public void vehiculoMasCaro() {
		Vehiculo masCaro;
		masCaro = misVehiculos.get(0);

		for (Vehiculo vehiculos : misVehiculos) {
			if (vehiculos.compareTo(masCaro) > 0) {
				masCaro = vehiculos;
			}
		}
		System.out.println("Vehiculo mas caro: " + masCaro.getMarca() + "  " +masCaro.getModelo());
	}

	public void vehiculoMasBarato() {
		Vehiculo masBarato;
		masBarato = misVehiculos.get(0);

		for (Vehiculo vehiculos : misVehiculos) {
			if (vehiculos.compareTo(masBarato) < 0) {
				masBarato = vehiculos;
			}
		}
		System.out.println("Vehiculo mas barato:  " + masBarato.getMarca() + "  "+  masBarato.getModelo());
	}

	@Override
	public void vehiculoConLetraDeterminada(String letra) {
		for (int i = 0; i < misVehiculos.size(); i++) {
			
			if (misVehiculos.get(i).getModelo().contains(letra)) {
				
				System.out.println("Vehiculo que contiene en el modelo la letra 'Y' :  " + misVehiculos.get(i).getMarca()
						+ "  " + misVehiculos.get(i).getModelo() + " $" + misVehiculos.get(i).getPrecio());
			}
		}
	}
	
	public void ordenarVehiculos() {
		Collections.sort(misVehiculos, new Ordenamiento());
		System.out.println("Vehiculos ordenados por precio de mayor a menor");
		
		for (int i = 0; i < misVehiculos.size(); i++) {
			System.out.println(misVehiculos.get(i).getMarca() + "  " + misVehiculos.get(i).getModelo());
		}
		
	}
}
