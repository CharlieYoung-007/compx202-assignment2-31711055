import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.scene.text.Font;

public class A2 extends Application {

	Text label1 = new Text(" Item");
	Text label2 = new Text("     ");
	Text label3 = new Text("#");
	Text label4 = new Text(" ");
	Text label5 = new Text("Value");
	Text label6 = new Text(" ");
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





	void applyCensorRules()
	{
//		String censored, replacement, rawText, censoredText;
//		censored = text1.getText();
//		replacement = text2.getText();
//		rawText = text3.getText();
//		censoredText = rawText.replace(censored, replacement);
//		label7.setText(censoredText);

		String item1, number1, value1, price1, item2, number2, value2, price2, item3, number3, value3, price3;
		item1 = text1.getText();
		number1 = text2.getText();
		value1 = text3.getText();
		price1 = value1.replace(item1, number1);
		label7.setText(price1);
	}
	
	@Override
    public void start(Stage primaryStage) {

//        label7.setFont(new Font(24));
		text1.setPrefWidth(130);
		text1_2.setPrefWidth(130);
		text1_3.setPrefWidth(130);
		text2.setPrefWidth(70);
		text2_2.setPrefWidth(70);
		text2_3.setPrefWidth(70);
		text3.setPrefWidth(90);
		text3_2.setPrefWidth(90);
		text3_3.setPrefWidth(90);


        text1.setOnKeyReleased(e -> applyCensorRules());
        text2.setOnKeyReleased(e -> applyCensorRules());
        text3.setOnKeyReleased(e -> applyCensorRules());

        VBox root = new VBox();
        root.setAlignment(Pos.BASELINE_LEFT);

		HBox hbox1 = new HBox();


		VBox vbox11 = new VBox();
		vbox11.getChildren().add(label1);
		vbox11.getChildren().add(text1);
		vbox11.getChildren().add(text1_2);
		vbox11.getChildren().add(text1_3);
		vbox11.setSpacing(10);
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
		vbox14.setSpacing(10);
		hbox1.getChildren().add(vbox14);


		root.getChildren().add(hbox1);
		
//        root.getChildren().add(label4);
//		root.getChildren().add(label5);
//        root.getChildren().add(text3);
        root.getChildren().add(label6);
        root.getChildren().add(label11);
        root.getChildren().add(label12);

        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Price Calculation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}