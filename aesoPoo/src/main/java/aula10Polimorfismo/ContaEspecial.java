package aula10Polimorfismo;

public class ContaEspecial extends ContaCorrente {

	public ContaEspecial(double saldo, String numero, Cliente cliente) {
		super(saldo, numero, cliente);
	}

	@Override
	public void debitar(double valor) {
		
		double saldoDebitado = super.getSaldo() - valor;
		
		if (saldoDebitado >= LIMITE) {
			super.setSaldo(saldoDebitado);
		}
	}
	
	@Override
	public String toString() {
		return "Conta Especial: de número: " + getNumero() + " tem o cliente: " + getCliente().getNome() + " e o saldo: " + getSaldo();
	}
}
