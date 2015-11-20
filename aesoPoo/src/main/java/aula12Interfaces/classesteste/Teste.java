package aula12Interfaces.classesteste;

import java.util.Scanner;

import aula12Interfaces.classesbasicas.Circunferencia;
import aula12Interfaces.classesbasicas.Retangulo;


public class Teste {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o raio da Circunfer�ncia: ");
		double raio = s.nextDouble();
		
		Circunferencia c = new Circunferencia(raio);
		System.out.println("A �rea da circunferencia �: " + c.area());
		
		
		System.out.println("Informe a base e a altura do ret�ngulo: ");
		double base = s.nextDouble();
		double altura = s.nextDouble();
		
		Retangulo r = new Retangulo(base, altura);
		System.out.println("A �rea do ret�ngulo �: " + r.area());
	}
}
