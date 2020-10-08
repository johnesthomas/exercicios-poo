package aplicacao;

public class Livro {

	private int codigo;
	private String titulo;
	private String ISBN;
	private Editora editora;

	public Livro(int codigo, String titulo, String iSBN, Editora editora) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		ISBN = iSBN;
		this.editora = editora;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public Editora getEditora() {
		return editora;
	}
}