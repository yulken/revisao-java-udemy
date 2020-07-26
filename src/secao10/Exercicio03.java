package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
				System.out.println(mat[i][j]);
			}
		}
		
		int queryNumber = sc.nextInt();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == queryNumber) {
					System.out.println("Position (" + i + "," + j + "):");
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}					
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (j < n-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < m-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}

				}
			}
		}
		sc.close();
	}
}
