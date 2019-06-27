/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajadalnia;

import java.util.ArrayList;
import kucharka.Kucharka;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import kucharka.IKucharka;
import kucharka.LepszaKucharka;
import przepisy.Przepisy;
import zajadalnia.posilki.Kotlet;
import zajadalnia.posilki.Placek;
import zajadalnia.posilki.Posilek;
import zajadalnia.FabrykaMenu;
/**
 *
 * @author jfk
 */
public class Zajadalnia {

    static public Przepisy przygotujJadlospis()
    {
        FabrykaMenu fm = new FabrykaMenu();
        return fm.dajMenu("jarskie");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Klient kl = new Klient("Leon");
        
        IKucharka kucharka = new LepszaKucharka(Zajadalnia.przygotujJadlospis());
        List<String> menu = kucharka.getMenu();
        Scanner scanner = new Scanner(System.in);
        
        
        
        
        // zamawianie
        int choice; 
        while (true)
        {
            System.out.println("Wybierz nr posiłku do dodania. 0 oznacza koniec zamówienia");
            for (int i = 0; i < menu.size(); i++)
            {
                System.out.println("pozycja " + (i+1) + ": " + menu.get(i));
            }
            
            try
            {
                choice = scanner.nextInt();
            } 
            catch (Exception e)
            {
                continue;
            }
            
            
            if (--choice < 0)
                break;
            
            if (choice >= menu.size())
            {
                System.out.println("Nieprawidłowy wybór: spróbuj jeszcze raz");
                continue;
            }
            
            kl.zamow(kucharka.gotuj(menu.get(choice)));
            
        }
        
        System.out.println(kl.pokazZamowienie());
        kl.zjedz();
        
        
        
    }
    

    private static class Kompot extends Posilek {

        public Kompot() {
            super("kompot");
        }

        @Override
        public LinkedList<String> getSklad() {
            LinkedList<String> ret = new LinkedList<String>();
            ret.add("woda");
            ret.add("truskawki");
            ret.add("cukier");
            return ret;
        }
    }
}