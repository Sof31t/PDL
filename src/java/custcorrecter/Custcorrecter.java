/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package custcorrecter;

/**
 *
 * @author root
 */
public class Custcorrecter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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

        //address = correcter.correctAddress(address);
    }
}
