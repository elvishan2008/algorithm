package p1546;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		ArrayList<String> plateList = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			String X = scanner.next();
			
			int cnt = 0;
			int sum = 0;
			
			plateList.add(X);
			
			for(int j = 0; j < plateList.get(i).length(); j++) {
				
				if (plateList.get(i).charAt(j)=='O')
					sum += ++cnt;
				
				else cnt = 0;
			}
			
			System.out.println(sum);
		}
		
	}

}
