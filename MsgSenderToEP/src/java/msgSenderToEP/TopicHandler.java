/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package msgSenderToEP;


import javax.jms.*;
import javax.naming.InitialContext;
/**
 *
 * @author abyx
 */
public class TopicHandler {
    private TopicConnection conn = null;
    private TopicSession session = null;
    private Topic topic = null;

    // constructor
    public TopicHandler(String topicName) {
        try {
            // creation of context
            InitialContext iCtx = new InitialContext();
            // retrieval of Factory
            Object tmp = iCtx.lookup("TopicConnectionFactory"); 
            TopicConnectionFactory cf = (TopicConnectionFactory) tmp; 
            // creation of connection
            conn = cf.createTopicConnection(); 
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



    
    /*public void subscribe(Subscriber s, Topic t){
        
    }
    public void unsubscribe(Subscriber s, Topic t){
        
    }
    public void publish(Publisher p, Topic t, String mess){
        
    }*/


    
}
