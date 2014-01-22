package adress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author root
 */
public class CustCorrecter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Main test : To change to Junit*/
        /* Sample address */
        String address = "15 Avenue du colonel Roche, bat 4, appt 4509. 31400 Toulouse";

        addressCorrecter correcter = new addressCorrecter();
        address = correcter.FirstClean(address);
        System.out.println(correcter.correctAddress(address));

    }
}