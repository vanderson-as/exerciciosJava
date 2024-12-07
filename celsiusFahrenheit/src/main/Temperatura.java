package main;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.of("en", "US"));
		
		Scanner sc = new Scanner(System.in);
		
		double celsius, fahrenheit, aux;
		
		System.out.print("Digite a temperatura em Celsius: ");
		celsius = sc.nextDouble();
		aux = (celsius * (9/5)) + 32;
		fahrenheit = aux;
		System.out.print("Temperatura em Fahrenheit: " + fahrenheit);

		sc.close();
	}

}
