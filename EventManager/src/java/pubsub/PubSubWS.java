package pubsub;

import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicSession;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import pubsubclasses.PubSubManager;

/**
 * @author abyx
 */
@WebService(serviceName = "PubSubWS")
public class PubSubWS {
    
    //public PubSubManager psm; // public for tests ONLY
    private PubSubManager psm;
    
    // The initialization method
    @WebMethod(operationName = "initEventManager")
    public void initEventManager () {
        psm = new PubSubManager();
    }
    
    // The message sending method. Called by the Proxy / Router.
    @WebMethod(operationName = "sendMessage")
    public void sendMessage(@WebParam(name = "topic") String topic, @WebParam(name = "event") String msg) {
        psm.send(topic, msg);
    }
    
    // The Topic creation method
    @WebMethod(operationName = "createTopic")
    public String createTopic(@WebParam(name = "topic") String topic) {
        return psm.addTopic(topic);
    }
    
    
    // The 3 getters needed to get information to connect to a Topic
    // TopicConnection
    @WebMethod(operationName = "retrieveTopicConnection") 
    public TopicConnection retrieveTopicConnection(@WebParam(name = "topicName") String topic) {
        return psm.getTopicConnection(topic);
    }
    // TopicSession
    @WebMethod(operationName = "retrieveTopicSession") 
    public TopicSession retrieveTopicSession(@WebParam(name = "topicName") String topic) {
        return psm.getTopicSession(topic);
    }
    // Topic 
    @WebMethod(operationName = "retrieveTopic") 
    public Topic retrieveTopic(@WebParam(name = "topicName") String topic) {
        return psm.getTopic(topic);
    }  
}
