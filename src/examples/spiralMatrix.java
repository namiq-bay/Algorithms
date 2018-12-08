package examples;

import java.util.Scanner;

public class spiralMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = 0;
		int m = n;

		n = scan.nextInt();

		int a = n / 2;
		int b = a;
		int loop = 1;

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				arr[i][j] = m;
				m++;
			}

		System.out.println(arr[a][b]);

		OUTER: while (true) {

			for (int i = 0; i < loop; i++) {
				b = b - 1; // to left

				if (n - 1 == i)
					break OUTER;

				System.out.println(arr[a][b]);

			}

			for (int i = 0; i < loop; i++) {
				a = a - 1; // to up
				System.out.println(arr[a][b]);

			}

			loop++;

			for (int i = 0; i < loop; i++) {
				b = b + 1; // to right
				System.out.println(arr[a][b]);
			}

			for (int i = 0; i < loop; i++) {
				a = a + 1; // to down
				System.out.println(arr[a][b]);
			}

			loop++;
		}
	}
}
