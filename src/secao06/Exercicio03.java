package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
//	Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
//	um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
//	4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
//	que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
//	mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme
//	exemplo.

//	Exemplo:
//	Entrada: Sa�da:
//	8
//	1
//	7
//	2
//	2
//	4
	// MUITO OBRIGADO
	// Alcool: 1
	// Gasolina: 2
	// Diesel: 0

	public static void run() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int alc = 0, gas = 0 , dsl = 0;
		while (x != 4) {
				switch (x) {
				case 1:
					alc += 1;
					break;
				case 2:
					gas += 1;
					break;
				case 3:
					dsl += 1;
					break;
				case 4:
					break;
				default:
					break;
				}
				x = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " +  alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + dsl);
		
		sc.close();
		
	}
}

