package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int tab[] = {0,1,2,3};
	
	rotation(tab);
	for (int valeur : tab) {
		System.out.println(valeur);
	}
	

	
		
}
	
	public static void rotation(int[] tab) {
		
		int temp = tab.length - 1;
		
		for (int i = tab.length - 2; i >= 0; i--) {

			tab[i + 1] = tab[i];
			
		}
		
		tab[0] = temp;
	}
}

