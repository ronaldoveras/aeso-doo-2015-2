package aulaRevisaoUnidade1;

public class Post {

	private String texto;
	private boolean isPublico;
	private int qtdLikes;
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public boolean isPublico() {
		return isPublico;
	}
	
	public void setPublico(boolean isPublico) {
		this.isPublico = isPublico;
	}
	
	public void setQtdLikes(int qtdLikes) {
		this.qtdLikes = qtdLikes;
	}
	
	public int getQtdLikes() {
		return qtdLikes;
	}
}
