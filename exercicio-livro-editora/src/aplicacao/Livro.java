package aplicacao;

import java.util.List;

public class Livro {
	
	private int codigo;
	private String titulo;
	private String ISBN;
	private Editora editora;
	private List<Autor> autores;

	public Livro(int codigo, String titulo, String iSBN, Editora editora, List<Autor> autores) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.ISBN = iSBN;
		this.editora = editora;
		this.autores = autores;
	}

	public Livro() {		
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

	public List<Autor> getAutores() {
		return autores;
	}
}