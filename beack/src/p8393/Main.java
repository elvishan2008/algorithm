package p8393;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int result = N * (N+1) / 2; 
		
		System.out.println(result);
	}
}
