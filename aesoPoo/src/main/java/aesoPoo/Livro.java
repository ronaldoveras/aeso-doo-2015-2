package aesoPoo;

public class Livro {
	private String titulo;
	private int qtd;
	
	public Livro(String titulo, int qtd) {
		setTitulo(titulo);
		setQtd(qtd);
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public int getQtd() {
		return qtd;
	}
}
