package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Functions {
	public static void InserirNome() {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Digite um nome: ");
			String name = s.nextLine();
			File file = new File("names.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter("names.txt", true));
			if (file.length() == 0) {
				writer.append(name);
			} else {
				writer.append("\n" + name);
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void ExibirArquivo() {
		try {
			try {
				File file = new File("names.txt");
				BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
				String line;
				if (file.length() == 0) {
					System.out.println("Arquivo vazio.");
				}
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}

				reader.close();
			} catch (FileNotFoundException e) {
				System.out.println("Arquivo não encontrado.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void ApagarArquivo() {
		File file = new File("names.txt");

		if (file.delete())
			System.out.println("Arquivo deletado com sucesso!");
		else
			System.out.println("Falha ao deletar arquivo.");
	}

}
