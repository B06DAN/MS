package petriNet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Mutex extends PetriNet{
    Mutex(){
        
    	Tranzitie tranzitia1,tranzitia2,tranzitia3,tranzitia4;
        Arc arcul1,arcul2,arcul3,arcul4,arcul5,arcul6,arcul7,arcul8;
        Locatie locatia1,locatia2,locatia3;
        
        Scanner scanner = new Scanner(System.in);
	    int k = 0;
	    System.out.println("Introduceti nr. de entitati:");
        k = scanner.nextInt();
        
        
        List<Arc> templistaarce;
        tranzitii = new ArrayList<Tranzitie>();

        locatia1 =  new Locatie("Workeri",k);
        arcul8 = new Arc(locatia1,1,"in");
        arcul4 = new Arc(locatia1,k,"in");
        arcul5 = new Arc(locatia1,1,"out");
        arcul1 = new Arc(locatia1,k,"out");

        locatia2 =  new Locatie("Writing",0);
        arcul2 = new Arc(locatia2,1,"in");
        arcul3 = new Arc(locatia2,1,"out");

        locatia3 =  new Locatie("Reading",0);
        arcul6 = new Arc(locatia3,1,"in");
        arcul7 = new Arc(locatia3,1,"out");

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul1);
        templistaarce.add(arcul2);
        tranzitia1 = new Tranzitie("StartWriting",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul3);
        templistaarce.add(arcul4);
        tranzitia2 = new Tranzitie("StopWriting",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul5);
        templistaarce.add(arcul6);
        tranzitia3 = new Tranzitie("StartReading",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul7);
        templistaarce.add(arcul8);
        tranzitia4 = new Tranzitie("StopReading",templistaarce);

        tranzitii.add(tranzitia1);
        tranzitii.add(tranzitia2);
        tranzitii.add(tranzitia3);
        tranzitii.add(tranzitia4);
    }

    protected void afisare_taglocatiejeton()
    {
        List<Locatie> listalocatii;
        listalocatii=listaLocatii();
        for(int i=0;i<listalocatii.size();i++){
            System.out.println(listalocatii.get(i).Get_tag()+": "+listalocatii.get(i).Get_jetoane());
        }
    }
}