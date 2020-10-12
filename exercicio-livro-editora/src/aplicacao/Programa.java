package aplicacao;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {

		Editora editora = new Editora(10, "Saraiva", "editora@saraiva.com", "81 3333-8000");
				
		Autor autor1 = new Autor(1, "Johnes Thomas", "johnes@gmail.com");
		Autor autor2 = new Autor(2, "Correia da Silva", "thomas@gmail.com");
		
		ArrayList<Autor> autores = new ArrayList<>();
		autores.add(autor1);
		autores.add(autor2);		
				
		Livro livro = new Livro(201, "Programação em Java", "978-85-7785-545-2", editora, autores);

		imprimirLivro(livro, editora, autores);

	}

	public static void imprimirLivro(Livro livro, Editora editora, ArrayList<Autor> autores) {

		System.out.println("Dados do livro:");
		System.out.println("Código: " + livro.getCodigo());
		System.out.println("Título: " + livro.getTitulo());
		System.out.println("ISBN: " + livro.getISBN());
		System.out.println("Editora: " + editora.getRazaoSocial());
		System.out.println("Autor(es): ");		
		for (Autor autor : autores) {
			System.out.println(autor.getNome());
		}
	}
}