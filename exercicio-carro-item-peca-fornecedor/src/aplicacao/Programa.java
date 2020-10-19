package aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Peca peca1 = new Peca(1, "Motor");
		Peca peca2 = new Peca(2, "Roda");
		Peca peca3 = new Peca(3, "Cadeira");
		Peca peca4 = new Peca(4, "Volante");
		Peca peca5 = new Peca(5, "Carcaça");

		ArrayList<Peca> listPecas = new ArrayList<Peca>();
		listPecas.add(peca1);
		listPecas.add(peca2);
		listPecas.add(peca3);
		listPecas.add(peca4);
		listPecas.add(peca5);

		Fornecedor fornecedor1 = new Fornecedor("00.000.000/0000-01", "Magneti Marelli");
		Fornecedor fornecedor2 = new Fornecedor("00.000.000/0000-02", "Renault");
		Fornecedor fornecedor3 = new Fornecedor("00.000.000/0000-03", "Nissan");

		ArrayList<Fornecedor> listFornecedores = new ArrayList<Fornecedor>();
		listFornecedores.add(fornecedor1);
		listFornecedores.add(fornecedor2);
		listFornecedores.add(fornecedor3);

		Carro carro1 = new Carro("Renault", "KWID", "0ABCD00E00000000", "2019");
		Carro carro2 = new Carro("Renault", "CAPTUR", "0ABCD00E00000001", "2020");

		ArrayList<Carro> listCarros = new ArrayList<Carro>();
		listCarros.add(carro1);
		listCarros.add(carro2);

		
		//INSERIR ITENS A UMA LISTA DE ITENS
		ArrayList<Item> listItens = new ArrayList<Item>();

		boolean situacao = false;
		do {

			System.out.print("Quantidade de Item(ns): ");
			int quantidade = sc.nextInt();

			sc.nextLine();

			System.out.print("Cor do(s) Item(ns): ");
			String cor = sc.nextLine();

			System.out.print("Preço do(s) Item(ns): ");
			double precoUnitario = sc.nextDouble();

			listItens.add(new Item(quantidade, cor, precoUnitario));

			System.out.println("continuar(s/n) ?");
			char condicao = sc.next().charAt(0);

			if (condicao == 's') {
				situacao = true;
			} else {
				situacao = false;
			}
		} while (situacao);
		
		//INSERIR LISTA DE ITENS EM UM CARRO
		System.out.print("Chassi para atribuir itens: ");		
		String chassi = sc.nextLine();
		
		for (Carro carro : listCarros) {
			if(chassi == carro.getChassi()) {
				carro.setItem(listItens);
			} else {
				System.out.println("Carro não existe na lista !");
			}
		}
		
	

	}
}