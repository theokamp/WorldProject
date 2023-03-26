package utilities;

import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;

public class ErrorMessage {
    Label lblMsg;
    Button okButton;
    Stage stage;
    String message;
    String title;

    public ErrorMessage(String message, String title) {
        this.message = message;
        this.title = title;
    }

    public void show() {
        // initializing message label
        lblMsg = new Label(message);
        lblMsg.setFont(Font.font("Arial",13));

        // initializing button
        okButton = new Button();
        Image img = new Image("ok.png");
        ImageView imgView = new ImageView(img);
        imgView.setFitWidth(20);
        imgView.setFitHeight(20);
        okButton.setGraphic(imgView);
        okButton.setOnAction(e -> okButtonClick());

        // init layout pane
        VBox pane = new VBox();
        pane.getChildren().addAll(lblMsg, okButton);
        pane.setAlignment(Pos.CENTER);

        // init scene
        Scene scene = new Scene(pane);

        // init stage
        stage = new Stage();
        stage.setScene(scene);
        stage.setX((Screen.getPrimary().getVisualBounds().getWidth()-250)/2);
        stage.setY((Screen.getPrimary().getVisualBounds().getHeight()-250)/2);
        stage.setWidth(250);
        stage.setHeight(250);
        stage.initStyle(StageStyle.UTILITY);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }

    public void okButtonClick() {
        stage.close();
    }
}
