package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tab[] = {1};
		boolean valBool = false;
		
		if(tab.length >= 1 && tab[0] == tab[tab.length - 1] ) {
			valBool = true;
		}
		
		System.out.println(valBool);
	}

}
