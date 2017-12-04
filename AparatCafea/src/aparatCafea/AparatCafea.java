package aparatCafea;

import java.util.HashMap;
import java.util.Scanner;

public class AparatCafea extends MasinaDeStari {
	
	AparatCafea(int stareaCurenta)
	{
		matriceAdiacenta = new HashMap<Integer, HashMap<Integer, Integer>>();		
		HashMap<Integer, Integer> starea0 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> starea5 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> starea10 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> starea15 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> starea20 = new HashMap<Integer, Integer>();
		
		starea0.put(5,5);
		starea0.put(10, 10);
		
		starea5.put(5, 10);
		starea5.put(10, 15);
	
		
		starea10.put(5, 15);

		matriceAdiacenta.put(0, starea0);
		matriceAdiacenta.put(5, starea5);
		matriceAdiacenta.put(10, starea10);
		matriceAdiacenta.put(15, starea15);

		
		this.stareaCurenta = stareaCurenta;
	}

}
