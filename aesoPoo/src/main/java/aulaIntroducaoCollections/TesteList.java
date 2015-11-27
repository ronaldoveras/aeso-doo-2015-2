package aulaIntroducaoCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

import aula12Interfaces.classesbasicas.Retangulo;

public class TesteList {

	public static void main(String[] args) {
		List<Retangulo> lista = new ArrayList<Retangulo>();
		Retangulo r1 = new Retangulo(4, 4);
		Retangulo r2 = new Retangulo(3, 2);
		Retangulo r3 = new Retangulo(1,2);

		lista.add(r2);
		lista.add(r1);
		lista.add(r3);

		lista.sort(new Comparator<Retangulo>(){

			public int compare(Retangulo o1, Retangulo o2) {
				int logica = 0;
				if(o1.area() > o2.area()){
					logica = 1;
				} else if(o1.area() < o2.area()){
					logica = -1;
				}
				
				return logica;
			}
			
		});
		
		for (Retangulo retangulo : lista) {
			System.out.println(retangulo.area());
		}
		
		
		
		
//		for (Retangulo r : lista) {
//			System.out.println(r.area());
//		}
		
//		ListIterator<Retangulo> iterator = lista.listIterator();
//		while(iterator.hasNext()){
//			Retangulo r = iterator.next();
//			System.out.println(r.area());
//		}
		
		
	}

}
