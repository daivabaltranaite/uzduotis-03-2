package uzduotis03_2;

import java.util.Scanner;

public class uzd3 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite prekes kaina");
		double k = reader.nextDouble();

		System.out.println("Iveskite perkamus vienetus");
		int vnt = reader.nextInt();

		double suma = vnt * k;
		if (vnt > 3) {
			double sumaSuNuolaida = suma * 0.8;
			System.out.println("Gauta: Suma su nuolaida " + sumaSuNuolaida);
		} else {
			System.out.println("Gauta: Suma (be nuolaidos): " + suma);
		}
		reader.close();

	}

}
