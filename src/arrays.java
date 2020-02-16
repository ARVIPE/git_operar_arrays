public class arrays {
	
	public static void main(String[] args) {
		int numeros[] = new int[10];
		rellenarArray(numeros);
		imprimir_array(numeros);
		sumar_array(numeros);
		

	}

	private static void rellenarArray(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 20);

		}
	}
	
	private static void imprimir_array(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}


	private static void sumar_array(int array[]) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
		suma += array[i];
		}
		System.out.println();
		System.out.println("suma:" + suma);
	}
	



}
