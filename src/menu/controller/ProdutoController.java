package menu.controller;

import java.util.ArrayList;
import menu.model.Produto;
import menu.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0;

	@Override
	public void procurarPorNumero(int id) {
		var produto = buscarNoEstoque(id);
		if (produto != null) {
			produto.visualizar();
		} else {
			System.out.printf("O ID %d não foi localizado no estoque", id);
		}
	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.printf("O produto ID %d foi cadastrado com sucesso!", produto.getId());
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

	public int gerarId() {
		return ++id;
	}

	public Produto buscarNoEstoque(int id) {
		for (var conta : listaProdutos) {
			if (conta.getId() == id) {
				return conta;
			}
		}
		return null;
	}

}
