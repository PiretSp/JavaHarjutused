package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by piret on 27.01.17.
 */

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */

    public class FooridUnenäos extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
            Pane aken = new Pane();
            Scene peaaken = new Scene(aken, 500, 500);
            primaryStage.setScene(peaaken);
            primaryStage.show();

            Circle ring = new Circle(Math.random()*400, Math.random()*400, 30, Color.RED);
            ring.setOnMouseEntered(event -> {
                ring.setFill(Color.GREEN);
            });

            Circle ring2 = new Circle(Math.random()*400, Math.random()*400, 30, Color.RED);
            ring2.setOnMouseEntered(event -> {
                ring2.setFill(Color.GREEN);
            });

            Circle ring3 = new Circle(Math.random()*400, Math.random()*400, 30, Color.RED);
            ring3.setOnMouseEntered(event -> {
                ring3.setFill(Color.GREEN);
            });

            Circle ring4 = new Circle(Math.random()*400, Math.random()*400, 30, Color.RED);
            ring4.setOnMouseEntered(event -> {
                ring4.setFill(Color.GREEN);
            });

            Circle ring5 = new Circle(Math.random()*400, Math.random()*400, 30, Color.RED);
            ring5.setOnMouseEntered(event -> {
                ring5.setFill(Color.GREEN);
            });

            Circle ring6 = new Circle(Math.random()*400, Math.random()*400, 30, Color.RED);
            ring6.setOnMouseEntered(event -> {
                ring6.setFill(Color.GREEN);
            });

            aken.getChildren().addAll(ring, ring2, ring3, ring4, ring5, ring6);

        }
    }

