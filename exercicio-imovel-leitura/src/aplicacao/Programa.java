package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Programa {

	static ArrayList<Leitura> listLeituras = new ArrayList<Leitura>();
	
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		ArrayList<Imovel> listImoveis = new ArrayList<Imovel>();
		listImoveis.add(new Imovel(1, "Recife", 'c', 1000));
		listImoveis.add(new Imovel(2, "Jaboatao", 'r', 1500));

		boolean validacao = false;
		do {

			System.out.println("(1) Registrar Leitura");
			System.out.println("(2) Auditar Leituras");
			System.out.println("----------------------");
			int key = sc.nextInt();
			System.out.println("----------------------");


			switch (key) {

			case 1:

				System.out.print("Informe ID de um imóvel armazenado: ");
				int idImovel = sc.nextInt();

				for (Imovel imovel : listImoveis) {

					Leitura leitura = new Leitura();

					if (idImovel == imovel.getId()) {

						System.out.print("Informe a data (dd/MM/yyyy): ");
						Date dataLeitura = sdf.parse(sc.next());
						System.out.print("Informe valor: ");
						int leituraAtual = sc.nextInt();

						leitura = new Leitura(imovel, leituraAtual, dataLeitura);

						//System.out.println("Ultima Leitura: " + imovel.getUltimaLeitura());
						imovel.calcularConsumo(leituraAtual);
						//System.out.println("Consumo: " + imovel.getConsumo());

						imovel.calcularConta();
						//System.out.println("Valor da conta: " + imovel.getValorConta());

						leitura.registrarLeitura(); // atualiza o atributo ultimaLeitura do imovel

						listLeituras.add(leitura);

						break;

					} else {
						System.out.println("Não existe !");
					}
				}

				break;

			case 2:

				//Leitura leitura = new Leitura();
				System.out.print("Informe ID do imóvel: ");
				System.out.println();
				idImovel = sc.nextInt();
				for (Imovel imovel : listImoveis) {
					if (idImovel == imovel.getId()) {
						System.out.println("----------------------");
						System.out.println("Endereço: " + imovel.getEndereco());
						System.out.println("Tipo de imóvel: " + imovel.getTipo());
						for (Leitura leitura : listLeituras) {
							if(leitura.getImovel().getId() == idImovel) {
								System.out.println("Id-Leitura: " + leitura.getId());
								System.out.println("Valor da Leitura: " + leitura.getLeitura());
								System.out.println("----------------------");
							}
						}

					}
				}
				System.out.println();
				break;
				
			default:
				System.out.println("Opção inválida !");
				break;
			}
			System.out.println("----------------------");
			System.out.print("Deseja continaur(s/n) ?: ");
			char condicao = sc.next().charAt(0);
			System.out.println("----------------------");

			if (condicao == 's') {
				validacao = true;
			} else {
				validacao = false;
			}

		} while (validacao);

		sc.close();
	}
}