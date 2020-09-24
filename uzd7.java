package uzduotis03_2;

import java.util.Scanner;

public class uzd7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite kampo dydi");
		int k = reader.nextInt();

		if (k == 90) {
			System.out.println("Statusis");
		} else if (k == 180) {
			System.out.println("Istiestinis");
		} else if (k == 360) {
			System.out.println("Pilnutinis");
		} else if (k < 0) {
			System.out.println("Kampo dydis turi buti teigiamas skaicius");
		} else {
			System.out.println("Pavadinimo nera");
		}

		reader.close();
	}

}
