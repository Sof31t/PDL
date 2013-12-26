/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package msgSenderToEP;

import java.util.HashMap;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicSession;
//import javax.jms.TopicPublisher;

/**
 *
 * @author abyx
 */
public class PubSubManager extends Thread{
    
    //private HashMap<TopicHandler,String> topicsByHandler;
    // The maps containing all the registered TopicHandler objects 
    private HashMap<String,TopicHandler> topicsByString;
    
    public PubSubManager () {
        
    }
    
    public void run(){
        // init list of Topics (loading a file ?)
        addTopic("fromDQM");
        addTopic("fromMDM");
    }
    
    // classic getter
    /*public TopicHandler getTopic(String s){
        return topicsByString.get(s);
    }*/
    
    // get Topic Connection
    public TopicConnection getTopicConnection (String t){
        TopicConnection tc = null;
        tc = topicsByString.get(t).getConnection();
        return tc;
    }
    public TopicSession getTopicSession (String t){
        TopicSession tc = null;
        tc = topicsByString.get(t).getSession();
        return tc;
    }
    public Topic getTopic (String t){
        Topic tc = null;
        if (existsInTopicsByString(t)) {
            tc = topicsByString.get(t).getTopic();
        }
        return tc;
    }
    
    // checks if the topic has already been registered.
    private boolean existsInTopicsByString(String t){
        return topicsByString.containsKey(t);
    }
    
    // adds a topic to the list of registered topics
    public String addTopic (String name) {
        TopicHandler t = new TopicHandler(name);
        //topicsByHandler.put(t,name);
        topicsByString.put(name, t);
        return name;
    }
    
    // send a message 
    // @param topic : topic name 
    // @param txt : content of the message to send
    public void send (String topic, String txt) {
        if (existsInTopicsByString(topic)){
        // retrieving the TopicHandler
        TopicHandler th = topicsByString.get(topic);        
        // retrieving both the session and the topic to create a temporary publisher
        TopPublisher tp = new TopPublisher(th.getConnection(),th.getSession(),th.getTopic());
        // publishing the JMS message
        tp.publishMsg(txt);
        } else {
            // throw of an error
            throw(new Error("Error : Topic to send to does not exist. Use addTopic fist"));
        }
    }
    
    // subscribes a component to a topic
    // @param i : name of the topic
    // @param subscriber : name of the subscriber
    /*public String subscribe (String top, String subscriber){
        TopicHandler th = topicsByString.get(top);
        TopSubscriber ts = new TopSubscriber(th.getSession(), th.getTopic());
        ts.subscribeTopic(subscriber);
        // @TODO : link to the component somehow ?
        return th.getTopic().toString();
    }    
    public void unsubscribe (String top, String subscriber){
        TopicHandler th = topicsByString.get(top);
        TopSubscriber ts = new TopSubscriber(th.getSession(), th.getTopic());
        ts.unsubscribeTopic(); 
    }*/
}