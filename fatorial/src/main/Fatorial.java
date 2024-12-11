package main;

import java.util.Scanner;

public class Fatorial {
	
	public static void calcularFatorial(int numero) {
		int aux = numero;
		
		switch (aux) {
		case 0:
			System.out.println("Fatorial de 0 é: 1");
			break;
		case 1:
			System.out.println("Fatorial de 1 é: 1");
			break;
		default:
			if(aux > 1) {
				
				int fatorial[] = new int[aux];
				int resultado = 1;
				
				for(int i = 0; i < aux; i++) {
					fatorial[i] = i+1;
				}
				for(int i = 0; i < aux; i++) {
					resultado = resultado * fatorial[i];
				}
				
				System.out.printf("Resultado de %d! é: %d", aux, resultado);
				
			}else {
				System.out.println("Não é possivel calcular fatorial de números negativos!");
			}
			
		}	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite um número para calcular seu fatorial: ");
		int numero = sc.nextInt();
		
		calcularFatorial(numero);
		
		sc.close();
	}

}
