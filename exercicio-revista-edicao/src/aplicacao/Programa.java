package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		ArrayList<Revista> listRevista = new ArrayList<Revista>();
		Edicao[] edicoes = new Edicao[1];

		boolean situacao = false;

		do {

			System.out.println("======================================");
			System.out.println("(1) Adicionar revista");
			System.out.println("(2) Adicionar edi��o na revista");
			System.out.println("(3) Remover edi��o de uma revista");
			System.out.println("(4) Reciclar edi��o");
			System.out.println("(5) Destruir revista");
			System.out.println("(6) Sair");
			System.out.println("======================================");

			int key = sc.nextInt();
			System.out.println("======================================");
			
			switch (key) {

			case 1:

				// ADICIONAR REVISTA

				System.out.print("C�digo da Revista: ");
				int codigo = sc.nextInt();

				System.out.print("T�tulo da Revista: ");
				sc.nextLine();
				String titulo = sc.nextLine();

				listRevista.add(new Revista(codigo, titulo));

				System.out.println("======================================");
				break;

			case 2:

				// ADICIONAR EDI��O

				System.out.print("N�mero da edi��o: ");
				int num = sc.nextInt();

				System.out.print("Data: ");
				Date data = sdf.parse(sc.next());

				System.out.print("Tiragem: ");
				int tiragem = sc.nextInt();

				System.out.print("Vendidas: ");
				int vendidas = sc.nextInt();

				edicoes[0] = new Edicao(num, data, tiragem, vendidas);

				System.out.print("C�digo da revista para adicionar o exemplar: ");
				codigo = sc.nextInt();

				for (Revista revista : listRevista) {
					if (revista.getCodigo() == codigo) {
						revista.adicionaEdicao(edicoes[0]);
					} else {
						System.out.println("Revista n�o encontrada!");
					}
				}
				
				System.out.println("======================================");
				break;

			case 3:

				// REMOVER EDI��O

				System.out.print("C�digo da revista para remover o exemplar: ");
				codigo = sc.nextInt();

				for (Revista revista : listRevista) {
					if (revista.getCodigo() == codigo) {
						revista.removeEdicao(edicoes[0]);
					} else {
						System.out.println("Revista n�o encontrada!");
					}
				}
				
				System.out.println("======================================");
				break;

			case 4:

				// RECLICAR EDI��O

				System.out.print("C�digo da revista onde o exemplar ser� reciclado: ");
				codigo = sc.nextInt();
				System.out.print("N�mero da edi��o que ser� recilada: ");
				num = sc.nextInt();

				for (Revista revista : listRevista) {
					if (revista.getCodigo() == codigo) {
						if (edicoes[0].getNum() == num) {
							System.out.println("Qnt recicladas: " + edicoes[0].qtdeRecicladas());
							revista.incrementarReciclagemProduzida(edicoes[0].qtdeRecicladas());
							edicoes[0].atualizarReciclagem();
						}

					} else {
						System.out.println("Revista n�o encontrada!");
					}
				}
				
				System.out.println("======================================");
				break;

			case 5:

				// DESTRUIR REVISTA
				
				System.out.print("C�digo da revista a ser destruida: ");
				codigo = sc.nextInt();

				for (Revista revista : listRevista) {
					if (revista.getCodigo() == codigo) {
						listRevista.remove(revista);
						System.out.println("========= Revista destruida =========");
						System.out.println("======================================");
						break;
					}
				}
				
				break;

			case 6:

				// SAIR
				System.out.println("======================================");
				System.out.println("========= Programa encerrado =========");
				System.out.println("======================================");
				break;

			default:
				System.out.println("=========== Op��o inv�lida ===========" );
				System.out.println("======================================");

				break;
			}
			
			System.out.print("Deseja continuar (s/n)?: ");
			char condicao = sc.next().charAt(0);

			if (condicao == 's') {
				situacao = true;

			} else {
				situacao = false;
				System.out.println("======================================");
				System.out.println("========= Programa encerrado =========");
				System.out.println("======================================");
			}

		} while (situacao);

		sc.close();
	}
}