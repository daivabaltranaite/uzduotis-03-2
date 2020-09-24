package uzduotis03_2;

import java.util.Scanner;

public class uzd9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite pirma krastine");
		int a = reader.nextInt();
		System.out.println("Iveskite antra krastine");
		int b = reader.nextInt();
		System.out.println("Iveskite trecia krastine");
		int c = reader.nextInt();

		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Galima sudaryti trikampi");
		} else {
			System.out.println("Negalima sudaryti trikampio");

		}
		reader.close();

	}

}
