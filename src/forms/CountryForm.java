package forms;

// JavaFX libraries
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.*;

// Project libraries
import utilities.*;

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

    String msg;

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
        okButton.setOnAction(e -> okBtnClick());

        // LAYOUT PANES
        HBox codeBox = new HBox();
        codeBox.getChildren().addAll(lblCode, txtCode);
        codeBox.setAlignment(Pos.CENTER);

        HBox nameBox = new HBox();
        nameBox.getChildren().addAll(lblName, txtName);
        nameBox.setAlignment(Pos.CENTER);

        HBox continentBox = new HBox();
        continentBox.getChildren().addAll(lblContinent, txtContinent);
        continentBox.setAlignment(Pos.CENTER);

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
        container.getChildren().addAll(codeBox, nameBox, continentBox, regionBox, surfaceAreaBox, independenceDayBox, populationBox,
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

    private boolean validation() {
        msg = "";

        // CODE CHECK
        msg += txtCode.getText().length() > 3 ? "Code must be up to 3 characters\n"
                : txtCode.getText().isEmpty() ? "Code can't be blank\n" : "";

        // NAME CHECK
        msg += txtName.getText().length() > 52 ? "Name must be up to 52 characters only\n"
                : txtName.getText().isEmpty() ? "Name can't be blank\n" : "";

        // CONTINENT
        msg += txtContinent.getText().isEmpty() ? "Continent can't be blank\n" : "";

        // REGION
        msg += txtRegion.getText().length() > 26 ? "Region must be up to 26 characters\n"
                : txtRegion.getText().isEmpty() ? "Region can't be blank\n" : "";

        // SURFACE AREA
        double surfArea = 0.0;
        if (!txtSurfaceArea.getText().isEmpty()) {
            try {
                surfArea = Double.parseDouble(txtSurfaceArea.getText());
            } catch (NumberFormatException e) {
                msg += "Surface Area must be decimal number\n";
                e.printStackTrace();
            }
        }

        // INDEPENDENCE YEAR
        int indYear = 0;
        if (!txtIndependenceDay.getText().isEmpty()) {
            try {
                indYear = Integer.parseInt(txtIndependenceDay.getText());
            } catch (NumberFormatException e) {
                msg += "Independence Year must be a valid year\n";
                e.printStackTrace();
            }
            if (indYear > 2023) {
                msg += "Independence Year can't be bigger than current year\n";
            }
        }

        // POPULATION
        int pop = 0;
        if (!txtPopulation.getText().isEmpty()) {
            try {
                pop = Integer.parseInt(txtPopulation.getText());
            } catch (NumberFormatException e) {
                msg += "Population must be a valid number\n";
                e.printStackTrace();
            }
            if (pop > 2000000000)
                msg += "Population must be smaller than 2 billions\n";
        }
        else
            msg += "Population can't be blank\n";

        // LIFE EXPECTANCY
        double lifeExp = 0.0;
        if (!txtLifeExpectancy.getText().isEmpty()) {
            try {
                lifeExp = Double.parseDouble(txtLifeExpectancy.getText());
            } catch (NumberFormatException e) {
                msg += "Life Expectancy must be a valid number\n";
                e.printStackTrace();
            }
        }

        // GNP CHECK
        double gnpNum = 0.0;
        if (!txtGNP.getText().isEmpty()) {
            try {
                gnpNum = Double.parseDouble(txtGNP.getText());
            } catch (NumberFormatException e) {
                msg += "GNP must be a valid decimal number\n";
                e.printStackTrace();
            }
        }

        // LOCAL NAME CHECK
        msg += txtLocalName.getText().length() > 45 ? "Local Name must be up to 45 characters\n"
                : txtLocalName.getText().isEmpty() ? "Local Name can't be blank\n" : "";

        // GOVERNMENT FORM
        msg += txtGovernmentForm.getText().length() > 45 ? "Government Form must be up to 45 characters\n"
                : txtGovernmentForm.getText().isEmpty() ? "Government Form can't be blank\n" : "";

        // HEAD OF STATE
        msg += txtHeadOfState.getText().length() > 60 ? "Head Of State must be up to 60 characters\n" : "";

        // CODE 2
        msg += txtCode2.getText().length() > 2 ? "Code 2 must be up to 2 characters\n" : "";

        return msg.isEmpty();
    }

    public void okBtnClick() {
        if (!validation()) {
            ErrorMessage error = new ErrorMessage(msg, "ERROR");
            error.show();
        }
        else {
            System.out.println("CODE             : " + txtCode.getText());
            System.out.println("NAME             : " + txtName.getText());
            System.out.println("CONTINENT        : " + txtContinent.getText());
            System.out.println("REGION           : " + txtRegion.getText());
            System.out.println("SURFACE AREA     : " + txtSurfaceArea.getText());
            System.out.println("INDEPENDENCE YEAR: " + txtIndependenceDay.getText());
            System.out.println("POPULATION       : " + txtPopulation.getText());
            System.out.println("LIFE EXPECTANCY  : " + txtLifeExpectancy.getText());
            System.out.println("GNP              : " + txtGNP.getText());
            System.out.println("LOCAL NAME       : " + txtLocalName.getText());
            System.out.println("GOVERNMENT FORM  : " + txtGovernmentForm.getText());
            System.out.println("HEAD OF STATE    : " + txtHeadOfState.getText());
            System.out.println("CAPITAL          : " + txtCapital.getText());
            System.out.println("CODE 2           : " + txtCode2.getText());
            stage.close();
        }
    }
}
