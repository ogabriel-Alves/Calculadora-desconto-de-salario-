package application;

import java.util.Locale;
import java.util.Scanner;

import entities.dados;

public class visual {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
	    dados dado = new dados();
		
		System.out.print("name: ");
		dado.name = sc.nextLine();
		System.out.print("Gross salary: ");
		dado.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		dado.tax = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Employee: " + dado);
		
		System.out.print("Which percentage to increase salary? ");
		double acres = sc.nextDouble();
		dado.acrescimo(acres);
		
		System.out.println("Update data: " + dado);
		
		sc.close();
	}

}
