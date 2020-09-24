package uzduotis03_2;

import java.util.Scanner;

public class uzd2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite skaiciu");
		int n = reader.nextInt();

		if (n % 4 == 0) {
			System.out.println("Kvadrata sudaryti galima!");
		} else {
			System.out.println("Kvadrato sudaryti negalima!");
		}
		reader.close();

	}

}
