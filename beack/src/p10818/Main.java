package p10818;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int firstOrder, lastOrder;

		int[] intArray = new int[N];

		for (int i = 0; i < N; i++) {

			int A = scanner.nextInt();

			intArray[i] = A;

		}

		Arrays.sort(intArray);

		/*	
		 * for (int i = N - 1; i > 0; i--)z` {
		 * 
		 * for (int j = 0; j < i; j++) {
		 * 
		 * if (intArray[j] < intArray[j + 1]) {
		 * 
		 * int plate = intArray[j]; intArray[j] = intArray[j + 1]; intArray[j + 1] =
		 * plate; } } }
		 * 
		 * firstOrder = 0; lastOrder = intArray.length - 1;
		 */
		
		System.out.println(intArray[0] + " " + intArray[intArray.length-1]);
	}

}
