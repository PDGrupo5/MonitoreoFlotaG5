package org.flota.project.models;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class Ventana extends Application {

    private Mapa mapaBase;

    @Override
    public void start(Stage stage) throws Exception {

        // set the title and size of the stage and show it
        stage.setTitle("Sistema de Monitoreo de Vehiculos");
        stage.setWidth(800);
        stage.setHeight(700);
        stage.show();

        // create a JavaFX scene with a stack pane as the root node and add it to the
        // scene
        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane);
        stage.setScene(scene);

        // create a MapView to display the map and add it to the stack pane
        mapaBase = new Mapa();
        mapaBase.imprimeCoordenadasActual();
        stackPane.getChildren().add(mapaBase.getMapView());

        Button btnNuevo = new Button();
        btnNuevo.setText("Nuevo");
        btnNuevo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //muestraNuevaVentana();
                clonarVentana();
            }
        });

        stackPane.getChildren().add(btnNuevo);
        StackPane.setAlignment(btnNuevo, Pos.TOP_LEFT);
    }

    public void muestraNuevaVentana() {
        Stage stage = new Stage();
        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane);
        stage.setScene(scene);

        // Clonacion de MapaBase
        Mapa mapaBase2 = (Mapa) mapaBase.copiar();

        mapaBase2.imprimeCoordenadasActual();
        stackPane.getChildren().add(mapaBase2.getMapView());

        stage.show();
    }

    public void clonarVentana() {
        Stage stage = new Stage();
        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane);
        stage.setScene(scene);
        stage.setWidth(800);
        stage.setHeight(700);

        // Clonacion de MapaBase
        Mapa mapaBase2;
        mapaBase2 = (Mapa) mapaBase.clone();
        mapaBase2.imprimeCoordenadasActual();
        stackPane.getChildren().add(mapaBase2.getMapView());
        stage.show();

    } 
    

}