package es.ieslosmontecillos.di_t1a1_shanshangfeng;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/*
 * @author: Shangfeng Shan
 * @date:  ${date}
 * */
public class Hello_World_FX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Hello World");
        btn1.setText("Hello World");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello World");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn1);
        Scene scene = new Scene(root,700,600);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
