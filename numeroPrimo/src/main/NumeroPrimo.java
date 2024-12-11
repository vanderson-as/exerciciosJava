package main;

import java.util.Scanner;

public class NumeroPrimo {

	public static boolean isPrimo(int numero) {
		int aux = numero;
		boolean isPrimo = true;
		int teste;
		
		switch (numero){
		case 0:
			isPrimo = false;
			break;
		case 1:
			isPrimo = false;
			break;
		default:
			if(aux > 2) {
				for(int i = 2; i < aux; i++) {
					teste = aux % i;			
					if(teste == 0) {
						isPrimo = false;
						break;
					}
				}		
			}else if(aux == 2) {
				isPrimo = true;
				break;
			}	
			}
		
		return isPrimo;
		}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número para verificar se é um número primo: ");
		numero = sc.nextInt();

		boolean numeroPrimo = isPrimo(numero);
		
		System.out.printf( (numeroPrimo ? "O numero %d é um número primo" : "O numero %d não é um número primo"), numero);
		
		
		sc.close();
	}

}
