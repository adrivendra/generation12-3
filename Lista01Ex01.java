package atividade12_3;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lista01Ex01 {

	public static void main(String[] args) {
		Queue<String> nomes = new LinkedList<String>();
		int numMenu;
		Scanner leia = new Scanner(System.in);
		String nomeCliente;
		Iterator<String> iNomes = nomes.iterator();

		do {
			System.out.println("************************************************");
			System.out.println("                       MENU                     ");
			System.out.println(
					" 1 - Adicionar Clientes na Fila\n 2 - Listar todos Clientes\n 3 - Retirar Clientes da Fila\n 0 - Sair");
			System.out.println("************************************************");
			System.out.println("Entre com a opção desejada:");
			numMenu = leia.nextInt();
			leia.nextLine();

			switch (numMenu) {

			case 1:
				System.out.println("Digite o nome: ");
				nomeCliente = leia.nextLine();
				nomes.add(nomeCliente);
				System.out.println("Fila: \n");
				for (String n : nomes) {
					System.out.println(n);
				}
				System.out.println("\nCliente Adicionado!");
				break;

			case 2:
				System.out.println("Lista de Clientes na Fila: \n");
				for (String n : nomes) {
					System.out.println(n);
				}
				break;

			case 3:
				if (nomes.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					iNomes = nomes.iterator();
					iNomes.next();
					iNomes.remove();
					System.out.println("Fila:\n ");
					while(iNomes.hasNext()){
						System.out.println(iNomes.next());
					}
					System.out.println("\nO Cliente foi Chamado! ");
				}			
				break;

			}

		} while (numMenu != 0);
		System.out.println("Programa Finalizado!");
		leia.close();
	}

}
