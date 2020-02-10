
public class array {

	// Ejercicio generar 10 numeros aleatorios del 1 al 20 e
	// insertar en un array

	public static void rellenarArrays() {

		int numeros[] = new int[10];

		// Inicializamos el contenido del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (20 - -1) + -1);
		}

		// Imprimir en la consola el array creado
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
	

	}
	
	public static void main(String[] args) {
		rellenarArrays();
	}
	



}
