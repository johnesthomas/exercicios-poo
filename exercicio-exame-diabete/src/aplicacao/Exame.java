package aplicacao;

public class Exame {

	private Integer idExame;
	private String tipoExame;
	private Integer nivelGlicose;

	public Exame() {
	}

	public Exame(Integer idExame, String tipoExame, Integer nivelGlicose) {
		this.idExame = idExame;
		this.tipoExame = tipoExame;
		this.nivelGlicose = nivelGlicose;
	}

	public Integer getIdExame() {
		return idExame;
	}

	public String getTipoExame() {
		return tipoExame;
	}

	public String obterDiagnostico() {

		String diagnostico = "";

		if (nivelGlicose < 99) {
			diagnostico = "Normal";

		} else if (nivelGlicose >= 100 && nivelGlicose <= 125) {
			diagnostico = "Pré-diabetes";

		} else {
			diagnostico = "Diabetes";

		}
		return diagnostico;
	}
}
