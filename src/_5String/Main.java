package _5String;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Receber o nome
		System.out.print("Digite um nome: ");
		String nome = sc.nextLine();
		String emon = "";
		// Lê a String nome de trás para frente e armazena na String emon
		for (int i = (nome.length() - 1); i >= 0; i--) {
			emon += nome.charAt(i);
		}

		System.out.println(emon);
		sc.close();
	}
}
