package forms;

// JavaFX libraries
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
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

        // Grid Pane
        GridPane countryFormPane = new GridPane();
        countryFormPane.setPadding(new Insets(10));
        countryFormPane.setAlignment(Pos.TOP_CENTER);
        countryFormPane.setHgap(5);
        countryFormPane.setVgap(5);

        /* LABELS AND TEXT FIELDS INITIALIZATION */
        // Code Label col:0, row:0
        lblCode = new Label("Code: ");
        lblCode.setFont(Font.font("Arial", 13));
        countryFormPane.add(lblCode, 0, 0);
        GridPane.setHalignment(lblCode, HPos.RIGHT);
        GridPane.setValignment(lblCode, VPos.CENTER);

        // Code TextField col:1, row:0
        txtCode = new TextField();
        txtCode.setFont(Font.font("Arial", 12));
        countryFormPane.add(txtCode, 1, 0);
        GridPane.setHalignment(txtCode, HPos.LEFT);
        GridPane.setValignment(txtCode, VPos.CENTER);

        // Name Label col:0, row:1
        lblName = new Label("Name: ");
        lblName.setFont(Font.font("Arial", 13));
        countryFormPane.add(lblName, 0, 1);
        GridPane.setHalignment(lblName, HPos.RIGHT);
        GridPane.setValignment(lblName, VPos.CENTER);

        // Name TextField col:1, row:1
        txtName = new TextField();
        txtName.setFont(Font.font("Arial", 12));
        countryFormPane.add(txtName, 1, 1);
        GridPane.setHalignment(txtName, HPos.LEFT);
        GridPane.setValignment(txtName, VPos.CENTER);

        // Continent Label col:0, row:2
        lblContinent = new Label("Continent: ");
        lblContinent.setFont(Font.font("Arial", 13));
        countryFormPane.add(lblContinent, 0, 2);
        GridPane.setHalignment(lblContinent, HPos.RIGHT);
        GridPane.setValignment(lblContinent, VPos.CENTER);

        // Continent ComboBox col:1, row:2
        continentCombo = new ComboBox<>();
        continentCombo.setEditable(true);
        continentCombo.getItems().addAll("Asia", "Europe", "North America", "Africa", "Oceania",
                                              "Antarctica", "South America");
        continentCombo.setValue(continentCombo.getItems().get(0));
        new AutoCompleteComboBoxListener<>(continentCombo);
        countryFormPane.add(continentCombo, 1, 2);
        GridPane.setHalignment(continentCombo, HPos.LEFT);
        GridPane.setValignment(continentCombo, VPos.CENTER);

        // Region Label col:0, row:3
        lblRegion = new Label("Region: ");
        lblRegion.setFont(Font.font("Arial", 13));
        countryFormPane.add(lblRegion, 0, 3);
        GridPane.setHalignment(lblRegion, HPos.RIGHT);
        GridPane.setValignment(lblRegion, VPos.CENTER);

        // Region TextField col:1, row:3
        txtRegion = new TextField();
        txtRegion.setFont(Font.font("Arial", 12));
        countryFormPane.add(txtRegion, 1, 3);
        GridPane.setHalignment(txtRegion, HPos.LEFT);
        GridPane.setValignment(txtRegion, VPos.CENTER);

        // Surface Area Label col:0, row:4
        lblSurfaceArea = new Label("Surface Area: ");
        lblSurfaceArea.setFont(Font.font("Arial", 13));
        countryFormPane.add(lblSurfaceArea, 0, 4);
        GridPane.setHalignment(lblSurfaceArea, HPos.RIGHT);
        GridPane.setValignment(lblSurfaceArea, VPos.CENTER);

        // Surface Area TextField col:1, row:4
        txtSurfaceArea = new TextField();
        txtSurfaceArea.setFont(Font.font("Arial", 12));
        countryFormPane.add(txtSurfaceArea, 1, 4);
        GridPane.setHalignment(txtSurfaceArea, HPos.LEFT);
        GridPane.setValignment(txtSurfaceArea, VPos.CENTER);

        // Independence Year Label col:0, row:5
        lblIndependenceDay = new Label("Independence Day: ");
        lblIndependenceDay.setFont(Font.font("Arial", 13));
        countryFormPane.add(lblIndependenceDay, 0, 5);
        GridPane.setHalignment(lblIndependenceDay, HPos.RIGHT);
        GridPane.setValignment(lblIndependenceDay, VPos.CENTER);

        // Independence Year TextField col:1, row:5
        txtIndependenceDay = new TextField();
        txtIndependenceDay.setFont(Font.font("Arial", 12));
        countryFormPane.add(txtIndependenceDay, 1, 5);
        GridPane.setHalignment(txtIndependenceDay, HPos.LEFT);
        GridPane.setValignment(txtIndependenceDay, VPos.CENTER);

        // Population Label col:0, row:6
        lblPopulation = new Label("Population: ");
        lblPopulation.setFont(Font.font("Arial", 13));
        countryFormPane.add(lblPopulation, 0, 6);
        GridPane.setHalignment(lblPopulation, HPos.RIGHT);
        GridPane.setValignment(lblPopulation, VPos.CENTER);

        // Population TextField col:1, row:6
        txtPopulation = new TextField();
        txtPopulation.setFont(Font.font("Arial", 12));
        countryFormPane.add(txtPopulation, 1, 6);
        GridPane.setHalignment(txtPopulation, HPos.LEFT);
        GridPane.setValignment(txtPopulation, VPos.CENTER);

        // Life Expectancy Label col:0, row:7
        lblLifeExpectancy = new Label("Life Expectancy: ");
        lblLifeExpectancy.setFont(Font.font("Arial", 13));
        countryFormPane.add(lblLifeExpectancy, 0, 7);
        GridPane.setHalignment(lblLifeExpectancy, HPos.RIGHT);
        GridPane.setValignment(lblLifeExpectancy, VPos.CENTER);

        // Life Expectancy TextField col:1, row:7
        txtLifeExpectancy = new TextField();
        txtLifeExpectancy.setFont(Font.font("Arial", 12));
        countryFormPane.add(txtLifeExpectancy, 1, 7);
        GridPane.setHalignment(txtLifeExpectancy, HPos.LEFT);
        GridPane.setValignment(txtLifeExpectancy, VPos.CENTER);

        // GNP Label col:0, row:8
        lblGNP = new Label("GNP: ");
        lblGNP.setFont(Font.font("Arial", 13));
        countryFormPane.add(lblGNP, 0, 8);
        GridPane.setHalignment(lblGNP, HPos.RIGHT);
        GridPane.setValignment(lblGNP, VPos.CENTER);

        // GNP TextField col:1, row:8
        txtGNP = new TextField();
        txtGNP.setFont(Font.font("Arial", 12));
        countryFormPane.add(txtGNP, 1, 8);
        GridPane.setHalignment(txtGNP, HPos.LEFT);
        GridPane.setValignment(txtGNP, VPos.CENTER);

        // Local Name Label col:0, row:9
        lblLocalName = new Label("Local Name: ");
        lblLocalName.setFont(Font.font("Arial", 13));
        countryFormPane.add(lblLocalName, 0, 9);
        GridPane.setHalignment(lblLocalName, HPos.RIGHT);
        GridPane.setValignment(lblLocalName, VPos.CENTER);

        // Local Name TextField col:1, row:9
        txtLocalName = new TextField();
        txtLocalName.setFont(Font.font("Arial", 12));
        countryFormPane.add(txtLocalName, 1, 9);
        GridPane.setHalignment(txtLocalName, HPos.RIGHT);
        GridPane.setValignment(txtLocalName, VPos.CENTER);

        // Government Form Label col:0, row:10
        lblGovernmentForm = new Label("Government Form: ");
        lblGovernmentForm.setFont(Font.font("Arial", 13));
        countryFormPane.add(lblGovernmentForm, 0, 10);
        GridPane.setHalignment(lblGovernmentForm, HPos.RIGHT);
        GridPane.setValignment(lblGovernmentForm, VPos.CENTER);

        // Government Form TextField col:1, row:10
        txtGovernmentForm = new TextField();
        txtGovernmentForm.setFont(Font.font("Arial", 12));
        countryFormPane.add(txtGovernmentForm, 1, 10);
        GridPane.setHalignment(txtGovernmentForm, HPos.LEFT);
        GridPane.setValignment(txtGovernmentForm, VPos.CENTER);

        // Head Of State Label col:0, row:11
        lblHeadOfState = new Label("Head Of State: ");
        lblHeadOfState.setFont(Font.font("Arial", 13));
        countryFormPane.add(lblHeadOfState, 0, 11);
        GridPane.setHalignment(lblHeadOfState, HPos.RIGHT);
        GridPane.setValignment(lblHeadOfState, VPos.CENTER);

        // Head Of State TextField col:1, row:11
        txtHeadOfState = new TextField();
        txtHeadOfState.setFont(Font.font("Arial", 12));
        countryFormPane.add(txtHeadOfState, 1, 11);
        GridPane.setHalignment(txtHeadOfState, HPos.LEFT);
        GridPane.setValignment(txtHeadOfState, VPos.CENTER);

        // Capital Label col:0, row:12
        lblCapital = new Label("Capital: ");
        lblCapital.setFont(Font.font("Arial", 13));
        countryFormPane.add(lblCapital, 0, 12);
        GridPane.setHalignment(lblCapital, HPos.RIGHT);
        GridPane.setValignment(lblCapital, VPos.CENTER);

        // Capital TextField col:1, row:12
        txtCapital = new TextField();
        txtCapital.setFont(Font.font("Arial", 12));
        countryFormPane.add(txtCapital, 1, 12);
        GridPane.setHalignment(txtCapital, HPos.LEFT);
        GridPane.setValignment(txtCapital, VPos.CENTER);

        // Code 2 Label col:0, row:13
        lblCode2 = new Label("Code 2: ");
        lblCode2.setFont(Font.font("Arial", 13));
        countryFormPane.add(lblCode2, 0, 13);
        GridPane.setHalignment(lblCode2, HPos.RIGHT);
        GridPane.setValignment(lblCode2, VPos.CENTER);

        // Code 2 TextField col:1, row:13
        txtCode2 = new TextField();
        txtCode2.setFont(Font.font("Arial", 12));
        countryFormPane.add(txtCode2, 1, 13);
        GridPane.setHalignment(txtCode2, HPos.LEFT);
        GridPane.setValignment(txtCode2, VPos.CENTER);

        // OK BUTTON INITIALIZATION
        okButton = new Button("OK");
        okButton.setFont(Font.font("Arial", 13));
        okButton.setOnAction(e -> okBtnClick());
        countryFormPane.add(okButton, 0, 14, 2, 1);
        GridPane.setHalignment(okButton, HPos.CENTER);
        GridPane.setValignment(okButton, VPos.CENTER);

        // SCENE INITIALIZATION
        Scene scene = new Scene(countryFormPane);

        // STAGE INITIALIZATION
        stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Country");
        stage.setX((Screen.getPrimary().getVisualBounds().getWidth()-500)/2);
        stage.setY((Screen.getPrimary().getVisualBounds().getHeight()-500)/2);
        stage.setWidth(500);
        stage.setHeight(600);
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
