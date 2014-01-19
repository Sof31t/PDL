/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsubfiles;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.JMSException;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicSession;
import pubsubclasses.TopicHandler;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abyx
 */
public class TopicHandlerTest {
    
    public TopicHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTopic method, of class TopicHandler.
     */
    /*@Test
    public void testGetTopicName() {
        System.out.println("getTopicName test init.");
        // Creation of the name of the topic we want to create
        String topicName = "MyTopic"; 
        TopicHandler instance = new TopicHandler(topicName);
        // The expected result is the same as the the one we created
        String expResult = topicName; 
        String result = "";
        try {
            // call of the getTopicName method to retrieve the String name of the Topic
            result = instance.getTopic().getTopicName(); 
        } catch (JMSException ex) {
            Logger.getLogger(TopicHandlerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        // In case of difference between the two results, printing an error message  showing the two Strings
        assertEquals("Error the two topic names are different. Expected : " + expResult + ", found : " + result,expResult, result);
        System.out.println("End of getTopicName test.");
    }*/
}
