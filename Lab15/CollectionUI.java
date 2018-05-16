package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    Button button1, button2;
    Stage window;
    Scene scene1, scene2;
    Label label1;
    public static void main(String[] args) {
        launch(args);
    }

    @Override

    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window = primaryStage;

        label1 = new Label("Welcome to my program!");
        button1 = new Button("Start!");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 - welcome screen
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 300, 250);

        //Layout 2 - fuck go back

        button2 = new Button("Fuck go back");
        button2.setOnAction(e -> window.setScene(scene1));


        StackPane layout2 = new StackPane();
        scene2 = new Scene(layout2, 300, 250);
        layout2.getChildren().add(button2);
        window.setScene(scene1);
        window.setTitle("CollectionUI");
        window.show();
    }
}
