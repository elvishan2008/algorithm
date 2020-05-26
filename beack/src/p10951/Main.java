package p10951;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int N;
		
		N = scanner.nextInt();
		
		if(N<10) {
			N*=10;
		}
		
		int cnt=0;
		int newN=N;
		int sum;
		
		do {
			sum = ((newN / 10) + newN % 10) % 10;
			newN = (newN % 10) * 10 + (sum % 10);
			
			cnt++;
			
		}while(!(N==newN));
		
		System.out.println(cnt);
	}
}
