package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Preencha os dados abaixo:");

		System.out.print("Id do exame: ");
		int idExame = sc.nextInt();

		System.out.print("Tipo do exame: ");
		sc.nextLine();
		String tipoExame = sc.nextLine();

		System.out.print("Nível Glicose: ");
		int nivelGlicose = sc.nextInt();

		Exame exame = new Exame(idExame, tipoExame, nivelGlicose);

		mostrarExame(exame);

		sc.close();
	}

	public static void mostrarExame(Exame exame) {

		System.out.println("-------------------------------------");
		System.out.println("Id Exame: " + exame.getIdExame());
		System.out.println("Tipo Exame: " + exame.getTipoExame());
		System.out.println("Diagnóstico: " + exame.obterDiagnostico());
	}
}