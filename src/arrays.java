public class arrays {
	
	public static void main(String[] args) {
		int numeros[] = new int[10];
		

	}

	private static void rellenarArray(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 20);

		}
	}



}
