package uzduotis03_2;

import java.util.Scanner;

public class uzd10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite pirma skaiciu");
		int a = reader.nextInt();
		System.out.println("Iveskite antra skaiciu");
		int b = reader.nextInt();
		System.out.println("Iveskite trecia skaiciu");
		int c = reader.nextInt();

		if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
			System.out.println("Taip, yra lyginis skaicius");
		} else {
			System.out.println("Ne, nera lyginio skaiciaus");

		}
		reader.close();

	}

}
