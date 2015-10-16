package aula08Enumeracoes;


public enum TipoDeDocumento {

    RG("RG - Registro...", null), // sem formatador
    CPF("CPF - Cadastro...", new FormatadorDeCpf()),
    CNPJ("CNPJ - Cadastro...", new FormatadorDeCnpj());

    private String descricao;
    private Formatador formatador;

    private TipoDeDocumento(String descricao, Formatador formatador) {
        this.descricao = descricao;
        this.formatador = formatador;
    }

    /**
     * Formata número do documento
     */
    public String formata(String numero) {
        if (this.formatador == null) {
            return numero;
        }
        return this.formatador.formata(numero);
    }
    
    public String getDescricao() {
		return descricao;
	}
    
    public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}


