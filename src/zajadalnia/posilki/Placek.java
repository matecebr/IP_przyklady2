/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajadalnia.posilki;


import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jfk
 */
public class Placek extends Posilek {

    protected LinkedList<String> sklad;
    
    public Placek()
    {
        super("placek");
        sklad = new LinkedList<String>();
        sklad.add("maka");
        sklad.add("woda");
        sklad.add("sol");
        
    }
    
    public Placek(Collection<String> sklad)
    {
        this();
        for (String s : sklad)
            this.sklad.add(s);
    }
    
    @Override
    public LinkedList<String> getSklad() {
        LinkedList<String> ret =  new LinkedList<String>();
        ret.addAll(this.sklad);
        return ret;
    }
    
    
    
}
