package aesoPoo;

import java.util.Scanner;

public class ExecutaExercicio {

	public static void main(String[] args) {
		Scanner scannerPessoa = new Scanner(System.in);
		synchronized (scannerPessoa) {
			Pessoa p = new Pessoa();
			preencherPessoa(scannerPessoa, p);
			p.converterParaString();
			//finalizarScanner(scannerPessoa);
		}	
			
		
		Scanner scannerCarro = new Scanner(System.in);
		synchronized (scannerCarro) {
			Carro c = new Carro();
			preencherCarro(scannerCarro, c);
			c.converterParaString();
			//finalizarScanner(scannerCarro);
		}
		Scanner scannerConta = new Scanner(System.in);
		synchronized (scannerConta) {
			ContaBancaria cb = new ContaBancaria();
			preencherContaBancaria(scannerConta, cb);
			cb.converterParaString();
			//finalizarScanner(scannerConta);
		}
		

	}

	private static void preencherContaBancaria(Scanner scannerConta, ContaBancaria cb) {
		System.out.println("Digite o nome do banco: ");
		cb.nomeBanco = scannerConta.nextLine();
		System.out.println("Digite a numero da conta: ");
		cb.conta = scannerConta.nextLine();
		System.out.println("Digite o saldo da conta: ");
		cb.saldo = scannerConta.nextDouble();
		
	}

	private static void preencherPessoa(Scanner scannerPessoa, Pessoa p) {
		System.out.println("Digite o nome da pessoa: ");
		p.nome = scannerPessoa.nextLine();
		System.out.println("Digite a idade da pessoa: ");
		p.idade = scannerPessoa.nextInt();
		System.out.println("Digite a altura da pessoa: ");
		p.altura = scannerPessoa.nextDouble();
		System.out.println("Digite a peso da pessoa: ");
		p.peso = scannerPessoa.nextDouble();
	}

	private static void preencherCarro(Scanner scannerPessoa, Carro c) {
		System.out.println("Digite o nome do carro: ");
		c.nome = scannerPessoa.nextLine();
		System.out.println("Digite a marca do carro: ");
		c.marca = scannerPessoa.nextLine();
		System.out.println("Digite o modelo do carro: ");
		c.modelo = scannerPessoa.nextLine();
		System.out.println("Digite o ano do carro: ");
		c.ano = scannerPessoa.nextInt();
	}

	private static void finalizarScanner(Scanner scannerPessoa) {
		scannerPessoa.close();
		scannerPessoa = null;
	}

}
