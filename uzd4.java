package uzduotis03_2;

import java.util.Scanner;

public class uzd4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite deziu skaiciu");
		int n = reader.nextInt();
		System.out.println("Iveskite kiek deziu telpa i masina");
		int m = reader.nextInt();

		int k = (n / m);
		if (n % m != 0) {
			k = k + 1;
		}
		System.out.println("Vairuotojas tures nuvaziuoti " + k + " kartus.");
		reader.close();
	}

}
