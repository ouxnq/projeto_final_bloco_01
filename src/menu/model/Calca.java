package menu.model;

public class Calca extends Produtos {

	private String material;

	public Calca(char tamanho, String cor, int quantidade, String material) {
		super(tamanho, cor, quantidade);
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
		System.out.println("Material: " + this.material);
	}

}
