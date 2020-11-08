package aplicacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {	
	
	public static void main(String[] args) {

		Carrinho carrinho = null;
		
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		boolean WhileCondicao = false;
		int cont = 0;

		ArrayList<Produto> produtos = new ArrayList<Produto>();

		produtos.add(new Produto("CAMISA", 50, 18));
		produtos.add(new Produto("BERMUDA", 45, 18));
		produtos.add(new Produto("CHINELO", 40, 18));

		do {

			System.out.println("============================================");
			System.out.println("(1) INSERIR PRODUTOS NO CARRINHO");
			System.out.println("(2) CONFIRMAR VENDA");
			System.out.println("(3) EXIBIR VENDA");
			System.out.println("============================================");

			int key;
			key = sc.nextInt();
			sc.nextLine();

			switch (key) {
			case 1:				

				if(cont == 0) {
					carrinho = new Carrinho();
				}				
				
				System.out.println("==================PRODUTOS==================");

				for (Produto produto : produtos) {
					System.out.printf("(%d) %s - R$ %.2f %n", produto.getCodigo(), produto.getDescricao(),
							produto.getPrecoVenda());
				}
				System.out.println("============================================");
				System.out.print("ESCOLHA O PRODUTO: ");
				int codProduto = sc.nextInt();
				
				for (Produto produto : produtos) {
					if(codProduto == produto.getCodigo()) {
						if(!produto.isVendido()) {
							carrinho.insereItem(produto);
							break;
							
						} else {
							System.out.println("============================================");
							System.out.println("=============PRODUTO JÁ VENDIDO=============");
						}
					} 
				}
				
				break;

			case 2:				
				
				carrinho.confirmarCompra();

				break;

			case 3:
				
				System.out.println("============DADOS DO CARRINHO===============");
				System.out.println("ID: " + carrinho.getId());
				System.out.println("Data: " + sdf.format(carrinho.getData()));
				System.out.println("Status: " + carrinho.getStatus());
				System.out.printf("Valor do ICMS: %.2f %n", carrinho.getValorICMS());
				System.out.printf("Valor da venda: %.2f %n", carrinho.getValorVenda());
				
				for (Produto produto : carrinho.getProduto()) {					
					System.out.println("=============DADOS DO PRODUTO===============");
					System.out.println("Codigo: " + produto.getCodigo());
					System.out.println("Descrição: " + produto.getDescricao());
					System.out.printf("Preço de Venda: %.2f %n", produto.getPrecoVenda());
					System.out.printf("Valor do ICMS: %.2f %n", produto.calcularICMS());
				}
				System.out.println("============================================");				
				break;

			default:
				System.out.println("===============OPÇÃO INVÁLIDA===============");
				break;
			}
			
			System.out.println("============================================");
			System.out.print("Deseja continuar(s/n) ?: ");
			char validacao = sc.next().charAt(0);
			System.out.println("============================================");
			System.out.println("=============PROGRAMA FINALIZADO============");

			if (validacao == 's') {
				WhileCondicao = true;
			} else {
				WhileCondicao = false;
			}
			
			cont++;

		} while (WhileCondicao);

		sc.close();
	}

}
