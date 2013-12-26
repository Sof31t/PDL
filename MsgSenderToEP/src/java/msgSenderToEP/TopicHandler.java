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
            InitialContext iCtx = new InitialContext();
            Object tmp = iCtx.lookup("TopicConnectionFactory");
            TopicConnectionFactory cf = (TopicConnectionFactory) tmp;
            conn = cf.createTopicConnection();
            session = conn.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            this.topic = session.createTopic(topicName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public TopicConnection getConnection(){
        return this.conn;
    }
    public TopicSession getSession(){
        return this.session;
    }
    public Topic getTopic(){
        return this.topic;
    }



    
    /*public void subscribe(Subscriber s, Topic t){
        
    }
    public void unsubscribe(Subscriber s, Topic t){
        
    }
    public void publish(Publisher p, Topic t, String mess){
        
    }*/


    
}
