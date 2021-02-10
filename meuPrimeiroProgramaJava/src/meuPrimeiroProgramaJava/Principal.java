package meuPrimeiroProgramaJava;

import java.util.Scanner;

// @autor Lucas Figueiredo Ventura
//Data: 3/02/2021


public class Principal {
	public static void main(String[] args) {
		System.out.println("Ola amigo|\n Qual o seu nome?");
	Scanner in = new Scanner(System.in);
	String  nome = in.nextLine();
	
	System.out.printf("Olá %s", nome);
	in.close();
	}
}
