package uzduotis03_2;

import java.util.Scanner;

public class uzd6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite skaiciu");
		int a = reader.nextInt();

		if (a == 0) {
			System.out.println("Nulis");
		} else if (a > 0) {
			System.out.println("Teigiamas");
		} else {
			System.out.println("Neigiamas");
		}
		reader.close();
	}

}
