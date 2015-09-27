package aula06Arrays;

public class TesteArray1 {

	public static void main(String[] args) {
		int[] a = {19,11,14,18};
		TesteArray1 testeArray1 = new TesteArray1();
		System.out.println("O indice do maior valor é " + testeArray1.getIndiceMaiorValor(a));
	}
	
	int getIndiceMaiorValor(int[] array){
		int maiorIndice = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] >= array[maiorIndice]){
				maiorIndice = i;
			}
		}
		return maiorIndice;
	}
}
