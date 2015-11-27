package aula13Excecoes;

public class PosicaoInvalidaException extends Exception {
	
	public PosicaoInvalidaException() {
		super("Houve um erro de posicionamento");
	}
}
