package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Déclarez un tableau d’entiers contenant tous les entiers de 1 à 10
		int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
//		Affichez le premier élément du tableau
		System.out.println(tab[0]);
		System.out.println("\r-------------------\r");
		
//		Affichez la longueur du tableau en utilisant la propriété length
		System.out.println(tab.length);
		System.out.println("\r-------------------\r");
		
//		Affichez le dernier élément du tableau en utilisant la propriété length
		System.out.println(tab[tab.length - 1]);
		
//		Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8.
		tab[4] = 8;

	}

}
