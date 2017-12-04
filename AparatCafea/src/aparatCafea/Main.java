package aparatCafea;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AparatCafea aparatCafea = new AparatCafea(0);
		Scanner scanner = new Scanner(System.in);
		int input;
	
		while(true)
		{
			System.out.println("Aveti: " + aparatCafea.stareaCurenta + " credit");
			System.out.println("Introduceti bani: ");
			
			input = scanner.nextInt();
			aparatCafea.TranzitieStare(input);
			
			if(aparatCafea.stareaCurenta >= 15)
			{
				aparatCafea.stareaCurenta -=15;
				System.out.println("Cafeaua se prepara. Asteptati cateva momente.");
			}
		}
	}

}
