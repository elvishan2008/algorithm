package p2446;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int layer = scanner.nextInt();

		int totalSpace = layer * 2 - 1;

		for (int i = 0; i < layer; i++) {

			for (int j = 0; j < totalSpace; j++) {

				if (j < i ) {
					System.out.print(" ");
				}
				else if(j >= totalSpace - i) {
					System.out.print("");
				}
				else {
					System.out.print("*");
				}

			}
			System.out.println("");
		}
		
		for (int i = 1; i < layer; i++) {

			for (int j = 0; j < totalSpace; j++) {

				if (j < layer -1 - i ) {
					System.out.print(" ");
				}
				else if (j >= layer + i) {
					System.out.print("");
				}
				else {
					System.out.print("*");
				}

			}
			System.out.println("");
		}
		
		
	}

}
