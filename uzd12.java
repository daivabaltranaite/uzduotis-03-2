package uzduotis03_2;

import java.util.Scanner;

public class uzd12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite koda:");
		int a = reader.nextInt();

		switch (a) {
		case 1:
			System.out.println("Sauleta");
			break;
		case 2:
			System.out.println("Lietinga");
			break;
		case 3:
			System.out.println("Vejuota");
			break;
		case 4:
			System.out.println("Sniegas");
			break;
		default:
			System.out.println("Tokio kodo nera");
		}
		reader.close();

	}

}
