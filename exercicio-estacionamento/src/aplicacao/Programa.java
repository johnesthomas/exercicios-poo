package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	static Estacionamento estacionamento = new Estacionamento();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Estacionamento> list = new ArrayList<>();

		char caract = 0;

		do {
			System.out.println("----------------");
			System.out.println("(1)Cadastra ");
			System.out.println("(2)Consultar");
			System.out.println("(3)Ativar");
			System.out.println("(4)Desativar");
			System.out.println("(0)Sair");
			System.out.println("----------------");

			int key = sc.nextInt();

			switch (key) {

			case 1: // cadastrar estacionamento

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

			case 2: // consultar estacionamento

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

					for (Estacionamento estacionamento : list) {
						if (codigo == estacionamento.getCodigo()) {
							imprimirEstacionamento(estacionamento);

						} else {
							System.out.println("Estacionamento não encontrado");
						}
					}

					System.out.println();
				}
				break;

			case 3: // ativar estacionamento

				System.out.println("Deseja ativar qual estacionamento ?");
				System.out.print("Código: ");
				codigo = sc.nextInt();

				for (Estacionamento estacionamento : list) {
					if (codigo == estacionamento.getCodigo()) {
						if (!estacionamento.getSituacao()) {
							estacionamento.ativar();
							break;

						} else {
							System.out.println("Estacionamento já está ativado");
						}
					} else {
						System.out.println("Estacionamento não encontrado");
					}
				}
				break;

			case 4: // desativar estacionamento
				
				System.out.println("Deseja desativar qual estacionamento ?");
				System.out.print("Código: ");
				codigo = sc.nextInt();

				for (Estacionamento estacionamento : list) {
					if (codigo == estacionamento.getCodigo()) {
						if (estacionamento.getSituacao()) {
							estacionamento.desativar();
							break;

						} else {
							System.out.println("Estacionamento já está desativado");
						}
					} else {
						System.out.println("Estacionamento não encontrado");
					}
				}
				break;

			default: // opção default, encerrar ou retornar ao programa
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

	public static void imprimirEstacionamento(Estacionamento estacionamento) {
		String situacao = "";
		if(estacionamento.getSituacao()) {
			situacao = "Ativado";
		} else {
			situacao = "Desativado";
		}
		
		System.out.println();
		System.out.println("Código: " + estacionamento.getCodigo());
		System.out.println("Nome: " + estacionamento.getNome());
		System.out.println("Cidade: " + estacionamento.getCidade());
		System.out.println("Vagas: " + estacionamento.getVagas());
		System.out.println("Situação: " + situacao);
		System.out.printf("Valor Inicial: %.2f%n", estacionamento.getValorInicial());
		System.out.printf("Valor Adicional: %.2f%n", estacionamento.getValorAdicional());
		System.out.println("Hora Franquia Inicial: " + estacionamento.getHoraFranquiaInicial());
	}
}