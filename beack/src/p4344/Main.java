package p4344;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();

		// test case
		for (int i = 0; i < C; i++) {
			ArrayList<Integer> scoreList = new ArrayList<>();

			int sum = 0;
			double mean = 0.0;

			int N = sc.nextInt();

			for (int j = 0; j < N; j++) {
				int score = sc.nextInt();
				scoreList.add(score);
				sum += score;
			}

			mean = (double) sum / N;
			int cnt = 0;

			for (int score : scoreList) {
				if (score > mean) {
					cnt++;
				}
			}

			System.out.printf("%.3f", 100.0 * cnt / N);
			System.out.println("%");
		}

	}

}
