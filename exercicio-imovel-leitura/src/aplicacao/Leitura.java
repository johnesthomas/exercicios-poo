package aplicacao;

import java.util.Date;

public class Leitura {
	
	static private int identificador;

	private int id; // Número da leitura
	private Imovel imovel; // Imóvel a que a leitura ser refere
	private int leitura; // Valor da leitura
	private Date data; // Data da leitura

	public Leitura() {
	}

	public Leitura(Imovel imovel, int leitura, Date data) {
		this.imovel = imovel;
		this.leitura = leitura;
		this.data = data;
		this.id = gerarIdentificador();;
	}

	public int getId() {
		return id;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public int getLeitura() {
		return leitura;
	}

	public void setLeitura(int leitura) {
		this.leitura = leitura;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void registrarLeitura() {		
		this.imovel.atualizarLeitura(leitura);
	}
	
	private int gerarIdentificador() {
		return ++identificador;
	}
}