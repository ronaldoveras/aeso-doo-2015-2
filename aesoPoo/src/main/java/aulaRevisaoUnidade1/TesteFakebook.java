package aulaRevisaoUnidade1;

public class TesteFakebook {

	public static void main(String[] args) {
		Post p1 = TesteFakebook.criarPost("Ola Mundo", true, 100);

		Post p2 = TesteFakebook.criarPost("Estou na Ilha", true, 10000);
		
		Timeline t = new Timeline();
		t.getPostagens()[0] = p1;
		t.getPostagens()[1] = p2;
		t.imprimirPostagens();

	}
	
	static Post criarPost(String texto, boolean publico, int quantidade){
		Post p1 = new Post();
		p1.setTexto(texto);
		p1.setPublico(publico);
		p1.setQtdLikes(quantidade);
		return p1;
	}

}
