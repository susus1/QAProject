package examples.logging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Runner {
	public static Logger LOGGER = LogManager.getLogger();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOGGER.info("info");
		LOGGER.debug("debug");
		LOGGER.fatal("fatal");
	}

}
