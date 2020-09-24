package uzduotis03_2;

import java.util.Scanner;

public class uzd11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite pirma skaiciu");
		int a = reader.nextInt();
		System.out.println("Iveskite antra skaiciu");
		int b = reader.nextInt();
		System.out.println("Iveskite trecia skaiciu");
		int c = reader.nextInt();
		
	
		if ((a > 100 && b < 100 && c < 100 ) || (b > 100 && a < 100 && c < 100) || (c > 100 && a < 100 && b < 100))   {
			System.out.println("Tik vienas trizenklis");
		} else {
			System.out.println("Daugiau nei vienas trizenklis");
		
	}
	reader.close();

	}

}
