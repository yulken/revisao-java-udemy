package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
//	Ler um número inteiro N e calcular todos os seus divisores.
//	Exemplo:
//	Entrada: Saída:
//	6 
//	1
//	2
//	3
//	6

	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0){
				System.out.println(i);
			}
		}
		
	}
}
