package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Arrays;

/**
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */

public class Ring extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox aken = new VBox();
        Scene peaaken = new Scene(aken, 500, 500);
        primaryStage.setScene(peaaken);
        primaryStage.show();

        Label xLabel = new Label("Sisesta x");
        TextField x = new TextField();
        Label yLabel = new Label("Sisesta y");
        TextField y = new TextField();
        Label raadiusLabel = new Label("Sisesta raadius");
        TextField raadius = new TextField();

        Button submit = new Button("Joonista!");
        submit.setLayoutX(170);
        submit.setOnAction(event -> {
            //küsida input
            String xKoordinaat = x.getText();
            String yKoordinaat = y.getText();
            String raadius2 = raadius.getText();
            System.out.println(xKoordinaat + " " + yKoordinaat + " " + raadius2);

            //Joonista joon vastavalt numbritele
            Circle ring = new Circle();
            ring.setCenterX(Double.parseDouble(x.getText()));
            ring.setCenterY(Double.parseDouble(y.getText()));
            ring.setRadius(Double.parseDouble(raadius.getText()));

            Pane pane = new Pane();
            Scene teineaken = new Scene(pane, 500, 500);
            primaryStage.setScene(teineaken);
            primaryStage.show();

            pane.getChildren().addAll(ring);

        });
        aken.getChildren().addAll(xLabel, x, yLabel, y, raadiusLabel, raadius, submit);




    }

}
