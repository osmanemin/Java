
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        
        Vector<String> vektor = new Vector<String>();
        
        vektor.add("Php");
        vektor.add("Python");
        vektor.add("Java");
        vektor.add("C++");
        
        /*for(String s: vektor)
            System.out.println(s);*/
        
        ListIterator<String> iterator = vektor.listIterator();
        
        /*while(iterator.hasNext())
            System.out.println(iterator.next());*/
          
        Enumeration<String> enumeration = vektor.elements();
        
        /*while(enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement());*/
        
        
        System.out.println(vektor.lastElement());
    }
}
