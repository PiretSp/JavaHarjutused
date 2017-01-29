package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Arrays;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */

public class Joon extends Application {

        @Override
        public void start (Stage primaryStage) throws Exception {
            Pane pane = new Pane();
            Scene scene = new Scene(pane, 500, 500);

            TextField textField = new TextField();
            Button submit = new Button("Joonista!");
            submit.setLayoutX(170);
            submit.setOnAction(event -> {
                //küsida input
                String input = textField.getText();
                System.out.println(input);

                //lahuta numbrid
                String[] k = input.split("-");
                System.out.println(Arrays.toString(k));
                int[] intK = new int[k.length];
                for (int i = 0; i < k.length; i++) {
                    intK[i] = Integer.parseInt(k[i]);
                }

                //Joonista joon vastavalt numbritele
                Line line = new Line(intK[0], intK[1], intK[2], intK[3]);
                pane.getChildren().add(line);

            });

            pane.getChildren().addAll(textField, submit);
            primaryStage.setScene(scene);
            primaryStage.show();
        }

}
