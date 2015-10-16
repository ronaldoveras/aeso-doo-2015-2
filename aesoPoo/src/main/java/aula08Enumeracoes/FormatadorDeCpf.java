package aula08Enumeracoes;

import org.apache.commons.lang3.StringUtils;

public class FormatadorDeCpf extends Formatador {

	@Override
	public String formata(String numero) {
		String formatador = numero;
		StringBuilder builder = new StringBuilder();
		if(StringUtils.length(numero) == 11){
			builder.append(formatador.substring(0, 3));
			builder.append(".");
			builder.append(formatador.substring(3, 6));
			builder.append(".");
			builder.append(formatador.substring(6, 9));
			builder.append("-");
			builder.append(formatador.substring(9, 11));

			formatador = builder.toString();
		}else{
			System.out.println("Não é um CPF válido.");
		}
		return formatador;
	}
}
