package menu.model;

public class Calcado extends Produto {

	private String marca;

	public Calcado(int id, char tamanho, String cor, int quantidade, int peca, String marca) {
		super(id, tamanho, cor, quantidade, peca);
		this.marca = marca;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Marca: " + this.marca);
	}
}
