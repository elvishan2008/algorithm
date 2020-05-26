package p10817;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

	final static int SIZE = 3;
	final static int WANTEDORDER = 1;
	
	public static void main(String[] args) {
		int[] presentArray = new int[SIZE];
		
		Scanner scanner = new Scanner(System.in);
		presentArray[0] = scanner.nextInt();
		presentArray[1] = scanner.nextInt();
		presentArray[2] = scanner.nextInt();
		
		for(int i = presentArray.length-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(presentArray[j] < presentArray[j+1]) {
					int plate = presentArray[j];
					presentArray[j] = presentArray[j+1];
					presentArray[j+1] = plate;
				}
			}
		}
		System.out.println(presentArray[WANTEDORDER]);
	}
}
