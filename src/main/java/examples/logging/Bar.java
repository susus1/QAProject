package examples.logging;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
 
public class Bar {
  static final Logger logger = LogManager.getLogger();
 
  public boolean doIt() {
    logger.traceEntry();
    logger.error("Did it again!");
    return logger.traceExit(false);
  }
}