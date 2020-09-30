package aplicacao;

public class Estacionamento {

	private Integer codigo;
	private String nome;
	private String cidade;
	private Integer vagas;
	private Boolean situacao = false;
	private Double valorInicial;
	private Double valorAdicional;
	private Integer horaFranquiaInicial;

	public Estacionamento() {
	}

	public Estacionamento(Integer codigo, String nome, String cidade, Integer vagas, Double valorInicial,
			Double valorAdicional, Integer horaFranquiaInicial) {
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
		this.vagas = vagas;
		this.valorInicial = valorInicial;
		this.valorAdicional = valorAdicional;
		this.horaFranquiaInicial = horaFranquiaInicial;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}

	public Integer getVagas() {
		return vagas;
	}

	public Double getValorInicial() {
		return valorInicial;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public Integer getHoraFranquiaInicial() {
		return horaFranquiaInicial;
	}

	public Boolean getSituacao() {
		return situacao;
	}

	public void ativar() {
		this.situacao = true;
	}

	public void desativar() {
		this.situacao = false;
	}
}