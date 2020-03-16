import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.geometry.Pos;



public class A2 extends Application {

    Text label1 = new Text(" Item");
    Text label2 = new Text("     ");
    Text label3 = new Text("#");
    Text label4 = new Text(" ");
    Text label5 = new Text("Value");
    Text label6 = new Text("           ");
    Text label7 = new Text("Price");
    Text label8 = new Text(" ");
    Text label9 = new Text(" ");
    Text label10 = new Text(" ");
    Text label11 = new Text("Total");
    Text label12 = new Text(" ");
    TextField text1 = new TextField();
    TextField text1_2 = new TextField();
    TextField text1_3 = new TextField();
    TextField text2 = new TextField();
    TextField text2_2 = new TextField();
    TextField text2_3 = new TextField();
    TextField text3 = new TextField();
    TextField text3_2 = new TextField();
    TextField text3_3 = new TextField();


    void applyCensorRules() {

        double number1, number2, number3, value1, value2, value3, price1, price2, price3, sum;


        number1 = Double.parseDouble(text2.getText());
        value1 = Double.parseDouble(text3.getText());
        price1 = number1 * value1;
        long p1 = Math.round(price1 * 100);
        label8.setText(String.valueOf(p1 / 100.0));
        sum = price1;
        long total1 = Math.round(sum * 100);
        label12.setText(String.valueOf(total1 / 100.0));


        number2 = Double.parseDouble(text2_2.getText());
        value2 = Double.parseDouble(text3_2.getText());
        price2 = number2 * value2;
        long p2 = Math.round(price2 * 100);
        label9.setText(String.valueOf(p2 / 100.0));
        sum = price1 + price2;
        long total2 = Math.round(sum * 100);
        label12.setText(String.valueOf(total2 / 100.0));


        number3 = Double.parseDouble(text2_3.getText());
        value3 = Double.parseDouble(text3_3.getText());
        price3 = number3 * value3;
        long p3 = Math.round(price3 * 100);
        label10.setText(String.valueOf(p3 / 100.0));

        sum = price1 + price2 + price3;
        long total3 = Math.round(sum * 100);
        label12.setText(String.valueOf(total3 / 100.0));
    }

    @Override
    public void start(Stage primaryStage) {

        text1.setPrefWidth(130);
        text1_2.setPrefWidth(130);
        text1_3.setPrefWidth(130);
        text2.setPrefWidth(70);
        text2_2.setPrefWidth(70);
        text2_3.setPrefWidth(70);
        text3.setPrefWidth(90);
        text3_2.setPrefWidth(90);
        text3_3.setPrefWidth(90);
        label8.setWrappingWidth(60);
        label9.setWrappingWidth(60);
        label10.setWrappingWidth(60);
        label12.setWrappingWidth(60);
        label6.setWrappingWidth(276);

        text2.setOnKeyReleased(e -> applyCensorRules());
        text2_2.setOnKeyReleased(e -> applyCensorRules());
        text2_3.setOnKeyReleased(e -> applyCensorRules());
        text3.setOnKeyReleased(e -> applyCensorRules());
        text3_2.setOnKeyReleased(e -> applyCensorRules());
        text3_3.setOnKeyReleased(e -> applyCensorRules());

        VBox root = new VBox();
        root.setAlignment(Pos.BASELINE_LEFT);

        HBox hbox1 = new HBox();


        VBox vbox11 = new VBox();
        vbox11.getChildren().add(label1);
        vbox11.getChildren().add(text1);
        vbox11.getChildren().add(text1_2);
        vbox11.getChildren().add(text1_3);
        vbox11.setSpacing(10);
        vbox11.getChildren().add(label4);
        hbox1.getChildren().add(vbox11);


        VBox vbox12 = new VBox();
        vbox12.getChildren().add(label3);
        vbox12.getChildren().add(text2);
        vbox12.getChildren().add(text2_2);
        vbox12.getChildren().add(text2_3);
        vbox12.setSpacing(10);
        hbox1.getChildren().add(vbox12);

        VBox vbox13 = new VBox();
        vbox13.getChildren().add(label5);
        vbox13.getChildren().add(text3);
        vbox13.getChildren().add(text3_2);
        vbox13.getChildren().add(text3_3);
        vbox13.setSpacing(10);
        hbox1.getChildren().add(vbox13);


        hbox1.getChildren().add(label2);

        VBox vbox14 = new VBox();
        vbox14.getChildren().add(label7);
        vbox14.getChildren().add(label8);
        vbox14.getChildren().add(label9);
        vbox14.getChildren().add(label10);
        vbox14.setSpacing(20);
        hbox1.getChildren().add(vbox14);


        HBox hbox2 = new HBox();
        hbox2.getChildren().add(label11);
        hbox2.getChildren().add(label6);
        hbox2.getChildren().add(label12);

        root.getChildren().add(hbox1);
        root.getChildren().add(hbox2);


        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Price Calculation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}