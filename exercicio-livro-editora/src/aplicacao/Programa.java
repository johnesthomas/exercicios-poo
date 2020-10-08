package aplicacao;

public class Programa {

	public static void main(String[] args) {

		Editora editora = new Editora(10, "Saraiva", "editora@saraiva.com", "81 3333-8000");

		Livro livro = new Livro(201, "Programação em Java", "978-85-7785-545-2", editora);

		imprimirLivro(livro, editora);

	}

	public static void imprimirLivro(Livro livro, Editora editora) {

		System.out.println("Dados do livro:");
		System.out.println("Código: " + livro.getCodigo());
		System.out.println("Título: " + livro.getTitulo());
		System.out.println("ISBN: " + livro.getISBN());
		System.out.println("Editora: " + editora.getRazaoSocial());
	}
}