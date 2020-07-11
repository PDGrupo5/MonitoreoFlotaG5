package org.flota.project;

import org.flota.project.Log.ConsoleLogger;
import org.flota.project.Log.FileLogger;
import org.flota.project.Log.IRegistroLog;
import org.flota.project.config.Settings;

public class RegistroLog {

    public static RegistroLog registro;
    private IRegistroLog logger;

    public static synchronized RegistroLog getInstance()  {

        if (registro == null)    {
                registro = new RegistroLog();
        }
        return registro;
    }

    private RegistroLog() {
        if (Settings.FILE_LOG_NAME_ACTIVE){
            this.logger = new FileLogger();
        } else {
            this.logger = new ConsoleLogger();
        }

    }

    public void log (String mensaje)    {
        logger.log(mensaje);
    }
}