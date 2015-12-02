package aulaextraJava8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TesteJava8 {

	public static void main(String[] args) {
		
		//Interfaces com implementações de métodos
		ICliente cliente = new Cliente();
		cliente.imprimirNomePadrao();
		
		//Trabalhando com datas (JSR 310) java.time
		//http://www.joda.org/joda-time/
		LocalDate homemNoEspaco = LocalDate.of(1961, Month.APRIL, 12);
		LocalDate homemNaLua = LocalDate.of(1969, Month.MAY, 25);
		 
		Period periodo = Period.between(homemNoEspaco, homemNaLua);
		 
		System.out.printf("%s anos, %s mês e %s dias \n",
		  periodo.getYears() , periodo.getMonths(), periodo.getDays());
		  //8 anos, 1 mês e 13 dias
		
		//Lambda
		List<Integer> lista = Arrays.asList(1,7,3,4,9,2); //Classes de tipos inteiros
		lista.sort((e1, e2) -> e1.compareTo(e2));
		
		for (Integer valor : lista) {
			System.out.println("Valor: " + valor);
		}
		
		lista.forEach(System.out::println);
		
		lista.sort((e1, e2) -> e1.compareTo(e2));
		
		Stream<Integer> stream = lista.stream();
		System.out.println("Soma igual: " + stream.map(e -> e * 100).reduce((e1,e2) -> e1 + e2).get());

		//Ferramentas Eclispe/Netbeans/JIdea
		//https://www.jetbrains.com/idea/
		//https://netbeans.org/
		
		//Plataformas
		//http://www.oracle.com/technetwork/java/javaee/overview/index.html
		//http://www.oracle.com/technetwork/java/embedded/javame/index.html

	}
}
