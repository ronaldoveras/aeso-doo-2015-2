package aula09Heranca;

public class EBook extends Livro {

	@Override
	public double obterDesconto() {
		return getPrecoLivro() * (0.2);
	}
	
	@Override
	public String toString() {
		return "EBook: " + getNomeLivro() + ", Autor: " + getNomeAutor() + ", Preço: " 
				+ getPrecoLivro();
	}
}
