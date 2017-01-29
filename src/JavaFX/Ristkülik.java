package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ristkülik extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox aken = new VBox();
        aken.setPadding(new Insets(10,10,10,10));
        Scene peaaken = new Scene(aken, 500, 500);
        primaryStage.setScene(peaaken);
        primaryStage.show();

        Label xLabel = new Label("Sisesta laius");
        TextField x = new TextField();
        Label yLabel = new Label("Sisesta kõrgus");
        TextField y = new TextField();


        Button submit = new Button("Joonista!");
        submit.setLayoutX(170);
        submit.setOnAction(event -> {
             System.out.println(x.getText() + " " + y.getText());

            //Joonista joon vastavalt numbritele
            Rectangle ristkülik = new Rectangle();
            ristkülik.setWidth(Double.parseDouble(x.getText()));
            ristkülik.setHeight(Double.parseDouble(y.getText()));

            Pane pane = new Pane();
            Scene teineaken = new Scene(pane, 500, 500);
            primaryStage.setScene(teineaken);
            primaryStage.show();

            pane.getChildren().addAll(ristkülik);

        });
        aken.getChildren().addAll(xLabel, x, yLabel, y, submit);




    }

}
