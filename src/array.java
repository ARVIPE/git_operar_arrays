
public class array {

	// Ejercicio generar 10 numeros aleatorios del 1 al 20 e
	// insertar en un array

	public static void rellenarArrays() {

		int numeros[] = new int[10];
		int suma = 0;

		// Inicializamos el contenido del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (20 - -1) + -1);
		}

		// Imprimir en la consola el array creado
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			
		}
		
		sumarArray(numeros);
		
	}
	
	
	public static void imprimir_arrays() {
		System.out.println();
	}
	
	private static void sumarArray(int array[]) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
		suma += array[i];
		}
		System.out.println("total suma:" + suma);
	}
	

}
