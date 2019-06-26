package zajadalnia;

import java.util.LinkedList;
import zajadalnia.posilki.Posilek;

/**
 *
 * @author jfk
 */
public class Klient {
    private String nazwa;
    private LinkedList<Posilek> zamowienie = new LinkedList<Posilek>();
    
    public Klient(String nazwa)
    {
        this.nazwa = nazwa;
    }
    
    public void zamow(Posilek p)
    {
        this.zamowienie.add(p);
    }
    
    public String pokazZamowienie()
    {
        StringBuilder sb = new StringBuilder();
        for (Posilek p : zamowienie)
        {
            sb.append(p).append(" ");
        }
        return sb.toString();
    }
    
    public void zjedz()
    {
        for (Posilek p : zamowienie)
        {
            System.out.println("Jem właśnie: " + p);
        }
        zamowienie.clear();
    }
    
}
