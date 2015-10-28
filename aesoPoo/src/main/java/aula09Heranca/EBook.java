package aula09Heranca;

public class EBook extends Livro {

	@Override
	public double obterDesconto() {
		return getPrecoLivro() * (20/100);
	}
	
	@Override
	public String toString() {
		return "EBook: " + getNomeLivro() + ", Autor: " + getNomeAutor() + ", Preço: " 
				+ getPrecoLivro() + ", Desconto: " + obterDesconto();
	}
}
