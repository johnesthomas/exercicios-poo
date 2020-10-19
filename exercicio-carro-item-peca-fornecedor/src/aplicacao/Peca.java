package aplicacao;

public class Peca {

	private int codigo;
	private String descricao;

	public Peca(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
}