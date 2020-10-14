package aplicacao;

public class Elevador {

	private int id;
	private int andarAtual;
	private boolean ligado;
	private boolean prioritario;

	public Elevador(int id, int andarAtual, boolean ligado, boolean prioritario) {

		this.id = id;
		this.andarAtual = andarAtual;
		this.ligado = ligado;
		this.prioritario = prioritario;
	}

	public int getId() {
		return id;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public boolean isLigado() {
		return ligado;
	}

	public boolean isPrioritario() {
		return prioritario;
	}

	public void ligar() {
		this.ligado = true;
	}

	public void desligar() {
		this.ligado = false;
	}

	public void ativarPrioridade() {
		this.prioritario = true;
	}

	public void desativarPrioridade() {
		this.prioritario = false;
	}

	public float calcularEsforco(int andarDestino) {
		return andarDestino;
	}

}
