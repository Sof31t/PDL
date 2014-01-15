
package pubsubclasses;

import javax.annotation.Resource;
import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
/*
import javax.naming.Context;
import javax.naming.InitialContext;*/
/**
 *
 * @author abyx
 */
public class TopicHandler {
    
    //@Resource(lookup = "jms/topicConnectionFactory")
    //private static TopicConnectionFactory myConnectionFactory;
    
    private TopicConnection conn = null;
    private TopicSession session = null;
    private Topic topic = null;

    // constructor
    public TopicHandler(String topicName) {
        try {
            // creation of context
            Context iCtx = new InitialContext();
            // retrieval of Factory
            Object tmp = iCtx.lookup("jms/topicConnectionFactory"); 
            TopicConnectionFactory myConnectionFactory = (TopicConnectionFactory) tmp; 
            // creation of connection
            if (myConnectionFactory == null){
                System.out.println("Null connection factory");
            }
            System.out.println("Initializing Connection creation");
            conn = myConnectionFactory.createTopicConnection(); 
            System.out.println("Connection created");
            // creation of session in the connection
            session = conn.createTopicSession(false, Session.AUTO_ACKNOWLEDGE); 
            // creation of topic in the session
            this.topic = session.createTopic(topicName); 
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
    // Classic Getters for the Topic parameters
    public TopicConnection getConnection(){ // Connection
        return this.conn;
    }
    public TopicSession getSession(){ // Session
        return this.session;
    }
    public Topic getTopic(){ // Topic
        return this.topic;
    }
    
}
