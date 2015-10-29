package aula09Heranca;

public class Livro {
	
	private String nomeLivro;
	private String nomeAutor;
	private double precoLivro;
	
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public double getPrecoLivro() {
		return precoLivro;
	}
	public void setPrecoLivro(double precoLivro) {
		this.precoLivro = precoLivro;
	}
	
	public double obterDesconto(){
		return getPrecoLivro() * (0.1);
	}
	
	@Override
	public String toString() {
		return "Livro Físico: " + getNomeLivro() + ", Autor: " + getNomeAutor() + ", Preço: " 
				+ getPrecoLivro(); 
	}

}
