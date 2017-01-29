package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */

public class Pixelchaser extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane aken = new Pane();
        Scene peaaken = new Scene(aken, 500, 500);
        primaryStage.setScene(peaaken);
        primaryStage.show();


        for (int i = 0; i < 10; i++) {
            Rectangle ristkülik = new Rectangle (Math.random()*400, Math.random()*400, 50, 70);
            ristkülik.setOnMouseClicked(event -> {
                Rectangle kast = (Rectangle) event.getTarget();
                if (kast.getWidth() == 50){
                    kast.setWidth(25);
                    kast.setHeight(35);
                } else {
                    kast.setFill(Color.TRANSPARENT);
                }
            });
            aken.getChildren().addAll(ristkülik);
        }
    }
}
