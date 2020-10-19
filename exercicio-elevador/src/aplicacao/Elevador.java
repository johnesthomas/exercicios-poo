package aplicacao;

public class Elevador {

	private int id;
	private int andarAtual;
	private boolean ligado;
	private boolean prioritario;

	public Elevador(int id) {
		this.id = id;
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

	public void ligarDesligar() {
		this.ligado = !this.ligado;
	}

	public void ativarPrioridade() {
		this.prioritario = true;
	}

	public void desativarPrioridade() {
		this.prioritario = false;
	}

	public float calcularEsforco(int andarDestino) {
		float esforco = 0;
		
		if(this.andarAtual < andarDestino) {
			//subir
			esforco = (andarDestino - andarAtual) * 1.25f;
		} else if (this.andarAtual > andarDestino){
			//descer
			esforco = andarAtual - andarDestino;
		}		
		return esforco;
	}
}