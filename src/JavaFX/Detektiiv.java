package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */
public class Detektiiv extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane aken = new Pane();
        Scene peaaken = new Scene(aken, 500, 500);
        peaaken.setFill(Color.BLACK);
        primaryStage.setScene(peaaken);
        primaryStage.show();

        Circle ring = new Circle(Math.random()*400, Math.random()*400, 30, Color.BLACK);
        ring.setOnMouseEntered(event -> {
            ring.setFill(Color.RED);
        });

        Circle ring2 = new Circle(Math.random()*400, Math.random()*400, 30, Color.BLACK);
        ring2.setOnMouseEntered(event -> {
            ring2.setFill(Color.RED);
        });

        Circle ring3 = new Circle(Math.random()*400, Math.random()*400, 30, Color.BLACK);
        ring3.setOnMouseEntered(event -> {
            ring3.setFill(Color.RED);
        });

        aken.getChildren().addAll(ring, ring2, ring3);

    }
}