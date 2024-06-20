package menu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import menu.controller.ProdutoController;
import menu.model.Camiseta;
import menu.model.Calca;
import menu.model.Calcado;

public class Menu {

	public static void main(String[] args) {
		ProdutoController produtos = new ProdutoController();
		int opcao, id, quantidade, peca;
		String cor, estampa, marca, material;
		char tamanho;
		Scanner leia = new Scanner(System.in);

		System.out.println("Dados atuais do estoque: ");
		Camiseta c1 = new Camiseta(produtos.gerarId(), 'm', "preta", 15, 1, "pato");
		produtos.cadastrar(c1);
		Calcado cd1 = new Calcado(produtos.gerarId(), 'p', "branco", 19, 2, "nike");
		produtos.cadastrar(cd1);
		Calca cl1 = new Calca(produtos.gerarId(), 'G', "azul", 8, 3, "jeans");
		produtos.cadastrar(cl1);
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   Hardzz moda estoque               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("          1 - Adicionar novo produto ao estoque      ");
			System.out.println("          2 - Listar estoque                         ");
			System.out.println("          3 - Buscar produtos por número             ");
			System.out.println("          4 - Atualizar dados de um produto          ");
			System.out.println("          5 - Deletar produtos                       ");
			System.out.println("          6 - Sair                                   ");
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
				System.out.println("Digite o tamanho: P, M ou G");
				leia.skip("\\R?");
				tamanho = Character.toUpperCase(leia.next().charAt(0));
				System.out.println("Digite a cor: ");
				leia.skip("\\R?");
				cor = leia.nextLine().toLowerCase();
				System.out.println("Digite a quantidade do estoque: ");
				quantidade = leia.nextInt();
				do {
					System.out.println("Digite o tipo de peça:\n1- Camiseta\n2- Calçado\n3- Calça");
					peca = leia.nextInt();
				} while (peca != 1 && peca != 2 && peca != 3);
				switch (peca) {
				case 1 -> {
					System.out.println("Digite o nome da estampa: ");
					leia.skip("\\R?");
					estampa = leia.nextLine().toLowerCase();
					produtos.cadastrar(new Camiseta(produtos.gerarId(), tamanho, cor, quantidade, peca, estampa));
				}
				case 2 -> {
					System.out.println("Digite a marca: ");
					leia.skip("\\R?");
					marca = leia.nextLine().toLowerCase();
					produtos.cadastrar(new Calcado(produtos.gerarId(), tamanho, cor, quantidade, peca, marca));
				}
				case 3 -> {
					System.out.println("Digite o material: ");
					leia.skip("\\R?");
					material = leia.nextLine().toLowerCase();
					produtos.cadastrar(new Calca(produtos.gerarId(), tamanho, cor, quantidade, peca, material));
				}
				}
				keyPress();
				break;
			}
			case 2: {
				System.out.println("Listar estoque\n");

				produtos.listarTodos();
				keyPress();
				break;
			}
			case 3: {
				System.out.println("Buscar produtos por ID\n");

				System.out.println("Digite o número do ID: ");
				id = leia.nextInt();

				produtos.procurarPorNumero(id);
				keyPress();
				break;
			}
			case 4: {
				System.out.println("Atualizar dados de um produto\n");

				System.out.println("Digite o ID do produto: ");
				id = leia.nextInt();

				var buscaID = produtos.buscarNoEstoque(id);

				if (buscaID != null) {
					System.out.println("Digite o tamanho: P, M ou G");
					leia.skip("\\R?");
					tamanho = Character.toUpperCase(leia.next().charAt(0));
					System.out.println("Digite a cor: ");
					leia.skip("\\R?");
					cor = leia.nextLine().toLowerCase();
					System.out.println("Digite a quantidade do estoque: ");
					quantidade = leia.nextInt();
					do {
						System.out.println("Digite o tipo de peça:\n1- Camiseta\n2- Calçado\n3- Calça");
						peca = leia.nextInt();
					} while (peca != 1 && peca != 2 && peca != 3);
					switch (peca) {
					case 1 -> {
						System.out.println("Digite o nome da estampa: ");
						leia.skip("\\R?");
						estampa = leia.nextLine().toLowerCase();
						produtos.atualizar(new Camiseta(id, tamanho, cor, quantidade, peca, estampa));
					}
					case 2 -> {
						System.out.println("Digite a marca: ");
						leia.skip("\\R?");
						marca = leia.nextLine().toLowerCase();
						produtos.atualizar(new Calcado(id, tamanho, cor, quantidade, peca, marca));
					}
					case 3 -> {
						System.out.println("Digite o material: ");
						leia.skip("\\R?");
						material = leia.nextLine().toLowerCase();
						produtos.atualizar(new Calca(id, tamanho, cor, quantidade, peca, material));
					}
					default -> {
						System.out.println("Peça inválida!");
					}

					}

				} else
					System.out.println("ID não encontrado!");

				keyPress();
				break;
			}
			case 5: {
				System.out.println("Deletar produtos\n");

				System.out.println("Digite o ID do produto: ");
				id = leia.nextInt();
				produtos.deletar(id);
				keyPress();
				break;
			}
			default: {
				System.out.println("Opção inválida!\n");
				keyPress();
				break;
			}
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Hardzz moda sustentável, o drip que salva!");
		System.out.println("Projeto Desenvolvido por: Vinícius");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {
		try {
			System.out.println("\n\nPressione Enter para continuar...");
			System.in.read();
		} catch (IOException e) {
		}
	}
}
