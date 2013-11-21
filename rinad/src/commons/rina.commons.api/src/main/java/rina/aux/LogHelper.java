package rina.aux;

import org.apache.log4j.Logger;

public class LogHelper {
	
	public static String getLibrinaLogLevel() {
		String librinaLogLevel = "DBG";
		Logger librinaLogger = Logger.getRootLogger().getLoggerRepository().getLogger("librina");
		if (librinaLogger != null) {
			librinaLogLevel = librinaLogger.getLevel().toString();
			
			if (librinaLogLevel.equals("TRACE")) {
				librinaLogLevel = "DBG";
			}else if (librinaLogLevel.equals("DEBUG")) {
				librinaLogLevel = "DBG";
			}else if (librinaLogLevel.equals("INFO")) {
				librinaLogLevel = "INFO";
			}else if (librinaLogLevel.equals("WARN")) {
				librinaLogLevel = "WARN";
			}else if (librinaLogLevel.equals("ERROR")) {
				librinaLogLevel = "ERR";
			}else if (librinaLogLevel.equals("FATAL")) {
				librinaLogLevel = "CRIT";
			}else{
				librinaLogLevel = "DBG";
			}
		}
		
		return librinaLogLevel;
	}

}
