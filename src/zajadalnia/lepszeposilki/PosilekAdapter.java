/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajadalnia.lepszeposilki;

import java.util.LinkedList;

/**
 *
 * @author jfk
 */
public class PosilekAdapter extends zajadalnia.posilki.Posilek {
    // ... ?
    
    public PosilekAdapter(LepszyPosilek lp)
    {
        super(lp.getNazwa());
        //....?
    }

    // metoda abstrakcyjna musi zostać nadpisana
    @Override
    public LinkedList<String> getSklad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // jeżeli trzeba, to do nadpisania
    // @Override
    // public String getNazwa()
    
    // @Override
    // public String toString
    
}
