package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Cr�er un tableau qui contient la somme des 2 pr�c�dents tableaux
		
		int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] tab2 = {-1, 12, 17, 14, 5, -9, 0, 18};
		int[] tab3 = new int[tab2.length];
		
		for (int i = 0; i < tab3.length; i++) {
			tab3[i] = tab1[i] + tab2[i];
			
			System.out.println(tab3[i]);
		}
	}

}
