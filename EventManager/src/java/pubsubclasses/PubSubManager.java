/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsubclasses;

import java.util.HashMap;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;

/**
 *
 * @author abyx
 */
public class PubSubManager {
    
    /* private HashMap<TopicHandler,String> topicsByHandler; */
    /* The maps containing all the registered TopicHandler objects */
    private HashMap<String,TopicHandler> topicsByString;
    private TopicConnectionFactory myConnectionFactory;
    
    public PubSubManager (TopicConnectionFactory tcf) {
        topicsByString = new HashMap<String,TopicHandler>();
        myConnectionFactory = tcf;
    }
        
    
    /** getTopic Connection
    * @param t : topic name
    * @result : TopicConnection wanted
    * */
    public TopicConnection getTopicConnection (String t){
        TopicConnection tc = null;
        /* if in map */
        if (existsInTopicsByString(t)) { 
            tc = topicsByString.get(t).getConnection();
        }
        return tc;
    }
    /** getTopicSession
    * @param t : topic name
    * @result : TopicSession wanted
    * */
    public TopicSession getTopicSession (String t){
        TopicSession tc = null;
        /* if in map*/
        if (existsInTopicsByString(t)) { 
            tc = topicsByString.get(t).getSession();
        }
        return tc;
    }
    /** getTopic
    * @param t : topic name
    * @result : Topic wanted
    */
    public Topic getTopic (String t){
        Topic tc = null;
        /* if in map*/
        if (existsInTopicsByString(t)) { 
            tc = topicsByString.get(t).getTopic();
        }
        return tc;
    }
    
    /** checks if the topic has already been registered.
    * @param t : topic name
    * @result : true if exists in map, false otherwise
    */
    public boolean existsInTopicsByString(String t){
        return topicsByString.containsKey(t);
    }
    
    /** adds a topic to the list of registered topics
    * @param name : topic name
    * @result : topic name to store 
    * */
    public String addTopic (String name) {
        TopicHandler t = new TopicHandler(name, myConnectionFactory);
        
        topicsByString.put(name, t);
        return name;
    }
    
    /** send a message 
    * @param topic : topic name 
    * @param txt : content of the message to send
    */
    public void send (String topic, String txt) throws Exception {
        if (existsInTopicsByString(topic)){
        /* retrieving the TopicHandler*/
        TopicHandler th = topicsByString.get(topic);        
        /* retrieving both the session and the topic to create a temporary publisher*/
        TopPublisher tp = new TopPublisher(th.getConnection(),th.getSession(),th.getTopic());
        /* publishing the JMS message*/
        tp.publishMsg(txt);
        } else {
            /* throw of an exception*/
            throw new Exception("Error : Topic to send to does not exist. Use addTopic fist");
        }
    }
    
}