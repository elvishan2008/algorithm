package p2523;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int input;

		input = scanner.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i = input; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
