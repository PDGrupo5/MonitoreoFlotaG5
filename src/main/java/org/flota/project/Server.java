package org.flota.project;

import com.esri.arcgisruntime.ArcGISRuntimeEnvironment;

import org.flota.project.models.Ventana;

import javafx.application.Application;

public class Server {

    public static void main(String[] args) {

        RegistroLog.getInstance().log("Iniciando servidor");

        ArcGISRuntimeEnvironment.setInstallDirectory("/home/jerson/arcgis-runtime-sdk-java-100.8.0");

        Application.launch(Ventana.class, args);
    }

}