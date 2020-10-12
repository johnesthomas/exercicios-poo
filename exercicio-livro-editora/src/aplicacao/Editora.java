package aplicacao;

public class Editora {

	private int codigo;
	private String razaoSocial;
	private String contato;
	private String telefone;

	public Editora(int codigo, String razaoSocial, String contato, String telefone) {
		this.codigo = codigo;
		this.razaoSocial = razaoSocial;
		this.contato = contato;
		this.telefone = telefone;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getContato() {
		return contato;
	}

	public String getTelefone() {
		return telefone;
	}
}