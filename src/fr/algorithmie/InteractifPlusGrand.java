package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int plusGrand = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Donnez un chiffre :");
			int nb = scan.nextInt();
			
			if (nb > plusGrand) {
				plusGrand = nb;
			}
		}
		
		System.out.println("Le plus grand de vos chiffres, est : " + plusGrand);
	}

}
