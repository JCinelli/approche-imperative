package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
//		Rechercher le plus grand �l�ment du tableau
		
		int plusGrand = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > plusGrand) {
				plusGrand = array[i];
			}
		}
		System.out.println("Le plus grand nombre du tableau est : " + plusGrand);
	}

}
