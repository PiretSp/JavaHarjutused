package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import static javafx.geometry.Pos.CENTER;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */

public class Koristaja extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane aken = new Pane();
        Scene peaaken = new Scene(aken, 500, 500);
        primaryStage.setScene(peaaken);
        primaryStage.show();

        Label kiri = new Label("Koristaja");
        kiri.setLayoutX(150);
        kiri.setLayoutY(225);
        kiri.setStyle("-fx-font-size: 50pt;");

        aken.getChildren().addAll(kiri);

        for (int i = 0; i < 50; i++) {

        Circle ring = new Circle(Math.random()*400, Math.random()*400, 30, Color.BLACK);
        ring.setOnMouseEntered(event -> {
            ring.setFill(Color.TRANSPARENT);
        });

        aken.getChildren().addAll(ring);
        }

    }
}
