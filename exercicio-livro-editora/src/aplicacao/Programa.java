package aplicacao;

public class Programa {

	public static void main(String[] args) {

		Editora editora = new Editora(10, "Saraiva", "editora@saraiva.com", "81 3333-8000");

		Livro livro = new Livro(201, "Programa��o em Java", "978-85-7785-545-2", editora);

		imprimirLivro(livro, editora);

	}

	public static void imprimirLivro(Livro livro, Editora editora) {

		System.out.println("Dados do livro:");
		System.out.println("C�digo: " + livro.getCodigo());
		System.out.println("T�tulo: " + livro.getTitulo());
		System.out.println("ISBN: " + livro.getISBN());
		System.out.println("Editora: " + editora.getRazaoSocial());
	}
}