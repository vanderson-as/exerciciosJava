package somaPares;

import java.util.Scanner;

public class SomaPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero, verificador, soma;
		int aux = 0;

		System.out.print("Digite um número de 0 - 100: ");
		numero = sc.nextInt();
		
		if(numero >= 0 && numero <=100) {
			if(numero > 0) {
				for(int i=1; i <= numero; i++) {
					verificador = i % 2;
					if(verificador == 0) {
						aux = aux + i;
					}
				}
				soma = aux;
				System.out.printf("A soma dos números pares de 0 a %d é: %d", numero, soma);
			}else {
				System.out.println("A soma dos números pares de 0 a 0 é: 0");
			}

		}else {
			System.out.println("Algo deu errado, tente novamente!");
		}
		
		sc.close();
		
	}

}
