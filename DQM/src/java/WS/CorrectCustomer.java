/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import name.NameCorrecter;

/**
 *
 * @author sofiene & remy
 */
@WebService(serviceName = "CorrectCustomer")
public class CorrectCustomer {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CorrectName")
    public String CorrectName(@WebParam(name = "name") String name) {
        /* creation of NameCorrecter */
        NameCorrecter Name = new NameCorrecter(name);
        return Name.getString();
    }
}
