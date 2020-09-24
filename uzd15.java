package uzduotis03_2;

import java.util.Scanner;

public class uzd15 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite metu menesi skaiciu:");
		int a = reader.nextInt();

		if (a < 1 || a > 12) {
			System.out.println("Tokio menesio nera");
		} else if (a == 1) {
			System.out.println("Ziema");
		} else if (a == 2) {
			System.out.println("Ziema");
		} else if (a == 3) {
			System.out.println("Pavasaris");
		} else if (a == 4) {
			System.out.println("Pavasaris");
		} else if (a == 5) {
			System.out.println("Pavasaris");
		} else if (a == 6) {
			System.out.println("Vasara");
		} else if (a == 7) {
			System.out.println("Vasara");
		} else if (a == 8) {
			System.out.println("Vasara");
		} else if (a == 9) {
			System.out.println("Ruduo");
		} else if (a == 10) {
			System.out.println("Ruduo");
		} else if (a == 11) {
			System.out.println("Ruduo");
		} else {
			System.out.println("Ziema");
		}
		reader.close();

	}

}
