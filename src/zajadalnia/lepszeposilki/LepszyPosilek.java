/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajadalnia.lepszeposilki;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author jfk
 */
public class LepszyPosilek  {
    private String nazwa;
    
    public enum rodzaj {
        skladnik, czynnosc
    };
    private final LinkedList<AbstractMap.SimpleEntry<rodzaj, String>>  przepis;
    
    LepszyPosilek(String nazwa)
    {
        this.przepis = new LinkedList<>();
        this.nazwa = nazwa;
    }
    LepszyPosilek dodajSkladnik(String nazwa)
    {
        przepis.add(new AbstractMap.SimpleEntry<>(rodzaj.skladnik, nazwa));
        return this;
    }
    LepszyPosilek dodajCzynnosc(String nazwa)
    {
        przepis.add(new AbstractMap.SimpleEntry<>(rodzaj.czynnosc, nazwa));
        return this;
    }
    
    public String getNazwa()
    {
        return nazwa;
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("*** Posiłek przygotowany wg przepisu: ").append(nazwa).append(" ***");
        for (AbstractMap.SimpleEntry<rodzaj, String> p : przepis)
        {
            switch (p.getKey())
            {
                case skladnik:
                    sb.append("DODAJ: ").append(p.getValue());
                    break;
                case czynnosc:
                    sb.append("WYKONAJ: ").append(p.getValue());
                    break;
            }
        }
        return sb.toString();
    }
    
    public LinkedList<String> getType(LepszyPosilek.rodzaj rodzaj)
    {
        LinkedList<String> ret = new LinkedList<>();
        for (AbstractMap.SimpleEntry<rodzaj, String> p : przepis)
        {
            if (p.getKey() == rodzaj)
                ret.add(p.getValue());
        }
        return ret;
    }
}
