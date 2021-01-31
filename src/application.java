import java.util.Locale;
import java.util.Scanner;

import curso.dolar;

public class application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		dolar dollar = new dolar();
		
		System.out.println("What is the dollar price? ");
		double DollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double ammont = sc.nextDouble();
		double result = (dollar.DollarToReal(ammont, DollarPrice));	
		System.out.printf("Amount to be paid in reais = %.2f%n", result);		
		
		sc.close();
	}

}
