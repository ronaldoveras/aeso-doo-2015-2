package aula06Arrays;

public class TesteArray2 {

	public static void main(String[] args) {
		int[] a = {19,11,14,18};
		TesteArray2 testeArray2 = new TesteArray2();
		testeArray2.getValorVezesDois(a);
	}
	
	void getValorVezesDois(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]*2);
		}
	}

}
