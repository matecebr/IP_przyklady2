package przepisy;

import java.util.Collection;
import zajadalnia.posilki.Posilek;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jfk
 */
public interface IPrzepisy {
    public void dodajPrzepis(String nazwa, Posilek posilek);
    public Collection<String> listaPrzepisow();
    public Posilek wezPrzepis(String nazwa);
}
