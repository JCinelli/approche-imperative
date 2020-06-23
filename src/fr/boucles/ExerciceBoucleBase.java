package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Exercice 1 = Affichez tous les nombres de 1 à 10
		System.out.println("EXO 1");
		for (int i = 1; i <= 10;  i++) {
			System.out.println(i);
		}
		System.out.println("\r");
		
//		Exercice 2 = Affichez 20 fois votre nom et votre prénom
		System.out.println("EXO 2");
		for (int i = 0; i < 20; i++) {
			System.out.println("Jeremy CINELLI (" + i + ")");
		}
		System.out.println("\r");
		
//		Exercice 3 = Affichez les éléments pairs de 2 à 100
		System.out.println("EXO 3");
		for (int i = 2; i <= 100; i+=2) {
			System.out.println(i);
		}
		System.out.println("\r");
		
//		Exercice 4 = Affichez les éléments impairs de 1 à 99
		System.out.println("EXO 4");
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("\r");
	}

}
