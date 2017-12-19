package petriNet;

public class Locatie
{
    private String tag;
    private int numarJetoane;

    protected Locatie(String tag, int numarJetoane)
    {
        this.tag=tag;
        this.numarJetoane=numarJetoane;
    }
    
    protected String Get_tag()
    {
        return this.tag;
    }
    
    protected int Get_jetoane()
    {
        return this.numarJetoane;
    }
    
    protected void Set_jetoane(int numarJetoane)
    {
        this.numarJetoane=numarJetoane;
    }


}