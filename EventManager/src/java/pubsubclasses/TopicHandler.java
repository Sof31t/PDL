
package pubsubclasses;

import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jms.*;
/*
import javax.naming.Context;
import javax.naming.InitialContext;*/
/**
 *
 * @author abyx
 */
//@Stateless
public class TopicHandler {
    // The connectionFactory resource. PROBLEM here : factory not found...
    @Resource(mappedName = "myOwnTopicCF")
    private TopicConnectionFactory myConnectionFactory;
    
    // the logger for the error handling
    private static final Logger logger = Logger.getLogger(TopicHandler.class.getPackage().getName());
    
    // jms attributes
    private TopicConnection conn ;
    private TopicSession session ;
    private Topic topic ;

    // constructor
    public TopicHandler(String topicName, TopicConnectionFactory tcf) {
        try {
            // creation of connection
            if (tcf == null){
                JMSException e = new JMSException("Null TopicConnectionFactory");
                throw e ;
            }
            System.out.println("Initializing Connection creation");
            // creation of the connection
            conn = tcf.createTopicConnection(); 
            System.out.println("Connection created");
            // creation of session in the connection
            session = conn.createTopicSession(false, Session.AUTO_ACKNOWLEDGE); 
            // creation of topic in the session
            this.topic = session.createTopic(topicName); 
        } catch (Exception e) {
            logger.throwing("TopicHandler","constructor",e);
        }        
    }
    // Classic Getters for the Topic parameters
    // Connection
    public TopicConnection getConnection(){ 
        return this.conn;
    }
    public TopicSession getSession(){ 
        // Session
        return this.session;
    }
    public Topic getTopic(){ 
        // Topic
        return this.topic;
    }
    
}
