package aula12Interfaces.classesbasicas;

public class Circunferencia implements FormaGeometrica {
	
	private double raio;
	
	public Circunferencia(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double area() {
		return 2 * Math.PI * raio;
	}
	
}
