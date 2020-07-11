package org.flota.project.Log;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import org.flota.project.config.Settings;

public class FileLogger  implements IRegistroLog{

    private Logger logger;
    private FileHandler fh;

    public FileLogger() {
        this.logger = Logger.getLogger(Settings.FILE_LOG_NAME); 
        try {
            this.fh = new FileHandler(Settings.FILE_LOG_NAME_PATH);  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);
        } catch (Exception e) {
            e.printStackTrace();  
        }
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