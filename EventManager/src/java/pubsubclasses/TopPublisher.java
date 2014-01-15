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

    private TopicConnection topicConn;
    private TopicSession topicSess;
    private Topic top;
    public TopPublisher (TopicConnection tc, TopicSession ts, Topic t) {
        this.topicConn = tc;
        this.topicSess = ts;
        this.top = t;
        String topName = "";
        try {
            topName = t.getTopicName();
            tc.start();
        } catch (JMSException e) {
            logger.throwing("TopPublisher","constructor",e);
            //System.out.println("Failed to start the connection during creation of a sender in topic " + topName);
        }
    }
    // This method creates a publisher then sends the wanted message using this publisher
    public void publishMsg(String txt) {
        try {            
            TopicPublisher tp = topicSess.createPublisher(top);
            TextMessage msg = topicSess.createTextMessage(txt);
            tp.publish(msg);
            topicConn.stop();
        } catch (JMSException e) {
            logger.throwing("TopPublisher","publishMsg",e);
            //e.printStackTrace();
        }
    }
    
}
