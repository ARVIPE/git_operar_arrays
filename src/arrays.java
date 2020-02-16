public class arrays {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		rellenarArray(numeros);
		imprimir_array(numeros);
		sumar_array(numeros);
		nuevometodo2(numeros);
		nuevometodo1(numeros);

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

	private static void sumar_array(int numeros[]) {
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		System.out.println();
		System.out.println("suma:" + suma);
	}
	
	private static void nuevometodo2(int array[]) {
		int aux=array[array.length-1];
		for (int i = array.length-1; i>0; i--) {
			array[i] = array[i-1];
		}
		
		array[0]=aux;
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i] + "");
		}
	}

	private static void nuevometodo1(int numeros[]) {
		int numerosNegativos = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= 0) {
				numerosNegativos = -numeros[i];
				System.out.println("Los números cambiados de signo son: " + numerosNegativos);
			}
		}
	}
}
