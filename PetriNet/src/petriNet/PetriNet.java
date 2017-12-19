package petriNet;

import java.util.ArrayList;
import java.util.List;


public abstract class PetriNet
{
    protected List<Tranzitie> tranzitii;

    protected void exec(String actiune)   								//functia exec primeste o actiune; actiune pe care o dau in meniu si inseamna cati bani bag 
    {
        List<Tranzitie> tempTranzitii= new ArrayList<Tranzitie>();
        for(int i=0;i<tranzitii.size();i++){  							//foru trece prin toate tranzitiile starilor
            if(tranzitii.get(i).Get_tag().equals(actiune))  			// gettag ia numele tranzitiei(c15, 51, 101) , actiune = 5/10/15...
                if (tranzitii.get(i).isValid()==true) 					//de ex daca actiunea e 5, o sa gaseasca cateva tranzitii cu 5 dar numai una se poate face. apeleaza fct valid si o gaseste pe aia buna
                    tempTranzitii.add(tranzitii.get(i));				// tranzitiile bune gasite, le bag intr-o lista numita temptranzitii
        }
        for(int i=0;i<tempTranzitii.size();i++){ 						//parcuge tranzitiile bune, gasite inainte
            tempTranzitii.get(i).update(); 								//face update la retea
        }
    }
    protected List<Locatie> listaLocatii() 								//toate locatiile din coffeemachine
    {
        List<Locatie> listaLocatii = new ArrayList<Locatie>();
        for(int i=0; i<tranzitii.size(); i++) {
            for (int j=0; j<tranzitii.get(i).Get_arce().size(); j++) {
                listaLocatii.add(tranzitii.get(i).Get_arce().get(j).Get_locatie()); //getlocatie cauta unde e legat arcul; getarce ia arcurile; 
            }
        }
        return listaLocatii;
    }
}