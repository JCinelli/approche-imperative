package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {

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

				System.out.println("Votre nombre est : " + nb);
				scanner.close();
			
			

		
	}

}
