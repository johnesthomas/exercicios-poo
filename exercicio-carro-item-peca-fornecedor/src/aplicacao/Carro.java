package aplicacao;

import java.util.List;

public class Carro {

	private String marca;
	private String modelo;
	private String chassi;
	private String anoFabricacao;
	private double precoCusto;
	private List<Item> item;

	public Carro(String marca, String modelo, String chassi, String anoFabricacao) {
		this.marca = marca;
		this.modelo = modelo;
		this.chassi = chassi;
		this.anoFabricacao = anoFabricacao;		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}
}