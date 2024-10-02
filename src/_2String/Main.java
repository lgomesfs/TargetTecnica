package _2String;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String nome = sc.nextLine();

		int count = 0;

		for (int i = 0; i < nome.length(); i++) {
			nome.charAt(i);
			if (nome.charAt(i) == 'a' || nome.charAt(i) == 'A') {
				count++;
			}
		}

		if (count != 0) {
			System.out.println("Existe a letra 'a' na palavra: " + nome);
			System.out.println("A letra 'a' aparece: " + count);
		} else {
			System.out.println("Não existe a letra 'a' na palavra: " + nome);
		}

		sc.close();
	}

}
