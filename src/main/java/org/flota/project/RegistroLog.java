package org.flota.project;


public class RegistroLog {

    public static RegistroLog registro;

    public static synchronized RegistroLog getInstance()  {

        if (registro == null)    {
                registro = new RegistroLog();
        }
        return registro;
    }

    public void log (String mensaje)    {

        System.out.println( mensaje );
    }
}