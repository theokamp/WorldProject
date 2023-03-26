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

    TextField txtCode, txtName, txtRegion, txtSurfaceArea,
              txtIndependenceDay, txtPopulation, txtLifeExpectancy, txtGNP,
              txtLocalName, txtGovernmentForm, txtHeadOfState, txtCapital,
              txtCode2;

    ComboBox<String> continentCombo;

    Button okButton;

    Stage stage;

    String msg;

    public void show() {

        // LABELS AND TEXT FIELDS INITIALIZATION
        lblCode = new Label("Code: ");
        lblCode.setFont(Font.font("Arial", 13));
        txtCode = new TextField();
        txtCode.setFont(Font.font("Arial", 12));

        lblName = new Label("Name: ");
        lblName.setFont(Font.font("Arial", 13));
        txtName = new TextField();
        txtName.setFont(Font.font("Arial", 12));


        lblContinent = new Label("Continent: ");
        lblContinent.setFont(Font.font("Arial", 13));
        continentCombo = new ComboBox<>();
        continentCombo.setEditable(true);
        continentCombo.getItems().addAll("Asia", "Europe", "North America", "Africa", "Oceania",
                                              "Antarctica", "South America");
        continentCombo.setValue(continentCombo.getItems().get(0));
        new AutoCompleteComboBoxListener<>(continentCombo);


        lblRegion = new Label("Region: ");
        lblRegion.setFont(Font.font("Arial", 13));
        txtRegion = new TextField();
        txtRegion.setFont(Font.font("Arial", 12));

        lblSurfaceArea = new Label("Surface Area: ");
        lblSurfaceArea.setFont(Font.font("Arial", 13));
        txtSurfaceArea = new TextField();
        txtSurfaceArea.setFont(Font.font("Arial", 12));

        lblIndependenceDay = new Label("Independence Day: ");
        lblIndependenceDay.setFont(Font.font("Arial", 13));
        txtIndependenceDay = new TextField();
        txtIndependenceDay.setFont(Font.font("Arial", 12));

        lblPopulation = new Label("Population: ");
        lblPopulation.setFont(Font.font("Arial", 13));
        txtPopulation = new TextField();
        txtPopulation.setFont(Font.font("Arial", 12));

        lblLifeExpectancy = new Label("Life Expectancy: ");
        lblLifeExpectancy.setFont(Font.font("Arial", 13));
        txtLifeExpectancy = new TextField();
        txtLifeExpectancy.setFont(Font.font("Arial", 12));

        lblGNP = new Label("GNP: ");
        lblGNP.setFont(Font.font("Arial", 13));
        txtGNP = new TextField();
        txtGNP.setFont(Font.font("Arial", 12));

        lblLocalName = new Label("Local Name: ");
        lblLocalName.setFont(Font.font("Arial", 13));
        txtLocalName = new TextField();
        txtLocalName.setFont(Font.font("Arial", 12));

        lblGovernmentForm = new Label("Government Form: ");
        lblGovernmentForm.setFont(Font.font("Arial", 13));
        txtGovernmentForm = new TextField();
        txtGovernmentForm.setFont(Font.font("Arial", 12));

        lblHeadOfState = new Label("Head Of State: ");
        lblHeadOfState.setFont(Font.font("Arial", 13));
        txtHeadOfState = new TextField();
        txtHeadOfState.setFont(Font.font("Arial", 12));

        lblCapital = new Label("Capital: ");
        lblCapital.setFont(Font.font("Arial", 13));
        txtCapital = new TextField();
        txtCapital.setFont(Font.font("Arial", 12));

        lblCode2 = new Label("Code 2: ");
        lblCode2.setFont(Font.font("Arial", 13));
        txtCode2 = new TextField();
        txtCode2.setFont(Font.font("Arial", 12));

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
        continentBox.getChildren().addAll(lblContinent, continentCombo);
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
        msg += txtCode.getText().length() != 3 ? "Code must be 3 characters\n" : "";

        // NAME CHECK
        msg += txtName.getText().length() > 52 ? "Name must be up to 52 characters only\n"
                : txtName.getText().isEmpty() ? "Name can't be blank\n" : "";

        // REGION
        msg += txtRegion.getText().length() > 26 ? "Region must be up to 26 characters\n"
                : txtRegion.getText().isEmpty() ? "Region can't be blank\n" : "";

        // SURFACE AREA
        Double surfArea = null;
        if (!txtSurfaceArea.getText().isEmpty()) {
            try {
                surfArea = Double.parseDouble(txtSurfaceArea.getText());
            } catch (NumberFormatException e) {
                msg += "Surface Area must be decimal number\n";
                e.printStackTrace();
            }
        }

        // INDEPENDENCE YEAR
        Integer indYear = null;
        if (!txtIndependenceDay.getText().isEmpty()) {
            try {
                indYear = Integer.parseInt(txtIndependenceDay.getText());
                if (indYear > 2023)
                    msg += "Independence Year can't be bigger than current year\n";
            } catch (NumberFormatException e) {
                msg += "Independence Year must be a valid year\n";
                e.printStackTrace();
            }
        }

        // POPULATION
        Integer pop = null;
        if (!txtPopulation.getText().isEmpty()) {
            try {
                pop = Integer.parseInt(txtPopulation.getText());
                if (pop > 2000000000)
                    msg += "Population must be smaller than 2 billions\n";
            } catch (NumberFormatException e) {
                msg += "Population must be a valid number\n";
                e.printStackTrace();
            }

        }
        else
            msg += "Population can't be blank\n";

        // LIFE EXPECTANCY
        Double lifeExp = null;
        if (!txtLifeExpectancy.getText().isEmpty()) {
            try {
                lifeExp = Double.parseDouble(txtLifeExpectancy.getText());
            } catch (NumberFormatException e) {
                msg += "Life Expectancy must be a valid number\n";
                e.printStackTrace();
            }
        }

        // GNP CHECK
        Double gnpNum = null;
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
        msg += txtCode2.getText().length() != 2 ? "Code 2 must be 2 characters\n" : "";

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
            System.out.println("CONTINENT        : " + continentCombo.getValue());
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
