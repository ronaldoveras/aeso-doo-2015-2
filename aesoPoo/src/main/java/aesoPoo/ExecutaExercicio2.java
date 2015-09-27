package aesoPoo;

public class ExecutaExercicio2 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Marcos", 45, 1.76, 68);
		Pessoa p2 = new Pessoa("Karla", 25, 1.55, 56);
		
		System.out.println(p1.isMaior(p2));
		System.out.println(p2.isMaior(p1));
	}

}
