package aula13Excecoes;

public class TesteExcecoes {

	public static void main(String[] args) throws StringIndexOutOfBoundsException, NullPointerException{
		String str1 = "aa";
		try{
			metodo(str1);
		} catch(PosicaoInvalidaException e){
			System.out.println(e.getMessage());
		}
	}
	
	static void metodo(String s) throws PosicaoInvalidaException{
		try{
			System.out.println(s.charAt(4));
		} catch (StringIndexOutOfBoundsException e){
			throw new PosicaoInvalidaException();
			
		} catch(NullPointerException e){
			throw new PosicaoInvalidaException();
			
		} finally{
			System.out.println("Programa terminou");
		}
	}
 }

