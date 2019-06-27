package kucharka;

import java.util.ArrayList;
import java.util.LinkedList;
import zajadalnia.posilki.Kotlet;
import zajadalnia.posilki.Placek;
import zajadalnia.posilki.Posilek;

/**
 *
 * @author jfk
 */
public class Kucharka implements IKucharka {
    public Posilek gotuj(String nazwa)
    {
        switch (nazwa)
        {
            case "kotlet schabowy":
                return new Kotlet();
            case "kotlet zajadalnia":
                return new Kotlet("indyk", new ArrayList<String>() {{ add("bułka tarta"); add("olej"); }});
            case "placek":
                return new Placek(new ArrayList<String>() {{ add("ziemniaki"); add("olej"); add("sól"); add("sól"); }});
            case "placek light":
                return new Placek(new ArrayList<String>() {{ add("ziemniaki"); add("margaryna"); add("sól"); }});
            case "kompot":
                return new Kompot();
            default: 
                throw new IllegalArgumentException("Nieznany typ posiłku: " + nazwa);
        }
        
    }
    public LinkedList<String> getMenu()
    {
        LinkedList<String> menu = new LinkedList<>();
        menu.add("kotlet schabowy");
        menu.add("kotlet zajadalnia");
        menu.add("placek");
        menu.add("placek light");
        menu.add("kompot");
        return menu;
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
