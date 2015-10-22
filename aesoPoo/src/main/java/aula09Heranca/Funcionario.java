package aula09Heranca;

public class Funcionario extends Pessoa {

	
	private String numMatricula;

	public Funcionario(String nome, int idade, double altura, double peso, String numeroMat)
	{
		super(nome, idade, altura, peso);
		this.setNumMatricula(numeroMat);
		
	}
	public String getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}
	
	@Override
	public String toString() {
		return super.toString() + " ----- " + getNumMatricula();
	}
	
}
