package menu.model;

import menu.util.Cores;

public abstract class Produto {
	private int id;
	private char tamanho;
	private String cor;
	private int quantidade;
	private int peca;

	public Produto(int id, char tamanho, String cor, int quantidade, int peca) {
		this.id = id;
		this.tamanho = tamanho;
		this.cor = cor;
		this.quantidade = quantidade;
		this.peca = peca;

	}

	public int getPeca() {
		return peca;
	}

	public void setPeca(int peca) {
		this.peca = peca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		String tipo = "";
		switch (this.peca) {
		case 1:
			tipo = "Camiseta";
			break;
		case 2:
			tipo = "Calçado";
			break;
		case 3:
			tipo = "Calça";
			break;
		}
		System.out.println(Cores.TEXT_GREEN_BOLD +"\n\n***********************************************************");
		System.out.println(Cores.TEXT_PURPLE_BOLD +"Dados do produto:");
		System.out.println(Cores.TEXT_GREEN_BOLD +"***********************************************************");
		System.out.println(Cores.TEXT_PURPLE_BOLD +"ID do produto: "+Cores.TEXT_YELLOW_BOLD + this.id);
		System.out.println(Cores.TEXT_PURPLE_BOLD +"Peça: "+Cores.TEXT_YELLOW_BOLD  + tipo);
		System.out.println(Cores.TEXT_PURPLE_BOLD +"Tamanho: "+Cores.TEXT_YELLOW_BOLD + this.tamanho);
		System.out.println(Cores.TEXT_PURPLE_BOLD +"Cor: "+Cores.TEXT_YELLOW_BOLD + this.cor);
		System.out.println(Cores.TEXT_PURPLE_BOLD +"Quantidade: "+Cores.TEXT_YELLOW_BOLD + this.quantidade);

	}

}
