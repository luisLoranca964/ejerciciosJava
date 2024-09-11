package ejerciciosJava;

public class Ejercicio1 {
	public static void main(String args[]) {
		int a= 1;
		for(int x=1;x<=3;x++) {
			for(int y=1;y<=3;y++) {
				System.out.print(a);
				System.out.print(y+"\n");	
			}
			a++;
		}
	}
}
