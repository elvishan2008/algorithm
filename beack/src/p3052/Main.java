package p3052;

import java.util.Scanner;

public class Main {

	final static int N = 10;
	final static int X = 42;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] plate = new int[X];
		
		
		for(int i = 0; i < N; i++) {
			int A = scanner.nextInt();
			int remainder = A%42;
			
			plate[remainder]=1;
			
		}
		scanner.close();
		
		int cnt = 0;
		for(int i = 0; i < X; i++) {
			
			if(plate[i] == 1) {
				cnt++;
			}
			
		}
		
		System.out.println(cnt);
		
	}

}
