package main;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, resultado;
		
		
		System.out.print("Digite um número para ver sua tabuada: ");
		numero = sc.nextInt();
		
		System.out.println("**** TABUADA ****");
		
		System.out.println("***** ADIÇÃO *****");
		for(int i = 1; i <= 10; i++ ) {
			resultado = numero + i;
			System.out.printf("%d + %d = %d\n", i, numero, resultado);
		}
		
		System.out.println("***** SUBTRAÇÃO *****");
		for(int i = numero; i < (numero+10); i++ ) {
			resultado = i - numero;
			System.out.printf("%d - %d = %d\n", i, numero, resultado);
		}
		
		System.out.println("***** MULTIPLICAÇÃO *****");
		for(int i = 1; i <= 10; i++ ) {
			resultado = numero * i;
			System.out.printf("%d * %d = %d\n", i, numero, resultado);
		}
		
		System.out.println("***** DIVISÃO *****");
		for(int i = numero; i <= (numero*10); i+=numero ) {
			resultado = i / numero;
			System.out.printf("%d / %d = %d\n", i, numero, resultado);
		}
		
		

	}

}
