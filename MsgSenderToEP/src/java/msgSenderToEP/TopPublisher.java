/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package msgSenderToEP;

import javax.jms.*;
/**
 * 
 * @author abyx
 */
public class TopPublisher {
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
            System.out.println("Failed to start the connection during creation of a sender in topic " + topName);
        }
    }
    
    public void publishMsg(String txt) {
        try {            
            TopicPublisher tp = topicSess.createPublisher(top);
            TextMessage msg = topicSess.createTextMessage(txt);
            tp.publish(msg);
            topicConn.stop();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
    
}
