package uzduotis03_2;

import java.util.Scanner;

public class uzd14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite pirma skaiciu");
		int a = reader.nextInt();
		System.out.println("Iveskite antra skaiciu");
		int b = reader.nextInt();
		System.out.println("Iveskite operacijos simboli");
		String c = reader.next();
		System.out.print("Gauta: ");
		switch (c) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "/":
			System.out.println(a / b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "%":
			System.out.println(a % b);
			break;
		default:
			System.out.println("Tokio simbolio skaiciuotuvas nepalaiko");
		}

		reader.close();
	}

}
