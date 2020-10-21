package aplicacao;

import java.util.List;

public class Item {

	private int quantidade;
	private String cor;
	private double precoUnitario;
	private List<Peca> peca;
	private List<Fornecedor> fornecedorPeca;
	private double valorItem = (quantidade * precoUnitario);

	public Item(int quantidade, String cor, double precoUnitario, List<Peca> peca, List<Fornecedor> fornecedorPeca) {
		super();
		this.quantidade = quantidade;
		this.cor = cor;
		this.precoUnitario = precoUnitario;
		this.peca = peca;
		this.fornecedorPeca = fornecedorPeca;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public List<Peca> getPeca() {
		return peca;
	}

	public void setPeca(List<Peca> peca) {
		this.peca = peca;
	}

	public List<Fornecedor> getFornecedorPeca() {
		return fornecedorPeca;
	}

	public void setFornecedorPeca(List<Fornecedor> fornecedorPeca) {
		this.fornecedorPeca = fornecedorPeca;
	}

	public double getValorItem() {
		return valorItem;
	}
}