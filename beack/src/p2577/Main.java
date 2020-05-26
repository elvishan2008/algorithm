package p2577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		scanner.close();
		
		int result = A * B * C;

		int[] plateArray = new int[10];
		while(result>0) {
			plateArray[result%10]++;
			result /= 10; 
		}
		
		for(int number : plateArray) {
			System.out.println(number);
		}
	}

}
