package aesoPoo;

public class TesteReferencia {

	public static void main(String[] args) {
		Livro l1 = new Livro("Dom Casmurro", 234);
		Livro l2 = new Livro("Dom Casmurro", 234);
		Livro l3 = new Livro("Dom Casmurro", 234);
		
		if (l2 == l1) {
		    System.out.println("Linha 1");
		}
		if(l2.equals(l3)){
			System.out.println("Linha 2");
		}
		// e agora?
		l1 = l3;
		if (l1 == l3) {
		    System.out.println("Linha 3");
		}
		
		if(l1.equals(l3)){
			System.out.println("Linha 4");
		}
	}

}
