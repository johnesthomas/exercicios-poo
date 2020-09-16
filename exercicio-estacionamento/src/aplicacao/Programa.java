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

				boolean situacao = false;

				System.out.print("valor inicial: ");
				double valorInicial = sc.nextDouble();

				System.out.print("valor adicional: ");
				double valorAdicional = sc.nextDouble();

				System.out.print("hora franquia inicial: ");
				int horaFranquiaInicial = sc.nextInt();
				System.out.println();

				list.add(new Estacionamento(codigo, nome, cidade, vagas, situacao, valorInicial, valorAdicional,
						horaFranquiaInicial));

				break;

			case 2:
				
				System.out.println();
				for (Estacionamento estacionamento2 : list) {
					System.out.println(estacionamento2 + "\n");
				}
				System.out.println();
				break;

			case 3:
				estacionamento.ativar();
				break;

			case 4:
				estacionamento.desativar();
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