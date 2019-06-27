/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucharka;

import java.util.LinkedList;
import zajadalnia.posilki.Posilek;

/**
 *
 * @author jfk
 */
public interface IKucharka {
    public Posilek gotuj(String nazwa);
    public LinkedList<String> getMenu();
}
