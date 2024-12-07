package main;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int numero01, numero02, operacao;
		char opc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		numero01 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		numero02 = sc.nextInt();
		
		System.out.print("Escolha a operação (+, -, *, /): ");
		opc = sc.next().charAt(0);
		
		switch(opc) {
		case '+':
			operacao = numero01 + numero02;
			System.out.println("Resultado: " + operacao);
			break;
		case '-':
			operacao = numero01 - numero02;
			System.out.println("Resultado: " + operacao);
			break;
		case '*':
			operacao = numero01 * numero02;
			System.out.println("Resultado: " + operacao);
			break;
		case '/':
			operacao = numero01 / numero02;
			System.out.println("Resultado: " + operacao);
			break;
		default:
			System.out.println("Operação incorreta, tente novamente!");
		}
		
		
		sc.close();
	}

}
