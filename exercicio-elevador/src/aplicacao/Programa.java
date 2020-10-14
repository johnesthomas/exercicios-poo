package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		/*GRUPO: 
		 * Johnes Thomas Correia da Silva
			Caio Victor Marzuca Amorim de Souza
			Givaldo Manoel Marques dos Santos
			Jehmes Thales Correia da Silva
			Leandro Antônio Mendonça de Arruda
			Leandro miguel dos anjos
			Alexandre Lins da Fonseca Filho
			Caio Felipe dos Santos Ferraz
			Willicleyton Antônio de Lima Oliveira
		 * */

		Scanner sc = new Scanner(System.in);

		Elevador elevador1 = new Elevador(1, 1, false, false);
		Elevador elevador2 = new Elevador(2, 1, false, false);

		/*------------------------ATIVAR------------------------*/
		System.out.println("Ligar elevador: ");
		System.out.print("Informar id do elevador: ");
		int id = sc.nextInt();

		if (id == elevador1.getId()) {

			if (elevador2.isLigado()) {
				System.out.println("Elevador já estar ligado.");
			} else {
				elevador1.ligar();
			}
		} else {

			if (elevador2.isLigado()) {
				System.out.println("Elevador já estar ligado.");
			} else {
				elevador2.ligar();
			}
		}
		/*-------------------------------------------------------*/
		/*-----------------------DESATIVAR-----------------------*/
		
		System.out.println();
		System.out.println("Desligar elevador: ");
		System.out.print("Informar id do elevador: ");
		id = sc.nextInt();

		if (id == elevador1.getId()) {

			if (!elevador2.isLigado()) {
				System.out.println("Elevador já estar desligado.");
			} else {
				elevador1.desligar();
			}
		} else {

			if (!elevador2.isLigado()) {
				System.out.println("Elevador já estar desligado.");
			} else {
				elevador2.desligar();
			}
		}

		/*-------------------------------------------------------*/
		/*-------------------DEFINIR PRIORIDADE------------------*/

		System.out.println();
		System.out.println("Definir prioritário: ");
		System.out.print("Informar id do elevador: ");
		id = sc.nextInt();

		if (id == elevador1.getId()) {
			if (!elevador1.isPrioritario()) {
				elevador1.ativarPrioridade();
				elevador2.desativarPrioridade();
			}
		} else {
			if (!elevador2.isPrioritario()) {
				elevador2.ativarPrioridade();
				elevador1.desativarPrioridade();
			}
		}
		
		/*-------------------------------------------------------*/
		/*--------------------ATENDER CHAMDA--------------------*/

		

		sc.close();
	}

}