package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Donnez un chiffre :");
		
		Scanner scan = new Scanner(System.in);
		
		int nb = scan.nextInt();
		int somme = 0;
		
		for (int i = 1; i <= nb; i++) {
			somme += i;
		}
		
		System.out.println("La somme des entier de votre chiffre est: " + somme);
		
		scan.close();
	}

}
