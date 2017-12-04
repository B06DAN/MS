package generatorNumere;

public class CEvaluator {
	float numereGenerate = 10000;
	IGenerator generator;
	
	CEvaluator(IGenerator g){
		generator = g;
	}
	// commit
	
	float Evaluare() {
		float x, y, counter=0;
		for(int i=0; i < numereGenerate; i++) {
			x = generator.Next();
			y = generator.Next();
			
			if (Math.sqrt (x * x + y * y) < 1 ) {
				counter++;
			}
		}
		return Math.abs((float) (3.14 - (4 * counter / numereGenerate)));
		
	}
}
