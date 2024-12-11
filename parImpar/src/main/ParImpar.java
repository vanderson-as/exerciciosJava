package main;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero, aux;
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		aux = numero % 2;
		
		if(aux == 0) {
			System.out.println("O número " + numero + " é par!");
		}
		else {
			System.out.println("O número " + numero + " é impar!");
		}
		
		sc.close();
	}

}
