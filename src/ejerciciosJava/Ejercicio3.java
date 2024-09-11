package ejerciciosJava;

public class Ejercicio3 {

	public static void main(String[] args) {
		int contador = 1;
		do {
			for (int x = 1; x <= contador; x++) {
				System.out.print("*");
			}
			System.out.println();
			contador++;
		} while (contador <= 5);
	}

}
