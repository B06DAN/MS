package generatorNumere;

public class Main {

	public static void main(String[] args) {
		CLcg lcg = new CLcg();
		CMidSquare midSquare = new CMidSquare();
		float rezultat;
//		System.out.println("Metoda MidSquare " );
//		for(int i=0; i < 5 ; i++) {
//			rezultat = midSquare.Next();
//			System.out.println(rezultat);
//		}
//		
//		System.out.println("Metoda LCG " );
//		for(int i=0; i < 5 ; i++) {	
//			rezultat = lcg.Next();
//			System.out.println(rezultat);
//		}
		CEvaluator evaluator = new CEvaluator(midSquare);
		rezultat = evaluator.Evaluare();
		System.out.println(rezultat);
	}

}
