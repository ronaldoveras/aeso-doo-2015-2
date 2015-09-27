package aesoPoo;

public class TesteReferencia {

	public static void main(String[] args) {
		Livro m = new Livro("Dom Casmurro", 234);
		Livro n = new Livro("Dom Casmurro", 234);
		if (n == m) {
		    System.out.println("1 - m é igual a n");
		}
		// e agora?
		n = m;
		if (n == m) {
		    System.out.println("2 - m é igual a n");
		}
	}

}
