package aula08Enumeracoes;

public class Documento {

    private String numero;
    private TipoDeDocumento tipo; 

    public String formata() {
        switch (tipo) { // switch também suporta enums
            case RG:
                return this.numero;
            case CPF:
                return new FormatadorDeCpf().formata(this.numero);
            case CNPJ:
                return new FormatadorDeCnpj().formata(this.numero);
            default:
                return null;
        }
    }
    
    public void setNumero(String numero) {
		this.numero = numero;
	}
    public String getNumero() {
		return numero;
	}
    public void setTipo(TipoDeDocumento tipo) {
		this.tipo = tipo;
	}
    public TipoDeDocumento getTipo() {
		return tipo;
	}
}
