package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Donnez un chiffre :");
		
		Scanner scan = new Scanner(System.in);
		
		int nb = scan.nextInt();
		
		System.out.println("\r Les 10 chiffres suivants de votre chiffre sont :");
		for (int i = 1; i <= 10; i++) {
			System.out.println(nb + i);
		}
		
		scan.close();
	}

}
