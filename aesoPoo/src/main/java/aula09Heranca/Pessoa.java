package aula09Heranca;

public class Pessoa {

	//Definição dos atributos
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	/*
	 * Construtor para inicializar os atributos. 
	 * Sempre após os atributos.
	 */
	public Pessoa(String nome, int idade, double altura, double peso) {
		setNome(nome);
		setIdade(idade);
		setAltura(altura);
		setPeso(peso);
	}
	
	public Pessoa() {
	}
	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public int getIdade() {
		return idade;
	}




	public void setIdade(int idade) {
		this.idade = idade;
	}




	public double getAltura() {
		return altura;
	}




	public void setAltura(double altura) {
		this.altura = altura;
	}




	public double getPeso() {
		return peso;
	}




	public void setPeso(double peso) {
		this.peso = peso;
	}




	public void converterParaString(){
		System.out.println("Pessoa " + nome + " com idade " + idade + " de altura " + altura + " com peso igual a " + peso );
	}
	
	public boolean isMaior(Pessoa p){
		boolean retorno = false;
		if(this.idade > p.idade){
			retorno = true;
		}
		return retorno; 
	}

	@Override
	public String toString() {
		return this.getNome() + " " + this.getAltura();
	}
}
