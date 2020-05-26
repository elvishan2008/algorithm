package p8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		float[] plate = new float[N];

		for (int i = 0; i < N; i++) {
			int A = scanner.nextInt();
			plate[i] = A;
		}

		int max = (int) plate[0];

		for (int i = 0; i < N; i++) {
			if (max < plate[i]) {
				max = (int) plate[i];
			}
		}

		for (int i = 0; i < N; i++) {
			plate[i] = (plate[i] / max) * 100;
		}

		float sum = 0;

		for (int i = 0; i < N; i++) {
			sum += plate[i];
		}

		float mean = sum / N;

		System.out.println(mean);
	}

}
