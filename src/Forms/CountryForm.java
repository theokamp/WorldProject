package Forms;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.*;

public class CountryForm {

    Label lblCode, lblName, lblContinent, lblRegion, lblSurfaceArea,
          lblIndependenceDay, lblPopulation, lblLifeExpectancy, lblGNP,
          lblLocalName, lblGovernmentForm, lblHeadOfState, lblCapital,
          lblCode2;

    TextField txtCode, txtName, txtContinent, txtRegion, txtSurfaceArea,
              txtIndependenceDay, txtPopulation, txtLifeExpectancy, txtGNP,
              txtLocalName, txtGovernmentForm, txtHeadOfState, txtCapital,
              txtCode2;

    Button okButton;

    Stage stage;

    public void show() {

        // LABELS AND TEXT FIELDS INITIALIZATION
        lblCode = new Label("Code: ");
        lblCode.setFont(Font.font("Arial", 13));
        txtCode = new TextField();

        lblName = new Label("Name: ");
        lblName.setFont(Font.font("Arial", 13));
        txtName = new TextField();

        lblContinent = new Label("Continent: ");
        lblContinent.setFont(Font.font("Arial", 13));
        txtContinent = new TextField();

        lblRegion = new Label("Region: ");
        lblRegion.setFont(Font.font("Arial", 13));
        txtRegion = new TextField();

        lblSurfaceArea = new Label("Surface Area: ");
        lblSurfaceArea.setFont(Font.font("Arial", 13));
        txtSurfaceArea = new TextField();

        lblIndependenceDay = new Label("Independence Day: ");
        lblIndependenceDay.setFont(Font.font("Arial", 13));
        txtIndependenceDay = new TextField();

        lblPopulation = new Label("Population: ");
        lblPopulation.setFont(Font.font("Arial", 13));
        txtPopulation = new TextField();

        lblLifeExpectancy = new Label("Life Expectancy: ");
        lblLifeExpectancy.setFont(Font.font("Arial", 13));
        txtLifeExpectancy = new TextField();

        lblGNP = new Label("GNP: ");
        lblGNP.setFont(Font.font("Arial", 13));
        txtGNP = new TextField();

        lblLocalName = new Label("Local Name: ");
        lblLocalName.setFont(Font.font("Arial", 13));
        txtLocalName = new TextField();

        lblGovernmentForm = new Label("Government Form: ");
        lblGovernmentForm.setFont(Font.font("Arial", 13));
        txtGovernmentForm = new TextField();

        lblHeadOfState = new Label("Head Of State: ");
        lblHeadOfState.setFont(Font.font("Arial", 13));
        txtHeadOfState = new TextField();

        lblCapital = new Label("Capital: ");
        lblCapital.setFont(Font.font("Arial", 13));
        txtCapital = new TextField();

        lblCode2 = new Label("Code 2: ");
        lblCode2.setFont(Font.font("Arial", 13));
        txtCode2 = new TextField();

        // OK BUTTON INITIALIZATION
        okButton = new Button("OK");
        okButton.setFont(Font.font("Arial", 13));

        // LAYOUT PANES
        HBox codeBox = new HBox();
        codeBox.getChildren().addAll(lblCode, txtCode);
        codeBox.setAlignment(Pos.CENTER);

        HBox nameBox = new HBox();
        nameBox.getChildren().addAll(lblName, txtName);
        nameBox.setAlignment(Pos.CENTER);

        HBox regionBox = new HBox();
        regionBox.getChildren().addAll(lblRegion, txtRegion);
        regionBox.setAlignment(Pos.CENTER);

        HBox surfaceAreaBox = new HBox();
        surfaceAreaBox.getChildren().addAll(lblSurfaceArea, txtSurfaceArea);
        surfaceAreaBox.setAlignment(Pos.CENTER);

        HBox independenceDayBox = new HBox();
        independenceDayBox.getChildren().addAll(lblIndependenceDay, txtIndependenceDay);
        independenceDayBox.setAlignment(Pos.CENTER);

        HBox populationBox = new HBox();
        populationBox.getChildren().addAll(lblPopulation, txtPopulation);
        populationBox.setAlignment(Pos.CENTER);

        HBox lifeExpectancyBox = new HBox();
        lifeExpectancyBox.getChildren().addAll(lblLifeExpectancy, txtLifeExpectancy);
        lifeExpectancyBox.setAlignment(Pos.CENTER);

        HBox gnpBox = new HBox();
        gnpBox.getChildren().addAll(lblGNP, txtGNP);
        gnpBox.setAlignment(Pos.CENTER);

        HBox localNameBox = new HBox();
        localNameBox.getChildren().addAll(lblLocalName, txtLocalName);
        localNameBox.setAlignment(Pos.CENTER);

        HBox governmentFormBox = new HBox();
        governmentFormBox.getChildren().addAll(lblGovernmentForm, txtGovernmentForm);
        governmentFormBox.setAlignment(Pos.CENTER);

        HBox headOfStateBox = new HBox();
        headOfStateBox.getChildren().addAll(lblHeadOfState, txtHeadOfState);
        headOfStateBox.setAlignment(Pos.CENTER);

        HBox capitalBox = new HBox();
        capitalBox.getChildren().addAll(lblCapital, txtCapital);
        capitalBox.setAlignment(Pos.CENTER);

        HBox code2Box = new HBox();
        code2Box.getChildren().addAll(lblCode2, txtCode2);
        code2Box.setAlignment(Pos.CENTER);

        HBox okButtonBox = new HBox();
        okButtonBox.getChildren().addAll(okButton);
        okButtonBox.setAlignment(Pos.CENTER);

        VBox container = new VBox();
        container.getChildren().addAll(codeBox, nameBox, regionBox, surfaceAreaBox, independenceDayBox, populationBox,
                lifeExpectancyBox, gnpBox, localNameBox, governmentFormBox, headOfStateBox, capitalBox, code2Box,
                okButtonBox);
        container.setAlignment(Pos.CENTER);

        // SCENE INITIALIZATION
        Scene scene = new Scene(container);

        // STAGE INITIALIZATION
        stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Country");
        stage.setX((Screen.getPrimary().getVisualBounds().getWidth()-500)/2);
        stage.setY((Screen.getPrimary().getVisualBounds().getHeight()-500)/2);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

}
