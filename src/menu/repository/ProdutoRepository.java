package menu.repository;

import menu.model.Produto;

public interface ProdutoRepository {


	public void listarTodos();

	public void cadastrar(Produto produto);

	public void atualizar(Produto produto);

	public void deletar(int id);
	
	public void buscaIDs();
}
