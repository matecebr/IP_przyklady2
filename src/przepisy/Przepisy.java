/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package przepisy;

import java.util.Collection;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import zajadalnia.posilki.Posilek;

/**
 *
 * @author jfk
 */
public class Przepisy implements IPrzepisy {
    private HashMap<String, Posilek> lista;
    
    public void Przepisy()
    {
        lista = new HashMap<String, Posilek>();
    }
    
    @Override
    public void dodajPrzepis(String nazwa, Posilek posilek)
    {
        lista.put(nazwa, posilek);
    }
    
    @Override
    public Collection<String> listaPrzepisow()
    {
        return lista.keySet();
    }
    
    @Override
    public Posilek wezPrzepis(String nazwa)
    {
        if (!lista.containsKey(nazwa))
            throw new IllegalArgumentException("brak przepisu " + nazwa);
        return lista.get(nazwa);
    }
    
}
