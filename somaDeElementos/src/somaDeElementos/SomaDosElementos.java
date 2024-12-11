package somaDeElementos;

import java.util.Scanner;

public class SomaDosElementos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] valores = new int[5];
		int soma = 0;
		
		for(int i=0; i < 5; i++) {
			System.out.printf("Digite o número %d: ", i+1);
			valores[i] = sc.nextInt();
			
			soma += valores[i];
		}
		
		System.out.printf("A soma dos números é: %d", soma);
		
		sc.close();
		
	}

}
