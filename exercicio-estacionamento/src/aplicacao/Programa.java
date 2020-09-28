package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Estacionamento estacionamento = new Estacionamento();

		List<Estacionamento> list = new ArrayList<>();

		char caract = 0;

		do {
			System.out.println(
					"(1)Cadastrar \n(2)Consultar \n(3)Ativar \n(4)Desativar \n(0)Sair \n----------------------------------- ");
			int key = sc.nextInt();

			switch (key) {
			case 1:

				System.out.println("Insira os dados para cadastrar estacionamento: ");

				System.out.print("código: ");
				int codigo = sc.nextInt();

				System.out.print("nome: ");
				sc.nextLine();
				String nome = sc.nextLine();

				System.out.print("cidade: ");
				String cidade = sc.nextLine();

				System.out.print("vagas: ");
				int vagas = sc.nextInt();

				System.out.print("valor inicial: ");
				double valorInicial = sc.nextDouble();

				System.out.print("valor adicional: ");
				double valorAdicional = sc.nextDouble();

				System.out.print("hora franquia inicial: ");
				int horaFranquiaInicial = sc.nextInt();
				System.out.println();

				list.add(estacionamento = new Estacionamento(codigo, nome, cidade, vagas, valorInicial, valorAdicional,
						horaFranquiaInicial));

				break;

			case 2:

				if (list.isEmpty()) {
					System.out.println();
					System.out.println("#####################################");
					System.out.println("Não existe estacionamento cadastrado.");
					System.out.println("#####################################");
					System.out.println();
				} else {

					System.out.println();
					System.out.println("Deseja consultar qual estacionamento ?");
					System.out.print("Código: ");
					codigo = sc.nextInt();

					if (codigo == estacionamento.getCodigo()) {
						for (Estacionamento estacacionamento : list) {
							System.out.println(estacacionamento + "\n");
						}
					} else {
						System.out.println("Estacionamento não encontrado");
					}

					System.out.println();
				}
				break;

			case 3: // ativar estacionamento

				if (!estacionamento.getSituacao()) {
					estacionamento.ativar();
				} else {
					System.out.println("Estacionamento já está ativado");
				}
				break;

			case 4: // desativar estacionamento

				if (estacionamento.getSituacao()) {
					estacionamento.desativar();
				} else {
					System.out.println("Estacionamento já está desativado");
				}
				break;

			default:
				if (key == 0) {
					caract = 'n';
				} else {
					System.out.println("\nOpção inválida, deseja continuar(s/n) ? ");
					caract = sc.next().charAt(0);
				}
				break;
			}

		} while (caract != 'n');

		sc.close();
	}
}