package name;
import adress.*;
//import java.text.Normalizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sofiene
 */
public class NameCorrecter {
    String name;
    public NameCorrecter(String name){
        this.name = Clean(name);
    }

    private String Clean(String name){
         name = name.replaceAll("[\\s\\p{Punct}]"," ");
         name = name.replaceAll("[0-9]","");
         name = name.replaceAll("  ", " ");
         name = StringOperation.sansAccent(name);
         name = name.toUpperCase();
         return name;
     }
    
    public String getString(){
        return this.name;
    }
}
