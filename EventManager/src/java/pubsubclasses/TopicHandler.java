
package pubsubclasses;

import java.util.Hashtable;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
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
//@Stateless
public class TopicHandler {
    
    @Resource(mappedName = "myOwnTopicCF")
    private TopicConnectionFactory myConnectionFactory;
    
    // the logger for the error handling
    private static final Logger logger = Logger.getLogger(TopicHandler.class.getPackage().getName());
    
    private TopicConnection conn ;
    private TopicSession session ;
    private Topic topic ;

    // constructor
    public TopicHandler(String topicName) {
        try {
            // creation of context
            /*InitialContext jndi = new InitialContext();
            // retrieval of Factory
            Object tmp = jndi.lookup("topicConnectionFactory"); 
            TopicConnectionFactory myConnectionFactory = (TopicConnectionFactory) tmp; */
            // creation of connection
            if (myConnectionFactory == null){
                JMSException e = new JMSException("Null TopicConnectionFactory");
                throw e ;
            }
            System.out.println("Initializing Connection creation");
            conn = myConnectionFactory.createTopicConnection(); 
            System.out.println("Connection created");
            // creation of session in the connection
            session = conn.createTopicSession(false, Session.AUTO_ACKNOWLEDGE); 
            // creation of topic in the session
            this.topic = session.createTopic(topicName); 
        } catch (Exception e) {
            logger.throwing("TopicHandler","constructor",e);
            //e.printStackTrace();
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
