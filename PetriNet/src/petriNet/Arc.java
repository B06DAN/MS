package petriNet;

public class Arc
{
    private Locatie locatie;
    private int capacitate;
    private String directie;

    protected Arc(Locatie valoareaLocatiei, int valoareaCapacitatii, String valoareaDirectiei)
    {
        locatie=valoareaLocatiei;
        capacitate=valoareaCapacitatii;
        directie=valoareaDirectiei;
    }
    protected Locatie Get_locatie()
    {
        return this.locatie;
    }
    protected boolean isValid() 						//verifica daca se poate realiza o tranzitie
    {
        if(directie.equals("out")){
            if(locatie.Get_jetoane()>=capacitate){ 		//ficare arc are capacitatea 1.ca sa am tranzitie, trebuie ca locatia sa aiba un jeton. daca nu sunt jetoane, atunci nu e mai mare decat capacitatea,deci nu e tranzitie valida 
                return true;
            } else {
                return false;
            }
        } else {
            if(directie.equals("in")){
                return true;
            }
        }
        return false;
    }
    protected void update() 							//daca din locatia x se duce in y, o sa fie locatia x (1 jeton - 1 capacitate = 0 jetoane) si ajunge in y (0 jetoane + 1 capacitate = 1 jeton)
    {
        	if(directie.equals("out")) {
            locatie.Set_jetoane(locatie.Get_jetoane() - capacitate);
        }
        if(directie.equals("in")){
            locatie.Set_jetoane(locatie.Get_jetoane() + capacitate);
        }
    }
}