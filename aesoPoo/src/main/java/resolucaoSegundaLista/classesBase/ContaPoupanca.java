package resolucaoSegundaLista.classesBase;

import resolucaoSegundaLista.excecoes.ClienteNaoEncontradoException;

public class ContaPoupanca extends ContaBancaria {

	public ContaPoupanca(String numero, double saldo, ICliente cliente) {
		super(numero, saldo, cliente);
	}

	@Override
	public void exibeLocalCliente(String cpf) throws ClienteNaoEncontradoException {
		String cpfCliente = ((Cliente)getCliente()).getCpf();
		if(cpf != null && cpf.equalsIgnoreCase(cpfCliente)){
			System.out.println("O cliente de CPF: " + cpf + " tem uma conta poupanca.");
		} else {
			throw new ClienteNaoEncontradoException();
		}
		
	}

}
