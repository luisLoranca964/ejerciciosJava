package ejerciciosJava;

public class Ejercicio2 {
	public static void main(String[] args) {
		int contador = 6;
		do {
			for (int x = 1; x <= contador; x++) {
				System.out.print("*");
			}
			System.out.println();
			contador--;
		} while (contador > 0);
	}
}
