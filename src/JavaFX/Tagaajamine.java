package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */

public class Tagaajamine extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane aken = new Pane();
        Scene peaaken = new Scene(aken, 500, 500);
        primaryStage.setScene(peaaken);
        primaryStage.show();

        Circle ring = new Circle(Math.random()*400, Math.random()*400, 30, Color.BLACK);
        ring.setOnMouseEntered(event -> {
            ring.setCenterX(Math.random()*400);
            ring.setCenterY(Math.random()*400);
            ring.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        });

        aken.getChildren().addAll(ring);
    }
}
