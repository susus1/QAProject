package testing;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TargetClass_TEST {
	
    @Test
    public void constructor_TEST(){
        TargetClass object = new TargetClass();

        // expectation, result
        assertTrue(object instanceof TargetClass);
    }

    @Test
    public void getID_TEST(){
        TargetClass object = new TargetClass();

        // expectation, result
        assertEquals(0, object.id);
    }

    @Test
    public void rtnMessage_TEST(){
        TargetClass object = new TargetClass();
        String result = object.rtnMessage();

        // expectation, result
        assertEquals("Hello World", result);
    }

}
