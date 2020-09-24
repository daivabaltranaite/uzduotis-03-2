package uzduotis03_2;

import java.util.Scanner;

public class uzd1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite skaiciu");
		int sk = reader.nextInt();

		if (sk >= 0) {
			double result = Math.sqrt(sk);
			System.out.println("Gauta: " + result);
		} else {
			System.out.println("Gauta: Saknies istraukti negalima, nes ivestas neigiamas skaicius");
		}
		reader.close();
	}

}
