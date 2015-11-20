package aula12Interfaces.classesteste;

import java.util.Scanner;

import aula12Interfaces.classesbasicas.Circunferencia;
import aula12Interfaces.classesbasicas.Retangulo;


public class Teste {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o raio da Circunferência: ");
		double raio = s.nextDouble();
		
		Circunferencia c = new Circunferencia(raio);
		System.out.println("A área da circunferencia é: " + c.area());
		
		
		System.out.println("Informe a base e a altura do retângulo: ");
		double base = s.nextDouble();
		double altura = s.nextDouble();
		
		Retangulo r = new Retangulo(base, altura);
		System.out.println("A área do retângulo é: " + r.area());
	}
}
