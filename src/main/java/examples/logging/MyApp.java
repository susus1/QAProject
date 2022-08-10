package examples.logging;

//Import log4j classes.
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


/**
 * See Automatic Configuration in https://logging.apache.org/log4j/2.x/manual/configuration.html 
 * @author Owner
 *
 */
public class MyApp {

 // Define a static logger variable 
 private static final Logger logger = LogManager.getLogger();

 public static void main(final String... args) {

     // Set up a simple configuration that logs on the console.

     logger.trace("Entering application.");
     Bar bar = new Bar();
     if (!bar.doIt()) {
         logger.error("Didn't do it.");
     }
     logger.trace("Exiting application.");
 }
}