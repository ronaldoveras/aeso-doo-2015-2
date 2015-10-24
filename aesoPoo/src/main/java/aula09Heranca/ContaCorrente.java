package aula09Heranca;

public class ContaCorrente {
	private double saldo;
	private String numero;
	private Cliente cliente;
	
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
	
	public void creditar(double valor){
		this.setSaldo(this.getSaldo() + valor);
	}
	
	public void debitar(double valor){
		if(getSaldo() > valor){
			this.setSaldo(getSaldo() - valor);  
		}
	}
	
	@Override
	public String toString() {
		return "Cliente " + getCliente().getNome() + "- Saldo: " + getSaldo();
	}
}
