/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucharka;

import java.util.LinkedList;
import przepisy.IPrzepisy;
import zajadalnia.posilki.Posilek;

/**
 *
 * @author jfk
 */
public class LepszaKucharka implements IKucharka {

    IPrzepisy j;
    public LepszaKucharka(IPrzepisy jadlospis)
    {
        j = jadlospis;
    }
    
    @Override
    public Posilek gotuj(String nazwa) {
        return j.wezPrzepis(nazwa);
    }

    @Override
    public LinkedList<String> getMenu() {
        LinkedList<String> ret = new LinkedList<>();
        ret.addAll(j.listaPrzepisow());
        return ret;
    }
    
}
