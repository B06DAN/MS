package generatorNumere;

public class CLcg implements IGenerator{
	float x0 = 27;
	static int a = 17;
	static int c = 43;
	static int m = 100;
	int count = 0;
	int[] ultimeleRaspunsuri = new int[5];
	
	public float Next(){
		float x1, r1;
		
		ultimeleRaspunsuri[count] = (int) x0;
		
		if(c != 0){
			x1 = (a * x0 + c) % m;
			r1 = x1 / 100;			
			x0 = (int)x1;
			
			for(int i=0; i < ultimeleRaspunsuri.length; i++) {
				if(ultimeleRaspunsuri[i] == x0) {
					x0 += 13;
				}
			}
		
			count++;
			if(count >= 5) {
				count = 0;
			}
			return r1;
			
		}else {
			x1 = x0 / m;
			return x1;
		}
		
	}
}
