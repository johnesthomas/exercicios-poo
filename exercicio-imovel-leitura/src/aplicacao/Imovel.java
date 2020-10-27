package aplicacao;

public class Imovel {

	private int id;
	private String endereco;
	private char tipo; // tipo do im�vel, podendo ser C para comercial, I para industrial ou R para
						// residencial
	private int ultimaLeitura; // �ltima leitura realizada para o im�vel. Ver m�todo atualizarLeitura()
	private int consumo; // �ltimo consumo. Ver m�todo calcularConsumo().
	private float valorConta; // valor da conta. Ver m�todo calcularConta()

	public Imovel() {
	}

	public Imovel(int id, String endereco, char tipo, int ultimaLeitura) {
		this.id = id;
		this.endereco = endereco;
		this.tipo = tipo;
		this.ultimaLeitura = ultimaLeitura;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getUltimaLeitura() {
		return ultimaLeitura;
	}

	public int getConsumo() {
		return consumo;
	}

	public float getValorConta() {
		return valorConta;
	}

	public int calcularConsumo(int leituraAtual) {
		this.consumo = leituraAtual - ultimaLeitura;
		return consumo;

	}

	public float calcularConta() {
		float kwh = 0;
		if (tipo == 'c') {
			kwh = 0.70f;
		} else if (tipo == 'i') {
			kwh = 0.40f;
		} else if (tipo == 'r') {
			kwh = 0.50f;
		}	
		this.valorConta = (consumo * kwh);
		return (consumo * kwh);
	}

	public void atualizarLeitura(int leituraAtual) {
		this.ultimaLeitura = leituraAtual;
	}
}