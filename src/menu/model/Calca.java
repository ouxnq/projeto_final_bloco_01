package menu.model;

import menu.util.Cores;

public class Calca extends Produto {

	private String material;

	public Calca(int id, char tamanho, String cor, int quantidade, int peca, String material) {
		super(id, tamanho, cor, quantidade, peca);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(Cores.TEXT_PURPLE_BOLD +"Material: "+Cores.TEXT_YELLOW_BOLD + this.material+ Cores.TEXT_PURPLE_BOLD);
	}

}
