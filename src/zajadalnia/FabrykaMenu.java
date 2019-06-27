/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajadalnia;

import java.util.ArrayList;
import przepisy.Przepisy;
import zajadalnia.lepszeposilki.FabrykaPosilkow;
import zajadalnia.lepszeposilki.LepszyPosilek;
import zajadalnia.lepszeposilki.PosilekAdapter;
import zajadalnia.posilki.Kotlet;

/**
 *
 * @author jfk
 */
public class FabrykaMenu {

    Przepisy dajMenu(String rodzaj)
    {
        Przepisy j = new Przepisy();
        
        FabrykaPosilkow fm = new FabrykaPosilkow();
        
        switch (rodzaj)
        {
            case "jarskie":
                
                j.dodajPrzepis("kotlet z sera", new PosilekAdapter(fm.dajDanie("kotletzsera")));
                j.dodajPrzepis("kotlet z serka", new PosilekAdapter(fm.dajDanie("kotletzsera")));
                j.dodajPrzepis("kotlet z sereczka", new PosilekAdapter(fm.dajDanie("kotletzsera")));
                break;
            default:
                j.dodajPrzepis("kotlet z sera", new PosilekAdapter(fm.dajDanie("kotlet")));
                break;
        }
        return j;
    }
    
}
