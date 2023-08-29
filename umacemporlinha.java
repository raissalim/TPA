import java.util.Scanner;
public class umacemporlinha {
	public static void main(String[] arges) {
		Scanner in = new Scanner (System.in);
		int i=2;

		
		while (i<=500) {
			System.out.println("Numero"+i);
			i=i+2;
		}

		
		in.close();
	}
}
