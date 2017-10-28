package generatorNumere;

public class CMidSquare implements IGenerator{
	int radacina = 5678;
	int count = 0;
	int[] ultimeleRadacini = new int[5];
	
	public float Next() {

		float radacinaf;
		ultimeleRadacini[count] = radacina;
		radacina = radacina * radacina;
		radacina /= 100;
		radacina %= 10000;
		
		for(int i=0; i < ultimeleRadacini.length; i++) {
			if(ultimeleRadacini[i] == radacina) {
				radacina += 13;
			}
		}
		radacinaf = radacina;
		radacinaf /= 10000;	
		
		count++;
		
		if(count >= 5) {
			count = 0;
		}	
		return radacinaf;
	}
}
