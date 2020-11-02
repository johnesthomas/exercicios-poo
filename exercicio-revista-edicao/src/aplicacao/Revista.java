package aplicacao;

public class Revista {

	private int codigo;
	private String titulo;
	private Edicao edicoes[] = new Edicao[1];
	private int reciclagemProduzida;

	public Revista() {
	}

	public Revista(int codigo, String titulo) {
		this.codigo = codigo;
		this.titulo = titulo;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public Edicao[] getEdicoes() {
		return edicoes;
	}

	public int getReciclagemProduzida() {
		return reciclagemProduzida;
	}

	public void adicionaEdicao(Edicao edicoes) {
		this.edicoes[0] = edicoes;
	}

	public void removeEdicao(Edicao edicoes) {
		this.edicoes = null;
	}
	
	public void incrementarReciclagemProduzida(int incremento) {
		this.reciclagemProduzida = incremento;
	}
}