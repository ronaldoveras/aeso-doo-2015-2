package aulaextraJava8;

public interface ICliente {

	public void exibirNomeCliente();
	
	default void imprimirNomePadrao(){
		System.out.println("Eu sou um cliente padr�o");
	}
}
