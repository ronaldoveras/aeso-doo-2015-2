package resolucaoSegundaLista.classesBase;

public class Cliente implements ICliente {

	private String nome;
	private EstadoCivil estado;
	private String cpf;
	public static final int IDADE_APOS_HOMEM = 65;
	public static final int IDADE_APOS_MULHER = 60;
	
	public Cliente(String nome, EstadoCivil estadoCivil, String cpf) {
		this.nome = nome;
		this.estado = estadoCivil;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EstadoCivil getEstado() {
		return estado;
	}

	public void setEstado(EstadoCivil estado) {
		this.estado = estado;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void exibirCredencial() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cliente ");
		sb.append(nome);
		sb.append(" - CPF: ");
		sb.append(cpf);
	}

}
