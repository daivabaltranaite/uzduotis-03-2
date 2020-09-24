package uzduotis03_2;

import java.util.Scanner;

public class uzd13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite metu menesi skaiciu:");
		int a = reader.nextInt();

		if (a < 1 || a > 12) {
			System.out.println("Tokio menesio nera"); // pavyzdys neatitinka salygos, ziureti uzd15 nurodyta uzduotis isspresta su metu laikais
		} else if (a == 1) {
			System.out.println("Sausis");     
		} else if (a == 2) {
			System.out.println("Vasaris");
		} else if (a == 3) {
			System.out.println("Kovas");
		} else if (a == 4) {
			System.out.println("Balandis");
		} else if (a == 5) {
			System.out.println("Geguze");
		} else if (a == 6) {
			System.out.println("Birzelis");
		} else if (a == 7) {
			System.out.println("Liepa");
		} else if (a == 8) {
			System.out.println("Rugpjutis");
		} else if (a == 9) {
			System.out.println("Rugsejis");
		} else if (a == 10) {
			System.out.println("Spalis");
		} else if (a == 11) {
			System.out.println("Lapkritis");
		} else {
			System.out.println("Gruodis");
		}
		reader.close();

	}

}
