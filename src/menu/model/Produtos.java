package menu.model;

public abstract class Produtos {
	private char tamanho;
	private String cor;
	private int quantidade;

	public Produtos(char tamanho, String cor, int quantidade) {
		this.tamanho = tamanho;
		this.cor = cor;
		this.quantidade=quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

	public void visualizar() {

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do produto:");
		System.out.println("***********************************************************");
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Cor: " + this.cor);
		System.out.println("Quantidade: " + this.quantidade);

	}

}
