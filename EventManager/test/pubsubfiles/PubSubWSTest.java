/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsubfiles;

import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicSession;
import pubsub.PubSubWS;
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
public class PubSubWSTest {
    
    public PubSubWSTest() {
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
     * Test of initEventManager method, of class PubSubWS.
     */
    @Test
    public void testInitEventManager() {
        System.out.println("initEventManager");
        PubSubWS instance = new PubSubWS();
        instance.initEventManager();
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull("Error, PubSubManager not created.", instance.psm);
    }

    /**
     * Test of sendMessage method, of class PubSubWS.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        String topic = "";
        String msg = "";
        PubSubWS instance = new PubSubWS();
        instance.initEventManager();
        instance.sendMessage(topic, msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTopic method, of class PubSubWS.
     */
    @Test
    public void testCreateTopic() {
        System.out.println("createTopic");
        String topic = "topic1";
        PubSubWS instance = new PubSubWS();
        instance.initEventManager();
        instance.createTopic(topic);
        boolean expResult = true;
        boolean result = instance.psm.existsInTopicsByString(topic);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTopicConnection method, of class PubSubWS.
     
    @Test
    public void testGetTopicConnection() {
        System.out.println("getTopicConnection");
        String topic = "";
        PubSubWS instance = new PubSubWS();
        TopicConnection expResult = null;
        TopicConnection result = instance.getTopicConnection(topic);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getTopicSession method, of class PubSubWS.
     
    @Test
    public void testGetTopicSession() {
        System.out.println("getTopicSession");
        String topic = "";
        PubSubWS instance = new PubSubWS();
        TopicSession expResult = null;
        TopicSession result = instance.getTopicSession(topic);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getTopic method, of class PubSubWS.
     
    @Test
    public void testGetTopic() {
        System.out.println("getTopic");
        String topic = "";
        PubSubWS instance = new PubSubWS();
        Topic expResult = null;
        Topic result = instance.getTopic(topic);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
}
