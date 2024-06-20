package menu.model;

public class Camiseta extends Produtos {

	private String estampa;

	public Camiseta(char tamanho, String cor, String marca, int quantidade, String estampa) {
		super(tamanho, cor, quantidade);
		this.estampa = estampa;
	}

	public String getEstampa() {
		return estampa;
	}

	public void setEstampa(String estampa) {
		this.estampa = estampa;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Estampa: " + this.estampa);
	}

}
