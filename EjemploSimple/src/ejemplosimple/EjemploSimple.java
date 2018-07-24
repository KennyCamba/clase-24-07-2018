/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosimple;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Municipio de Gye
 */
public class EjemploSimple extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       HBox root = new HBox(); //creamos contenedor raiz
        Button bt1 = new Button("Boton 1"); //creamos el boton1
        Button bt2 = new Button("Boton 2"); //creamos e boton2
        Button bt3 = new Button("Boton 3"); //creamos el boton3
        root.getChildren().add(bt1); //agrego el botón bt1 al contenedor
        root.getChildren().add(bt2); //agrego el botón bt2 al contenedor
        Scene scene = new Scene(root,400,500);  //creo el Scene principal
			                                           //el constructor recibe el contenedor principal
						   //fijamos el tamano de la pantalla
        primaryStage.setScene(scene); //agregamos el scene al primaryStage
        primaryStage.setTitle("Mi primera interfaz gráfica");
        primaryStage.show(); //mostramos la ventana
        
        root.getChildren().add(bt3);
        root.setSpacing(10); 
        root.setAlignment(Pos.TOP_CENTER);
        bt1.setDisable(false); 
        TextField tf = new TextField();
        root.getChildren().add(tf);
         
        //Expresion lambda
        bt2.setOnAction(e -> {
//            String text = 
//                    ((TextField)root.getChildren().get(root.getChildren().size() - 1)).getText();
            
            String text = tf.getText();
            System.out.println(text);
        });
        
        //Clase anonima
       
        bt1.setOnAction(new EventHandler<ActionEvent>(){
           @Override
           public void handle(ActionEvent event) {
               System.out.println("Boton 1");
           }
           
        }); 
        
        bt3.setOnAction(new ManejarEvento()); 
    }
    
    //Clase interna
    private class ManejarEvento implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            System.out.println("Boton 3");
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
