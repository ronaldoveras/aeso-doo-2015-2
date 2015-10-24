package aula09Heranca;

public class TesteConta {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Ronaldo", "0000000000");
		Cliente cliente2 = new Cliente("Veronica", "999999999");
		ContaCorrente conta = new ContaCorrente(1500.0, "2432-X", cliente1);
		System.out.println(conta);
		
		conta.creditar(50.0);
		conta.debitar(40.0);
		
		System.out.println(conta);
		
		Poupanca poupanca = new Poupanca(30000.00, "5643-x", cliente2);
		System.out.println(poupanca);
		poupanca.creditar(1000.00);
		poupanca.debitar(1000.00);
		poupanca.renderJuros(0.1);
		
		System.out.println(poupanca);
		

	}

}
