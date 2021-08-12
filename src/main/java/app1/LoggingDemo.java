package app1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
	private static Logger Logger = LogManager.getLogger(LoggingDemo.class);
	public static void main(String[] args) {
		Logger.fatal("fatal message");
		Logger.debug("this is a debug message");
		Logger.warn("warning message");
		Logger.error("error message");
		Logger.info("info message");
		Logger.trace("trace message");
	}

}
