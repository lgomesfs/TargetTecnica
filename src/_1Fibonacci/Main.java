package _1Fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para verificar se ele faz parte da sequência de Fibonacci: ");
		int num = sc.nextInt();
		int i;
		int ant2 = 0;
		for (i = 1; i < num;) {
			int ant1 = i;
			i = ant1 + ant2;
			ant2 = ant1;
		}
		if (i == num) {
			System.out.println("O número pertence a sequência de Fibonacci");
		} else {
			System.out.println("O número não faz parte da sequência de Fibonacci");
		}

		sc.close();
	}

}
