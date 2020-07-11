package org.flota.project.Log;

import java.util.logging.Logger;
import java.util.logging.Level;

public class ConsoleLogger  implements IRegistroLog{

    private Logger logger;
    public ConsoleLogger() {
            this.logger 
            = Logger.getLogger(ConsoleLogger.class.getName()); 
    }

    @Override
    public void log(final String msg) {
        info(msg);
    }

    @Override
    public void info(final String msg) {
        logger.setLevel(Level.INFO); 
        logger.info(msg); 
    }

    @Override
    public void warning(final String msg) {
        logger.setLevel(Level.WARNING); 
        logger.warning(msg); 

    }

    @Override
    public void error(final String msg) {
        logger.setLevel(Level.SEVERE); 
        logger.severe(msg);

    }
    
}