package aesoPoo;

import org.apache.commons.lang3.StringUtils;

public class TesteString {

	public static void main(String[] args) {

			String teste1 = "Inicio de nova unidade. iamos lá.";
			String teste2 = "INICIO de nova unidade. iamos lá.";
			System.out.println(StringUtils.remove(teste1, " "));
			 if(teste1 == teste2){
				 System.out.println("1");
			 } 
			 if(teste1.equalsIgnoreCase(teste2)){
				 System.out.println("2");
			 }
			String[] frases = teste2.split("\\.");
			for (String string : frases) {
				System.out.println(string);
			}
			String email = "ronaldo@aeso.br";
			System.out.println(email.substring(email.indexOf("@"), email.length()));
	}

}
