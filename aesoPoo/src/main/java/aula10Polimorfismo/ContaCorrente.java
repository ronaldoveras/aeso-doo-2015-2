package aula10Polimorfismo;

public class ContaCorrente {

	private double saldo;
	private String numero;
	private Cliente cliente;
	public static final double LIMITE = -1000.0;
	
	public ContaCorrente(double saldo, String numero, Cliente cliente) {
		this.saldo = saldo;
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void debitar(double valor) {
		
		if (this.saldo > valor) {
			this.saldo = this.saldo - valor;
		}
	}
	
	public void creditar(double valor) {
		this.saldo = this.saldo + valor; 
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean retorno = false;
		
		if (obj instanceof ContaCorrente) {
			ContaCorrente contaCorrenteObj = (ContaCorrente) obj;
			if (this.numero.equals(contaCorrenteObj.numero)) {
				retorno = true;
			}
		}
		
		return retorno;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente: de número: " + numero + " tem o cliente: " + cliente.getNome() + " e o saldo: " + saldo;
	}
}
