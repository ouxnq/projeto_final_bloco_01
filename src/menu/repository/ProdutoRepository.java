package menu.repository;
import menu.model.Produtos;

public interface ProdutoRepository {

	public void procurarPorNumero(int numero);

	public void listarTodos();

	public void cadastrar(Produtos produto);

	public void atualizar(Produtos produto);

	public void deletar(int numero);
}
