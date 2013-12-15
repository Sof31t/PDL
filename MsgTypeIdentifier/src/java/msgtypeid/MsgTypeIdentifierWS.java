/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package msgtypeid;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author abyx
 */
@WebService(serviceName = "MsgTypeIdentifierWS")
public class MsgTypeIdentifierWS {

    
    public MsgTypeIdentifierWS() {
        
    }
        
    /* The next method returns an int depending on the source of the message it 
     * receives. 0 if from unrecognized module, 1 if DQM and 2 if MDM (example 
     * and factice values)
    */
    /**  
     * @param msg
     * @return
     */
    @WebMethod(operationName="identifyMsgType")
    public static int identifyMsgType(@WebParam(name = "message") String msg){
        int i = 0;
        System.out.println("Initializing identifyMsgType");
        if (msg.equals("fromDQM")){ 
            System.out.println("DQM msg found");
            i = 1;
        } else if(msg.equals("fromMDM")) {
            System.out.println("MDM msg found");            
            i = 2;
        }
        System.out.println("End of function : "+Integer.toString(i));
        return i;
    }
}
