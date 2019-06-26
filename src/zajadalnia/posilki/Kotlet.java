/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajadalnia.posilki;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author jfk
 */
public class Kotlet extends Posilek {

    String mieso;
    ArrayList<String> dodatki;
    
    public Kotlet()
    {
        super("kotlet");
        
        mieso = "Wieprzowina";
        dodatki = new ArrayList<String>();
        dodatki.add("olej");
        dodatki.add("bułka tarta");
        dodatki.add("sól");
        
    }
    
    public Kotlet(String mieso, Collection<String> dodatki)
    {
        super("kotlet");
        this.mieso = mieso;
        this.dodatki = new ArrayList<String>();
        this.dodatki.addAll(dodatki);
    }
    
    
    @Override
    public LinkedList<String> getSklad() {
        LinkedList<String> ret =  new LinkedList<String>();
        ret.add(mieso);
        ret.addAll(dodatki);
        return ret;
    }
    
}
