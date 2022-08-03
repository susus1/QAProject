package testing;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TargetClassTest {
	
    @Test
    public void constructorTest(){
        TargetClass object = new TargetClass();

        // expectation, result
        assertTrue(object instanceof TargetClass);
    }

    @Test
    public void getIdTest(){
        TargetClass object = new TargetClass();

        // expectation, result
        assertEquals(0, object.id);
    }

    @Test
    public void rtnMessageTest(){
        TargetClass object = new TargetClass();
        String result = object.rtnMessage();

        // expectation, result
        assertEquals("Hello World", result);
    }
    
    @Test
    public void rtnMessageTrue(){
        TargetClass object = new TargetClass();
        String result = object.rtnMessage(true);

        // expectation, result
        assertEquals("Hello World", result);
    }
    
    @Test
    public void rtnMessageFalse(){
        TargetClass object = new TargetClass();
        String result = object.rtnMessage(false);
        assertEquals("GoodBye!", result);
    }

}
