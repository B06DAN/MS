package petriNet;
import java.util.List;


public class Tranzitie
{
    private String tag;
    private List<Arc> arce;

    protected Tranzitie(String tag, List<Arc> arce)
    {
    	this.tag=tag;
        this.arce=arce;
        }
    protected String Get_tag()
    {
        return this.tag;
    }
    protected List<Arc> Get_arce()
    {
        return this.arce;
    }
    protected boolean isValid()
    {
        boolean sw=true;
        for(int i=0;(i<arce.size())&&(sw==true);i++){
            if(arce.get(i).isValid()==false){
                sw=false;
            }
        }
        return sw;
    }
    protected void update()
    {
        for(int i=0;i<arce.size();i++){
            arce.get(i).update();
        }
    }
}