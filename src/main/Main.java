package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opção = 0;
		while (opção != 4) {
			System.out.println("\nSelecione uma opção:");
			System.out.println("1 - Inserir nome no arquivo");
			System.out.println("2 - Exibir todos os nomes do arquivo");
			System.out.println("3 - Apagar todo o arquivo");
			System.out.println("4 - Sair");

			opção = s.nextInt();

			switch (opção) {
			case 1:
				Functions.InserirNome();
				break;
			case 2:
				Functions.ExibirArquivo();
				break;
			case 3:
				Functions.ApagarArquivo();
				break;
			case 4:
				System.out.println("Programa fechado com sucesso.");
				break;
			default:
				System.out.println("Opção não reconhecida.");
			}

		}

	}
}