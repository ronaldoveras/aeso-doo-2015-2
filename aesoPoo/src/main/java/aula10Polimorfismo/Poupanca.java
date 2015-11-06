package aula10Polimorfismo;

public class Poupanca extends ContaCorrente {

	public Poupanca(double saldo, String numero, Cliente cliente) {
		super(saldo, numero, cliente);
	}

	public void renderJuros(double taxa) {
		creditar(getSaldo() * taxa);
	}
	
	@Override
	public String toString() {
		return "Conta Poupança: de número: " + getNumero() + " tem o cliente: " + getCliente().getNome() + " e o saldo: " + getSaldo();
	}
}
