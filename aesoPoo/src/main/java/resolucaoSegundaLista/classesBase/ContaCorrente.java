package resolucaoSegundaLista.classesBase;

import resolucaoSegundaLista.excecoes.ClienteNaoEncontradoException;

public class ContaCorrente extends ContaBancaria {

	public ContaCorrente(String numero, double saldo, ICliente cliente) {
		super(numero, saldo, cliente);
	}

	@Override
	public void exibeLocalCliente(String cpf) throws ClienteNaoEncontradoException {
		String cpfCliente = ((Cliente)getCliente()).getCpf();
		if(cpf != null && cpf.equalsIgnoreCase(cpfCliente)){
			System.out.println("O cliente de CPF: " + cpf + " tem uma conta corrente.");
		} else {
			throw new ClienteNaoEncontradoException();
		}

	}

}
