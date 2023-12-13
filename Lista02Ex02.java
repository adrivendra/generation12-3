package atividade12_3;

import java.util.Scanner;
import java.util.Stack;

public class Lista02Ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int numMenu;
		String nomeLivro;
		
		do {
			System.out.println("************************************************");
			System.out.println("                       MENU                     ");
			System.out.println(
					" 1 - Adicionar Livro na pilha\n 2 - Listar todos os Livros\n 3 - Retirar Livro da pilha\n 0 - Sair");
			System.out.println("************************************************");
			System.out.println("Entre com a opção desejada:");
			numMenu = leia.nextInt();
			leia.nextLine();


			switch (numMenu) {

			case 1:
				System.out.println("Digite o nome: ");
				nomeLivro = leia.nextLine();
				pilha.add(nomeLivro);
				System.out.println("Pilha: \n");
				for (String p : pilha) {
					System.out.println(p);
				}
				System.out.println("\nLivro Adicionado!");
				break;

			case 2:
				System.out.println("Lista de Livros na Pilha: \n");
				for (String p : pilha) {
					System.out.println(p);
				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					pilha.pop();
					for(String p : pilha){
						System.out.println(p);
					}
					System.out.println("\nO Livro foi retirado da pilha! ");
				}			
				break;

			}

		} while (numMenu != 0);
		System.out.println("Programa Finalizado!");
		leia.close();

	}

}
