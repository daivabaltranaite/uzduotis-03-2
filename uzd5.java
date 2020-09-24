package uzduotis03_2;

import java.util.Scanner;

public class uzd5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite mokinio ivertinima [1-10]:");
		int a = reader.nextInt();

		if (a < 0 || a > 10) {
			System.out.println("Salyga neteisinga");
		} else if (a >= 1 && a <= 6) {
			System.out.println("Reikia daugiau pastangu");
		} else if (a == 7) {
			System.out.println("Vidutiniskai");
		} else if (a == 8) {
			System.out.println("Gerai");
		} else if (a == 9) {
			System.out.println("Labai gerai");
		} else {
			System.out.println("Puikiai");
		}
		reader.close();

	}

}
