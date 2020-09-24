package uzduotis03_2;

import java.util.Scanner;

public class uzd8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite skaiciu");
		int a = reader.nextInt();

		if (a > 99 && a < 1000) {
			System.out.println("Taip");
		} else {
			System.out.println("Ne");

		}
		reader.close();
	}

}
