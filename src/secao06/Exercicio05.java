package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
//	Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
//	Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
//	essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
//	Exemplo:

//	Entrada: 
//	5
//	14
//	123
//	10
//	-25
//	32

//	Sa�da:
//	2 in
//	3 out

	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x, in = 0, out = 0;
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			} else
				out += 1;

		}
		sc.close();

		System.out.println(in + " in");
		System.out.println(out + " out");

	}
}
