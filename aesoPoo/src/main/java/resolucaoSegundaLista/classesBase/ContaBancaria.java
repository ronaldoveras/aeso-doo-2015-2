package resolucaoSegundaLista.classesBase;

import resolucaoSegundaLista.excecoes.ClienteNaoEncontradoException;

public abstract class ContaBancaria {
	private String numero;
	private double saldo;
	private ICliente cliente;

	public ContaBancaria(String numero, double saldo, ICliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ICliente getCliente() {
		return cliente;
	}

	public void setCliente(ICliente cliente) {
		this.cliente = cliente;
	}

	public abstract void exibeLocalCliente(String cpf) throws ClienteNaoEncontradoException;
}
