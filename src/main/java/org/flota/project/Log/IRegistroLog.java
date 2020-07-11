package org.flota.project.Log;

public interface IRegistroLog {
    public void log( String msg);
    public void info( String msg);
    public void warning( String msg);
    public void error( String msg);
}