package prueba;

import java.util.Comparator;

public class Ordenamiento implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {
		if (vehiculo1.getPrecio()>vehiculo2.getPrecio())
			return -1;
		else if(vehiculo1.getPrecio()<vehiculo2.getPrecio())
			return 1;
		else 
			return 0;
	}

	
	
}
