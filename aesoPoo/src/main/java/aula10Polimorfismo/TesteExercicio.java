package aula10Polimorfismo;

import static java.lang.System.*;
public class TesteExercicio {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Jo�o", "055.6778.14");
		Cliente cliente2 = new Cliente("Maria", "355345545");
		
		ContaCorrente contaCorrente1 = new ContaCorrente(55.6, "9817", cliente2);
		ContaCorrente contaCorrente2 = new ContaCorrente(55.6, "9817", cliente2);
		Poupanca poupanca = new Poupanca(100.0, "5543", cliente);
		ContaEspecial contaEspecial = new ContaEspecial(942.8, "62678", cliente);
		
		contaEspecial.debitar(1942.9);
		out.println("Saldo Conta Especial: " + contaEspecial.getSaldo());
		if (contaCorrente1.equals(contaCorrente2)) {
			out.println("S�o iguais");
		} else {
			out.println("S�o diferentes");
		}
		
		//C�digo abaixo referente ao teste do toString()
		out.println(contaCorrente1);
		out.println(poupanca);
		out.println(contaEspecial);
	}
}
