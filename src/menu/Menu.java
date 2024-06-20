package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   Hardzz moda estoque               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar novo produto ao estoque    ");
			System.out.println("            2 - Listar estoque                       ");
			System.out.println("            3 - Buscar produtos por número           ");
			System.out.println("            4 - Atualizar dados de um produto        ");
			System.out.println("            5 - Deletar produtos                     ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                      \n\n");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println("\nHardzz estoque fechado!");
				leia.close();
				sobre();
				System.exit(0);
			}
			switch (opcao) {
			case 1: {
				System.out.println("Adicionar novo produto ao estoque\n");
				break;
			}
			case 2: {
				System.out.println("Listar estoque\n");
				break;
			}
			case 3: {
				System.out.println("Buscar produtos por número\n");
				break;
			}
			case 4: {
				System.out.println("Atualizar dados de um produto\n");
				break;
			}
			case 5: {
				System.out.println("Deletar produtos\n");
				break;
			}default:{
				System.out.println("Opção inválida!\n");
				break;
			}
			}
		}
	}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Vinícius");
		System.out.println("Hardzz moda sustentável, o drip que salva!");
		System.out.println("*********************************************************");
	}
}