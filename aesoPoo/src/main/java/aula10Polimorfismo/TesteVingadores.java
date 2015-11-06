package aula10Polimorfismo;

public class TesteVingadores {

	public static void main(String[] args) {
		Vingador vingador = new IronMan();
		if(vingador instanceof IronMan){
			((IronMan)vingador).imprimir();
		} else {
			System.out.println("Cast errado!");
		}
	}

}
