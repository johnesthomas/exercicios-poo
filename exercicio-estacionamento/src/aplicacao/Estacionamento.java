package aplicacao;

public class Estacionamento {

	private Integer codigo;
	private String nome;
	private String cidade;
	private Integer vagas;
	private Boolean situacao;
	private Double valorInicial;
	private Double valorAdicional;
	private Integer horaFranquiaInicial;

	public Estacionamento() {
	}

	public Estacionamento(Integer codigo, String nome, String cidade, Integer vagas, Boolean situacao,
			Double valorInicial, Double valorAdicional, Integer horaFranquiaInicial) {
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
		this.vagas = vagas;
		this.situacao = situacao;
		this.valorInicial = valorInicial;
		this.valorAdicional = valorAdicional;
		this.horaFranquiaInicial = horaFranquiaInicial;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Integer getVagas() {
		return vagas;
	}

	public void setVagas(Integer vagas) {
		this.vagas = vagas;
	}

	public Double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(Double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public Integer getHoraFranquiaInicial() {
		return horaFranquiaInicial;
	}

	public void setHoraFranquiaInicial(Integer horaFranquiaInicial) {
		this.horaFranquiaInicial = horaFranquiaInicial;
	}

	public Boolean getSituacao() {
		return situacao;
	}

	public String ativar() {

		String situacao = "";

		if (this.situacao) {
			situacao = "Estacionamento já está ativo.";
		} else {
			this.situacao = true;
			situacao = "Ativado com sucesso.";
		}
		return situacao;
	}

	public String desativar() {

		String situacao = "";

		if (!this.situacao) {
			situacao = "Estacionamento já está desativado.";
		} else {
			this.situacao = false;
			situacao = "Desativado com sucesso.";
		}
		return situacao;
	}

	public String toString() {

		String situacaoStr;
		if (situacao == false) {
			situacaoStr = "desativado";
		} else {
			situacaoStr = "ativado";
		}

		return "Código: " + codigo + "\nNome: " + nome + "\nCidade: " + cidade + "\nVagas: " + vagas + "\nSituação: "
				+ situacaoStr + "\nValor Inicial: " + String.format("%.2f", valorInicial) + "\nValor Adicional: "
				+ String.format("%.2f", valorInicial) + "\nHora Franquia Inicial: " + horaFranquiaInicial;

	}
}