// JavaFX libraries
import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.*;
import javafx.scene.control.*;

// Project libraries
import forms.*;

public class Main extends Application {
    Button btnCountry;

    @Override
    public void start(Stage stage) {
        btnCountry = new Button("Country");
        btnCountry.setFont(Font.font("Arial",13));
        btnCountry.setOnAction(e -> countryBtn());


        HBox hPane = new HBox();
        hPane.getChildren().add(btnCountry);
        hPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(hPane);

        stage.setScene(scene);
        stage.setTitle("World Project");
        stage.setX((Screen.getPrimary().getVisualBounds().getWidth()-700)/2);
        stage.setY((Screen.getPrimary().getVisualBounds().getHeight()-500)/2);
        stage.setWidth(700);
        stage.setHeight(500);
        stage.show();
    }

    public static void main(String[] args) {
	    launch(args);
    }

    public void countryBtn(){
        CountryForm countryForm = new CountryForm();
        countryForm.show();
    }
}
