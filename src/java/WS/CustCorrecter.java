/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import custcorrecter.addressCorrecter;
import java.io.IOException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.servlet.ServletContext;

/**
 *
 * @author root
 */
@WebService(serviceName = "CustCorrecter")
public class CustCorrecter {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AddressCorrecter")
    public String AddressCorrecter(@WebParam(name = "address") String address) throws IOException {
        
        ServletContext.class.getResourceAsStream("keyWords/NormalWords.txt");
        //getClass().getClassLoader().getResources("/keyWords/NormalWords.txt");
        addressCorrecter correcter = new addressCorrecter();
         address = correcter.correctAddress(address).replaceAll("\n", " ");
         System.out.println(" HHHHH : "+address);
        return address;
    }
}
