package sample;
import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class Main extends Application {

    ArrayList<String> arr = new ArrayList<String>();

    public ArrayList sortOfList(Label label) {
        arr.clear();
        Collections.sort(arr);
        for(String counter: arr){
            arr.add(counter);
        }
        label.setText("Array after sort: "+arr);
        return arr;
    }

    public boolean search(TextField t, Label label) {
        String[] k = t.getText().split(" ");
        if(k.length != 1 ) {
            label.setText("Only 1 element acceptable.");
            return false;
        }
        else {
            for(String ell: arr) {
                if(ell.compareTo(k[0]) > 0) {

                    label.setText("Yes, this element appears in your array.");
                    return true;
                }
            }
            label.setText("No, it doesn't appear in your array.");
            return false;
        }
    }

    public ArrayList addToList(TextField t, Label l) {
        for (String x : t.getText().split(" ") ) {
            arr.add(x);
        }
        l.setText("New elements: "+ arr.toString());
        return arr;
    }


    public void dellFromList(Label label) {
        arr.clear();
        label.setText("Array was cleared");
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Collection UI");

        VBox vb = new VBox();
        vb.setPadding(new Insets(100, 100, 100, 100)
        );
        vb.setSpacing(50);



        Label lbl = new Label("Collection UI");
        lbl.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        vb.getChildren().add(lbl);


        Label label = new Label();
        vb.getChildren().add(label);

        TextField textField = new TextField();
        textField.setPrefWidth(110);


        vb.getChildren().add(textField);


        Button btn1 = new Button();
        btn1.setText("~Add an element~");
        btn1.setOnAction(e ->addToList(textField, label));
        vb.getChildren().add(btn1);



        Button btn2 = new Button();
        btn2.setText("~Clear the array~");
        btn2.setOnAction(e ->dellFromList(label));
        vb.getChildren().add(btn2);

        Button btn3 = new Button();
        btn3.setText("~Collection sort~");
        btn3.setOnAction(e -> sortOfList(label));
        vb.getChildren().add(btn3);

        Button btn4 = new Button();
        btn4.setText("~Element search~");
        btn4.setOnAction(e->search(textField,label));
        vb.getChildren().add(btn4);


        Button btn5 = new Button();
        btn5.setText("Exit");
        btn5.setOnAction(e ->{primaryStage.close();} );

        vb.getChildren().add(btn5);

        Scene scene = new Scene(vb);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
