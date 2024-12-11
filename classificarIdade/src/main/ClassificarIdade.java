package main;

import java.util.Scanner;

public class ClassificarIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		
		if(idade >= 60) {
			System.out.println("Idoso");
		}
		else if(idade >= 18 && idade < 60) {
			System.out.println("Adulto");
			
		}
		else if(idade >= 0 && idade < 18) {
			System.out.println("Menor de idade");
		}
		else {
			System.out.println("Dados incorreto, tente novamente!");
		}
		
		
		
		sc.close();
	}

}