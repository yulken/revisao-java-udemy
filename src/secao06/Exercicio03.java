package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
//	Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//	um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//	4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//	que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//	mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//	exemplo.

//	Exemplo:
//	Entrada: Saída:
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

