package util;

public enum Situacao {

	AGUARDANDO("Aguardando Informa��es"), PROCESSAMENTO("Em processamento");

	private String situacao;

	Situacao(String situacao) {
		this.situacao = situacao;
	}

	public String getSituacao() {
		return situacao;
	}

}
