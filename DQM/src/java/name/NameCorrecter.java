package name;

import java.text.Normalizer;

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
   public void normalize(String name){
       this.name = Normalizer.normalize(name, Normalizer.Form.NFD);
   }
}
