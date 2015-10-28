package aula09Heranca;

public class TesteLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.setNomeLivro("Java como programar");
		livro.setNomeAutor("Deitel");
		livro.setPrecoLivro(200);
		
		System.out.println(livro);

		EBook ebook = new EBook();
		ebook.setNomeAutor("J. R. R. Tolkien");
		ebook.setNomeLivro("O Hobbit");
		ebook.setPrecoLivro(40);
		
		System.out.println(ebook);
		
	}

}
