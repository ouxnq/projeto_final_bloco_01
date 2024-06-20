package menu.model;

import menu.util.Cores;

public class Camiseta extends Produto {

	private String estampa;

	public Camiseta(int id, char tamanho, String cor, int quantidade, int peca, String estampa) {
		super(id, tamanho, cor, quantidade, peca);
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
		System.out.println(Cores.TEXT_PURPLE_BOLD +"Estampa: "+Cores.TEXT_YELLOW_BOLD + this.estampa+ Cores.TEXT_PURPLE_BOLD);
	}

}
