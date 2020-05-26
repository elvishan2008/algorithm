package p2562;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	final static int N = 9;
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] integerArray = new int[N];
		
		for(int i = 0; i < N ;i++) {
			int x = scanner.nextInt();
			integerArray[i] = x;
		}

		int max = integerArray[0];
		int order = 0;
		
		for(int i = 0; i < N; i++) {
			
			if(max <= integerArray[i]) {
				max = integerArray[i];
				order = i+1;
			}
			
		}
		
		System.out.println(max);
		System.out.println(order);
	}

}
