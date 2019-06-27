/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajadalnia.lepszeposilki;

/**
 *
 * @author jfk
 */
public class FabrykaPosilkow implements IPosilekFactory {
    
    public FabrykaPosilkow()
    {
    }
    
    @Override
    public LepszyPosilek dajDanie(String nazwa)
    {
        switch (nazwa)
        {
            case "kotlet":
                return new LepszyPosilek("kotlet").dodajSkladnik("wieprzowina").
                        dodajCzynnosc("pokrojMieso").dodajSkladnik("bułka tarta").
                        dodajCzynnosc("obtocz w bułce tartej").dodajCzynnosc("piecz 3 minuty");
            case "kotletzsera":
                return new LepszyPosilek("kotletzsera").dodajSkladnik("ser").
                        dodajCzynnosc("pokrojMieso").dodajSkladnik("bułka tarta").
                        dodajCzynnosc("obtocz w bułce tartej").dodajCzynnosc("piecz 3 minuty");
                
            default:
                throw new IllegalArgumentException("Nieznany typ posiłku: " + nazwa);
        }
    }



}
