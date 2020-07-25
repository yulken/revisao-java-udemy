package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
//	Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//	incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//	impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
//	Exemplo:
//	Entrada: Saída:
//	2200
//	1020
//	2022
//	2002
			//	Senha Invalida
			//	Senha Invalida
			//	Senha Invalida
			//	Acesso Permitido
	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int passwd = sc.nextInt();
		while (passwd != 2002) {
			System.out.println("Senha Invalida");
			passwd = sc.nextInt();
		}
		sc.close();
		System.out.println("Acesso Permitido");
		
	}
}
