package aplicacao;

public class Produto {

	private static int identity;
	
	private int codigo;
	private String descricao;
	private float precoVenda;
	private float aliquotaICMS;
	private boolean vendido;
	
	public Produto() {		
	}	

	public Produto(String descricao, float precoVenda, float aliquotaICMS) {
		this.codigo = gerarIdentity();
		this.descricao = descricao;
		this.precoVenda = precoVenda;
		this.aliquotaICMS = aliquotaICMS;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public float getAliquotaICMS() {
		return aliquotaICMS;
	}

	public boolean isVendido() {
		return vendido;
	}

	public float calcularICMS() {
		return precoVenda * (aliquotaICMS / 100);
	}

	public void confirmarVenda() {
		this.vendido = true;
	}
	
	private int gerarIdentity() {
		return ++identity;
	}

}
