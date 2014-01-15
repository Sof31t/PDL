/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsubclasses;

import java.util.logging.Logger;
import javax.jms.*;
/**
 * 
 * @author abyx
 */
public class TopPublisher {
    // The logger for the error handling
    private static final Logger logger = Logger.getLogger(TopicHandler.class.getPackage().getName());
    
    // comunication links caracteristics
    private TopicConnection topicConn;
    private TopicSession topicSess;
    private Topic top;
    public TopPublisher (TopicConnection tc, TopicSession ts, Topic t) {
        // attribution of the communication links caracteristics
        this.topicConn = tc;
        this.topicSess = ts;
        this.top = t;
        // starting the connection to send the message
        try {
            tc.start();
        } catch (JMSException e) {
            logger.throwing("TopPublisher","constructor",e);
        }
    }
    // This method creates a publisher then sends the wanted message using this publisher
    public void publishMsg(String txt) {
        try {            
            // creation of TopicPublisher
            TopicPublisher tp = topicSess.createPublisher(top);
            // Creation of the message
            TextMessage msg = topicSess.createTextMessage(txt);
            // Publishing the message
            tp.publish(msg);
            // Closing the connexion
            topicConn.stop();
        } catch (JMSException e) {
            logger.throwing("TopPublisher","publishMsg",e);
        }
    }
    
}
