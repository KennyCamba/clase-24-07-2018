/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosimple;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Formulario extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello World!");
        VBox root = new VBox();
        root.setPadding(new Insets(10, 30, 20, 30));
        root.setAlignment(Pos.CENTER);
        HBox box = new HBox(new Label("Formulario de Registro"));
        box.setPadding(new Insets(15, 0, 15, 0)); 
        box.setAlignment(Pos.CENTER); 
        root.getChildren().add(box); 
        GridPane gp = new GridPane();
        
        //Añadir una columna entera en el grid pane 
        gp.addColumn(0, new Label("nombre"), new Label("cedula"), new Label("direccion"));
        
        //Espacio vertical
        gp.setVgap(10);
        //Espacio horizontal
        gp.setHgap(10); 
        root.getChildren().add(gp);
        
        TextField txtNombre = new TextField();
        TextField txtCedula = new TextField();
        TextArea txtDireccion = new TextArea();
        gp.addColumn(1, txtNombre, txtCedula, txtDireccion); 
        txtDireccion.setMaxWidth(250); 
        txtDireccion.setMaxHeight(100);
        Button limpiar = new Button("Limpiar");
        Button guardar = new Button("Guardar");
        Button salir = new Button("Salir");
        HBox botones = new HBox(10, limpiar, guardar, salir);
        root.getChildren().add(botones);
        botones.setAlignment(Pos.CENTER);
        botones.setPadding(new Insets(15, 0, 15, 0)); 
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}   
