package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nbAleatoire = (int)(Math.random()*100);
		Scanner scan = new Scanner(System.in);
		boolean trouve = false;
		int nbCoup = 0;
				
		do {
			System.out.println("Donnez un chiffre: ");
			int nbUser = scan.nextInt();
			nbCoup++;
			
			if(nbUser == nbAleatoire) {
				System.out.println("Bravo vous avez trouvé! En " + nbCoup + " coups!");
				trouve = true;
			} else if (nbUser > nbAleatoire) {
				System.out.println("C'est moins!");
			} else {
				System.out.println("C'est plus!");
			}
		} while (!trouve);
	}

}
