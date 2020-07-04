package org.flota.project.models;

import java.util.ArrayList;

public class Ruta implements IRuta{

    //private ArrayList<Entrega> entrega;
    private Conductor conductor;

    public void calcularRuta(){
        /*
        Generar el orden en el que se irán generando las entregas/ordenes
        */
        // RedisGIS
    }

    @Override
    public IRuta clonar() {
        // TODO Auto-generated method stub
        return new Ruta();
    }
    
    //XXX: funcion guardar la ruta

    //XXX: hallar distancia entre dos puntos

}