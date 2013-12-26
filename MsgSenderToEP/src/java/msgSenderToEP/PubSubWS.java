/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package msgSenderToEP;

import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicSession;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 * 
 *
 * @author abyx
 */
@WebService(serviceName = "PubSubWS")
public class PubSubWS {
    
    
    private PubSubManager psm;
    /**
     * This is a sample web service operation
     */
    /*@WebMethod(operationName = "registerEP")
    public void registerEP(@WebParam(name = "nameEP") Object o, @WebParam(name = "topic") String topic) {
        // @TODO : ajouter ici la création d'un Observer ? lié au composant demandeur
        psm.subscribe(topic, o.toString());
    }
        
    @WebMethod(operationName = "unregisterEP")
    public void unregisterEP(@WebParam(name = "nameEP") String name, @WebParam(name = "topic") int topic) {
        // @TODO : ajouter ici la suppression de l'Observer lié au composant demandeur
    }
    */
    @WebMethod(operationName = "sendMessage")
    public void sendMessage(@WebParam(name = "topic") String topic, @WebParam(name = "event") String msg) {
        psm.send(topic, msg);
    }
    
    @WebMethod(operationName = "createTopic")
    public String createTopic(@WebParam(name = "topic") String topic) {
        return psm.addTopic(topic);
    }
    
    @WebMethod(operationName = "getTopicConnection")
    public TopicConnection getTopicConnection(@WebParam(name = "topicName") String topic) {
        return psm.getTopicConnection(topic);
    }
    @WebMethod(operationName = "getTopicSession")
    public TopicSession getTopicSession(@WebParam(name = "topicName") String topic) {
        return psm.getTopicSession(topic);
    }
    @WebMethod(operationName = "getTopic")
    public Topic getTopic(@WebParam(name = "topicName") String topic) {
        return psm.getTopic(topic);
    }
    
}
