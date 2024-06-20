package menu.model;

public class Tenis extends Produtos {

	private String marca;

	public Tenis(char tamanho, String cor, int quantidade, String marca) {
		super(tamanho, cor, quantidade);
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
