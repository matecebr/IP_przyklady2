/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajadalnia;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jfk
 */
public class Zajadalnia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Klient kl = new Klient("Leon");
        
        Kucharka kucharka = new Kucharka();
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
    
}
