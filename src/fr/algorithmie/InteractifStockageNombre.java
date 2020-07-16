package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		int[] tab = new int[0];
		boolean stopLoop = false;

		while (!stopLoop) {
			
			System.out.println("Choisir une des options suivantes:");
			System.out.println("1 - Pour saisir une valeur");
			System.out.println("2 - Pour afficher les valeurs saisies");
			System.out.println("3 - Pour quitter le programme.");

			int menu = scan.nextInt();

			switch (menu) {

			case 1:
				System.out.println("Saisissez une valeur");
				int valeur = scan.nextInt();

				int[] tmp = new int[tab.length + 1];

				for (int i = 0; i < tmp.length - 1 && tab.length > 0; i++) {
					tmp[i] = tab[i];
				}

				tmp[tmp.length - 1] = valeur;

				tab = tmp;
				break;
				
			case 2:
				for (int i = 0; i < tab.length; i++) {
					System.out.print(tab[i] + " ");
				}
				System.out.println();
				break;
				
			case 3:
				stopLoop = true;
				break;
			}
		}
		
		scan.close();
		
		
	}

}
