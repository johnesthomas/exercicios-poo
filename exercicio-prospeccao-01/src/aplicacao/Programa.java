package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] quantAlunos = new int[5];
		String[] dias = { "Segunda", "Terça", "Quarta", "Quinta", "Sexta" };

		int media = 0;

		// ler o array de alunos da semana
		for (int i = 0; i < quantAlunos.length; i++) {
			quantAlunos[i] = sc.nextInt();
			media += quantAlunos[i];
		}

		media = media / quantAlunos.length;

		System.out.println("Média: " + media);
		System.out.println("Quantos alunos assistiram aula por dia: " + maiorDia(quantAlunos));
		System.out.println("Quantidade de dias: " + (quantDias(quantAlunos, dias)));

		sc.close();
	}
	//achar maior numero de alunos por dia
	public static int maiorDia(int[] quantAlunos) {

		int maiorDia = 0;
		// achar maior dia
		for (int i = 0; i < quantAlunos.length; i++) {
			if (i == 0) {
				maiorDia = quantAlunos[i];
			} else {
				if (quantAlunos[i] > maiorDia) {
					maiorDia = quantAlunos[i];
				}
			}
		}
		return maiorDia;
	}
	// imprimir os dias e a quantidade de dias que tiveram mais alunos
	public static String quantDias(int[] quantAlunos, String[] dias) {

		int quantDias = 0;

		for (int i = 0; i < quantAlunos.length; i++) {
			if (quantAlunos[i] == maiorDia(quantAlunos)) {
				quantDias++;
				System.out.println(dias[i]);
			}
		}
		return String.format("%d", quantDias);
	}
}