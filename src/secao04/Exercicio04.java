package secao04;

import java.util.Scanner;

public class Exercicio04 {
//	Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
//	hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
//	decimais.
//	Exemplos:
//	Entrada: Sa�da:
//	25
//	100
//	5.50
		//	NUMBER = 25
		//	SALARY = U$ 550.00
//	Entrada: Sa�da:
//	1
//	200
//	20.50
		//	NUMBER = 1
		//	SALARY = U$ 4100.00
//	Entrada: Sa�da:
//	6
//	145
//	15.55
		//	NUMBER = 6
		//	SALARY = U$ 2254.75
	public static void run() {
		Scanner sc = new Scanner(System.in);
		int idF = sc.nextInt();
		int hours = sc.nextInt();
		double salPerHour = sc.nextDouble();
		sc.close();
		System.out.println("NUMBER = " + idF);
		System.out.printf("SALARY = U$ %.2f", hours * salPerHour);
	}
	
}
