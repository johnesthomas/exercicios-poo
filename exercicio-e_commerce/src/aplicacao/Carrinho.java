package aplicacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Carrinho {

	private static int identity;

	private int id;
	private Date data;
	private List<Produto> listaProduto = new ArrayList<Produto>();
	private int numDeItens;
	private float valorICMS;
	private float valorVenda;
	private String status;

	public Carrinho() {
		this.id = gerarIdentity();
		this.status = "Não Confirmada";
		this.data = new Date();
	}

	public int getId() {
		return id;
	}

	public Date getData() {
		return data;
	}

	public List<Produto> getProduto() {
		return listaProduto;
	}

	public int getNumDeItens() {
		return numDeItens;
	}

	public float getValorICMS() {
		return valorICMS;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public String getStatus() {
		return status;
	}

	public void insereItem(Produto p) {
		listaProduto.add(p);
		this.valorICMS += p.calcularICMS();
		this.valorVenda += p.getPrecoVenda();
	}

	public void confirmarCompra() {
		for (Produto produto : listaProduto) {
			produto.confirmarVenda();
		}
		this.status = "Confirmada";
	}

	private int gerarIdentity() {
		return ++identity;
	}
}
