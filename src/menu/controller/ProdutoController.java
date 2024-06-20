package menu.controller;

import java.util.ArrayList;
import menu.model.Produto;
import menu.repository.ProdutoRepository;
import menu.util.Cores;

public class ProdutoController implements ProdutoRepository {
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0;

	@Override
	public void listarTodos() {
		if (listaProdutos.isEmpty()) {
			System.out.println("O estoque está vazio!");

		} else {

			for (var produto : listaProdutos) {
				produto.visualizar();
			}
		}
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.printf("O produto ID %d foi cadastrado com sucesso!\n", produto.getId());
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaId = buscarNoEstoque(produto.getId());

		if (buscaId != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaId), produto);
			System.out.printf("\nO produto ID %d foi atualizado com sucesso!", produto.getId());
		} else
			System.out.printf("\nO produto ID %d não foi localizado!", produto.getId());

	}

	@Override
	public void deletar(int id) {
		var produto = buscarNoEstoque(id);

		if (produto != null) {
			if (listaProdutos.remove(produto))
				System.out.println("\nA conta número " + id + " foi deletada com sucesso!");

		} else
			System.out.println("\nA conta número " + id + " não foi encontrada!");
	}


	public Produto buscarNoEstoque(int id) {
		for (var produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}

	@Override
	public void buscaIDs() {
		for(var produto:listaProdutos) {
			System.out.println((Cores.TEXT_YELLOW_BOLD+produto.getId()+ Cores.TEXT_PURPLE_BOLD));
		}
		
	}
	public boolean vazio() {
		if (listaProdutos.isEmpty()) {
			return false;
		}
		return true;
	}

}
