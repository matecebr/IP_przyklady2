package zajadalnia.posilki;

import java.util.LinkedList;

/**
 *
 * @author jfk
 */
public abstract class Posilek {
        private String nazwa;
        
        
        public String getNazwa()
        {
            return nazwa;
        }
        
        public abstract LinkedList<String> getSklad();
        
        protected Posilek(String nazwa)
        {
            this.nazwa = nazwa;
        }
        
        
        public String toString()
        {
            StringBuilder sb = new StringBuilder();
            
            sb.append("Posilek: ").append(this.getNazwa()).append(", czyli: ");
            for (String skladnik : this.getSklad())
            {
                sb.append(" + ").append(skladnik).append(" ");
            }
            return sb.toString();
        }
}
