package main;

import java.util.Arrays;
import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeros[] = new int[10];
		int maior, menor;
		
		for(int i=0; i< 10; i++) {
			System.out.printf("Digite o numero %d: ", i+1);
			numeros[i] = sc.nextInt();
		}
		
		maior = Arrays.stream(numeros).max().getAsInt();
		menor = Arrays.stream(numeros).min().getAsInt();
		
		System.out.printf("\nO maior número é: %d\n"
				+ "O menor número é: %d", maior, menor);
		
		sc.close();
	}

}
