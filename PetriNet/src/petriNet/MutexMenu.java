package petriNet;

import java.util.Scanner;
public class MutexMenu extends Mutex {
	 void RunMutex(){
		 Mutex CM = new Mutex();
		 Scanner scanner = new Scanner(System.in);
	     int input = 0;
	     System.out.println("Welcome");
	     
	     do{
			System.out.println("Introduceti optiunea dorita:");
		    System.out.println("1.StartWrite 2.StopWrite 3.StartRead 4.StopRead");
			input = scanner.nextInt();
			
			switch(input) {
				case 1: 
					CM.exec("StartWriting");
			        CM.afisare_taglocatiejeton();
					break;
				case 2: 
					CM.exec("StopWriting");
			        CM.afisare_taglocatiejeton();
					break;
				case 3: 
					CM.exec("StartReading");
			        CM.afisare_taglocatiejeton();
					break;
				case 4: 
					CM.exec("StopReading");
			        CM.afisare_taglocatiejeton();
					break;
			}
	     
	     }while (input != 0);
	     

}
}
