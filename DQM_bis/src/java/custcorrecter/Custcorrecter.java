<<<<<<< HEAD:DQM_bis/src/java/custcorrecter/Custcorrecter.java
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package custcorrecter;
=======
package adress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
>>>>>>> 1c4d67613e4518103618c9713e28d56c231f48c8:DQM/src/java/adress/CustCorrecter.java

/**
 *
 * @author root
 */
<<<<<<< HEAD:DQM_bis/src/java/custcorrecter/Custcorrecter.java
public class Custcorrecter {
=======
public class CustCorrecter {
>>>>>>> 1c4d67613e4518103618c9713e28d56c231f48c8:DQM/src/java/adress/CustCorrecter.java

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD:DQM_bis/src/java/custcorrecter/Custcorrecter.java
        // TODO code application logic here
        
        String address = "135, avue de pôtrore, IM Insa R 1 31077 tolose";
        
        addressCorrecter correcter = new addressCorrecter();
                //address = correcter.FirstClean(address);

        /*System.out.println(correcter.getLibelleCourtUnite(address));
System.out.println(correcter.getLibelleCourtOrganismeImplatation(address));
System.out.println(correcter.getComplementAdresse(address));
System.out.println(correcter.getNumeroVoie(address));
System.out.println(correcter.getCodePostale(address));*/
        System.out.println(correcter.correctAddress(address).replaceAll("\n", " "));
=======
        /* Main test : To change to Junit*/
        /* Sample address */
        String address = "15 Avenue du colonel Roche, bat 4, appt 4509. 31400 Toulouse";

        addressCorrecter correcter = new addressCorrecter();
        address = correcter.FirstClean(address);
        System.out.println(correcter.correctAddress(address));
>>>>>>> 1c4d67613e4518103618c9713e28d56c231f48c8:DQM/src/java/adress/CustCorrecter.java

    }
}
