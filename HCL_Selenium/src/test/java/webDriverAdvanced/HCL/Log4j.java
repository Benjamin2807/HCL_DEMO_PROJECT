package webDriverAdvanced.HCL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4j {
  
	
	private static Logger log = LogManager.getLogger(Log4j.class.getName());
	
	@Test
  public void log() 
  {
	  
	  log.debug("Debug");
	  log.info("Info");
	  log.warn("Warning");
	  log.error("Error");
	  log.fatal("Fatal");
  }
}
