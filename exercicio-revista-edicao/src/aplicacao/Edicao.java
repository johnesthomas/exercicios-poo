package aplicacao;

import java.util.Date;

public class Edicao {

	private int num;
	private Date data;
	private int tiragem; // numero de exemplares impressos
	private int vendidas;
	private boolean reciclagemAtualizada;

	public Edicao() {
	}

	public Edicao(int num, Date data, int tiragem, int vendidas) {
		this.num = num;
		this.data = data;
		this.tiragem = tiragem;
		this.vendidas = vendidas;
		this.reciclagemAtualizada = false;
	}

	public int getNum() {
		return num;
	}

	public Date getData() {
		return data;
	}

	public int getTiragem() {
		return tiragem;
	}

	public int getVendidas() {
		return vendidas;
	}

	public boolean isReciclagemAtualizada() {
		return reciclagemAtualizada;
	}

	public int qtdeRecicladas() {
		return tiragem - vendidas;
	}
}
