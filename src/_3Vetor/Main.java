package _3Vetor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double[] faturamento = new Double[31];
		int diasAvg = 0;
		double min = .0, max = 0.01, avg = 0;
		// Usuário informar quantidade de dias no mês
		System.out.print("Digite quantos dias tem no mês: ");
		int dias = sc.nextInt();

		System.out.println();
		// Usuário adicionar os valores do faturamento
		for (int i = 0; i < dias; i++) {
			System.out.print("Digite o faturamento do dia " + (i + 1) + ": ");
			faturamento[i] = sc.nextDouble();
			System.out.println();
		}

		for (int i = 0; i < dias; i++) {
			// Verificar se o faturamento é maior que o máximo, se sim, atribuir o valor na
			// variável
			if (faturamento[i] > max) {
				max = faturamento[i];
			}
			// Verificar se o mínimo é igual a 0 para armazenar e não ficar sempre com 0
			if (min == 0) {
				min = faturamento[i];
			}
			// Contar os dias que teve faturamento para armazenar e calcular a média
			if (faturamento[i] > 0) {
				diasAvg++;
				// Verificar se o faturamento é menor que o minimo, se sim, atribuir o valor na
				// variável
				if (faturamento[i] < min) {
					min = faturamento[i];
				}
			}
			// Somar o faturamento para depois calcular a média
			avg += faturamento[i];
		}
		// Cálculo da média baseado na quantidade de dias que faturou
		avg = (avg / diasAvg);

		diasAvg = 0;
		// Contar quantos dias tiveram faturamento acima da média
		for (int i = 0; i < dias; i++) {
			if (faturamento[i] > avg) {
				diasAvg++;
			}
		}

		System.out.println("Valor do dia com menor faturamento: R$ " + String.format("%.2f", min));
		System.out.println("Valor do dia com maior faturamento: R$ " + String.format("%.2f", max));
		System.out.println("Quantidade de dias com faturamento maior que a média: " + diasAvg);

		sc.close();
	}
}
