package aplicacao;

public class Fornecedor {

	private String cnpj;
	private String razaoSocial;

	public Fornecedor(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
}