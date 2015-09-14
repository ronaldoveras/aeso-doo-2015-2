package aesoPoo;

public class ContaBancaria {

	public String nomeBanco;
	public String conta;
	public double saldo;
	
	public void converterParaString(){
		System.out.println("Nome do banco " + nomeBanco + " conta " + conta 
				+ " com saldo igual a " + saldo);
	}

}
