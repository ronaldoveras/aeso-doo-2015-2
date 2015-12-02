package resolucaoSegundaLista;

import resolucaoSegundaLista.classesBase.Cliente;
import resolucaoSegundaLista.classesBase.ContaBancaria;
import resolucaoSegundaLista.classesBase.ContaCorrente;
import resolucaoSegundaLista.classesBase.ContaPoupanca;
import resolucaoSegundaLista.classesBase.EstadoCivil;
import resolucaoSegundaLista.classesBase.ICliente;
import resolucaoSegundaLista.excecoes.ClienteNaoEncontradoException;

public class TesteExercicio {
	public static void main(String[] args) {
		ICliente cliente = new Cliente("João", EstadoCivil.SOLTEIRO, "055-113");
		ContaBancaria conta = new ContaCorrente("4234325", 100.0, cliente);

		ICliente novoCliente = new Cliente("Paulo", EstadoCivil.CASADO, "055-991");
		ContaBancaria poupanca = new ContaPoupanca("42343267", 100.0, novoCliente);
		
		String cpf = "055-113";
		try {
			conta.exibeLocalCliente(cpf);
			poupanca.exibeLocalCliente("055-9913");
		} catch (ClienteNaoEncontradoException e) {
			System.out.println("O Cliente de cpf: " + cpf + " não foi encontrado");
		}
	}
}