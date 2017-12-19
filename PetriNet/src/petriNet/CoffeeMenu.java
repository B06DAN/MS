package petriNet;

import java.util.Scanner;
import java.util.List;

public class CoffeeMenu extends CoffeeMachine {
	public void Run() {
		CoffeeMachine masinaDeCafea = new CoffeeMachine();
		Scanner scanner = new Scanner(System.in);
		String suma = "";
	    int input = 0;
	    System.out.println("Meniu aparat de cafea");
	    System.out.println("1. Introdu 5 lei");
	    System.out.println("2. Introdu 10 lei");
	    System.out.println("3. Cumpara cafea latte(cost 10 lei)");
	    System.out.println("4. Cumpara cafea 3 in 1(cost 15 lei)");
	    System.out.println("0. Iesire");

	    
	    
	    do {
		    System.out.println("Introduceti optiunea dorita:");
	    	input = scanner.nextInt();

	    	switch(input) {
	    	case 1: 
	    		System.out.println("Ati introdus 5 monezi");
	    		masinaDeCafea.exec("5");
	    		suma = masinaDeCafea.tagLocatieJeton();
	    		break;
	    		
	    	case 2:
	    		System.out.println("Ati introdus 10 monezi");
	    		masinaDeCafea.exec("10");
	    		suma = masinaDeCafea.tagLocatieJeton();
	    		break;
	    		
	    	case 3:
	    		if(Integer.parseInt(suma) >= 10) {
	    		System.out.println("Ati cumparat o cafea la 10 lei");
	    		masinaDeCafea.exec("C10");
	    		suma = masinaDeCafea.tagLocatieJeton();
	    		}
	    		else {
	    			System.out.println("Nu aveti suficienti lei");
	    		}
	    		break;
	    		
	    	case 4:
	    		if(Integer.parseInt(suma) >= 15) {
	    		System.out.println("Ati cumparat o cafea la 15 lei");
	    		masinaDeCafea.exec("C15");
	    		suma = masinaDeCafea.tagLocatieJeton();
	    		}
	    		else {
		    		System.out.println("Nu aveti suficienti lei");
	    		}
	    		break;
	    		
	    	case 0:
	    		System.out.println("Va dorim o zi placuta!");
	    		break;
	    	}
	    	

	    	System.out.println("Suma actuala:"+masinaDeCafea.tagLocatieJeton());
		    System.out.println("");
	    		
	    	
	    }while(input != 0);
   	
	}
}
