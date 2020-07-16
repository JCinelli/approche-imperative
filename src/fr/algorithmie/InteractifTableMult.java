package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		boolean stopLoop = false;
		int nb = 0;

		do {

			System.out.println("Saisissez un nombrem entre 1 et 10:");
			nb = scanner.nextInt();

			if (nb >= 1 && nb <= 10) {
				stopLoop = true;
			}
		}
		
		while (!stopLoop);
		
		System.out.println("Table de " + nb + ": ");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(nb + " x " + i + " = " + nb * i);
		}
		
		scanner.close();
	}

}
