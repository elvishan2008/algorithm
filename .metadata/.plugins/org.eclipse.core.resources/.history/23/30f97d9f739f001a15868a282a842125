package p15596;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	final static int MAX = 10000;

	public void selfNum() {
		
		int result=0;
		int[] arr = new int[100000];
		
		for(int i = 1; i < MAX; i++) {
			int newNum=0;
			int saveI=i;
			
			while(saveI!=0) {
				newNum += (saveI%10);
				saveI /= 10;
			}
			
			newNum += i;

			arr[newNum] = 1;
		}
		
		for(int i = 1; i <= MAX; i++) {
			if(arr[i]!=1) {
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		Main test = new Main();
		test.selfNum();
	}

}
