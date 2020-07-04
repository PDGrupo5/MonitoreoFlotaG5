package org.flota.project.models;

public class Conductor {

    private String id; // uuid
    private String nombre;
    private String dni;

    private String estado; // ocupado/libre
    private Vehiculo vehiculo;
    private Double latitud;  // ubicacion en tiempo real
    private Double longitud; // ubicacion en tiempo real
    // GPOINT

    private Double porcentajeBateria;
    
}