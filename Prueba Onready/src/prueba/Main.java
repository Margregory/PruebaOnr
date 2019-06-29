package prueba;

public class Main {

		public static void main(String[] args) {
			
		Concesionaria conse1 = new Concesionaria();
		
		conse1.vehiculosConcesionaria();
		System.out.println("==============================");
		conse1.vehiculoMasCaro();
		conse1.vehiculoMasBarato();
		conse1.vehiculoConLetraDeterminada("Y");
		System.out.println("==============================");
		conse1.ordenarVehiculos();
		}
}
		
		
