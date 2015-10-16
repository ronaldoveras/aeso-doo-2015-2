package aula08Enumeracoes;

public class TesteDocumento {
	public static void main(String[] args) {
		Documento doc = new Documento();
		doc.setTipo(TipoDeDocumento.CPF);
		doc.setNumero("00089077761");
		System.out.println(doc.formata());
	}
}
