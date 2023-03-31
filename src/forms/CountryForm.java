package forms;

// JavaFX libraries
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.*;

// Project libraries
import utilities.*;
import models.*;

public class CountryForm {

    Label lblCode, lblName, lblContinent, lblRegion, lblSurfaceArea,
          lblIndependenceYear, lblPopulation, lblLifeExpectancy, lblGNP,
          lblLocalName, lblGovernmentForm, lblHeadOfState, lblCapital,
          lblCode2;

    TextField txtCode, txtName, txtRegion, txtSurfaceArea,
              txtIndependenceYear, txtPopulation, txtLifeExpectancy, txtGNP,
              txtLocalName, txtGovernmentForm, txtHeadOfState, txtCapital,
              txtCode2;

    ComboBox<String> continentCombo;

    Button okButton;

    Stage stage;

    String msg;

    private Country aruba, afghanistan, angola, anguilla;

    public void show() {


        aruba = new Country("ABW", "Aruba", "North America", "Caribbean", 193.00,
                null, 103000, 78.4, 828.00, 793.00, "Aruba",
                "Nonmetropolitan Territory of The Netherlands", "Beatrix", 129,
                "AW");

        afghanistan = new Country("AFG", "Afghanistan", "Asia", "Southern and Central Asia",
                652090.00, 1919, 22720000, 45.9, 5976.00, null,
                "Afganistan/Afqanestan", "Islamic Emirate", "Mohammad Omar", 1,
                "AF");

        angola = new Country("AGO","Angola", "Africa", "Central Africa", 1246700.00,
                1975, 12878000, 38.3, 6648.00, 7984.00, "Angola",
                "Republic", "José Eduardo dos Santos", 56, "AO");

        anguilla = new Country("AIA", "Anguilla", "North America", "Caribbean", 96.00,
                null, 8000, 76.1, 63.20, null, "Anguilla",
                "Dependent Territory of the UK", "Elisabeth II", 62, "AI");

        /* LABELS AND TEXT FIELDS INITIALIZATION */
        // List View
        ListView<Country> listViewCountries = new ListView<>();
        listViewCountries.getItems().addAll(aruba, afghanistan, angola, anguilla);
        listViewCountries.getSelectionModel().selectedItemProperty().addListener((ob, ov, nv) -> {
            loadForm(nv);
        });
        // Code Label and TextField
        lblCode = new Label("Code: ");
        lblCode.setFont(Font.font("Arial", 13));
        txtCode = new TextField();
        txtCode.setFont(Font.font("Arial", 12));
        // Name Label and TextField
        lblName = new Label("Name: ");
        lblName.setFont(Font.font("Arial", 13));
        txtName = new TextField();
        txtName.setFont(Font.font("Arial", 12));
        // Continent Label and ComboBox
        lblContinent = new Label("Continent: ");
        lblContinent.setFont(Font.font("Arial", 13));
        continentCombo = new ComboBox<>();
        continentCombo.setEditable(true);
        continentCombo.getItems().addAll("Asia", "Europe", "North America", "Africa", "Oceania",
                "Antarctica", "South America");
        continentCombo.setValue(continentCombo.getItems().get(0));
        new AutoCompleteComboBoxListener<>(continentCombo);
        // Region Label and TextField
        lblRegion = new Label("Region: ");
        lblRegion.setFont(Font.font("Arial", 13));
        txtRegion = new TextField();
        txtRegion.setFont(Font.font("Arial", 12));
        // Surface Area Label and TextField
        lblSurfaceArea = new Label("Surface Area: ");
        lblSurfaceArea.setFont(Font.font("Arial", 13));
        txtSurfaceArea = new TextField();
        txtSurfaceArea.setFont(Font.font("Arial", 12));
        // Independence Year Label and TextField
        lblIndependenceYear = new Label("Independence Day: ");
        lblIndependenceYear.setFont(Font.font("Arial", 13));
        txtIndependenceYear = new TextField();
        txtIndependenceYear.setFont(Font.font("Arial", 12));
        // Population Label and TextField
        lblPopulation = new Label("Population: ");
        lblPopulation.setFont(Font.font("Arial", 13));
        txtPopulation = new TextField();
        txtPopulation.setFont(Font.font("Arial", 12));
        // Life Expectancy Label and TextField
        lblLifeExpectancy = new Label("Life Expectancy: ");
        lblLifeExpectancy.setFont(Font.font("Arial", 13));
        txtLifeExpectancy = new TextField();
        txtLifeExpectancy.setFont(Font.font("Arial", 12));
        // GNP Label and TextField
        lblGNP = new Label("GNP: ");
        lblGNP.setFont(Font.font("Arial", 13));
        txtGNP = new TextField();
        txtGNP.setFont(Font.font("Arial", 12));
        // Local Name Label and TextField
        lblLocalName = new Label("Local Name: ");
        lblLocalName.setFont(Font.font("Arial", 13));
        txtLocalName = new TextField();
        txtLocalName.setFont(Font.font("Arial", 12));
        // Government Form label and TextField
        lblGovernmentForm = new Label("Government Form: ");
        lblGovernmentForm.setFont(Font.font("Arial", 13));
        txtGovernmentForm = new TextField();
        txtGovernmentForm.setFont(Font.font("Arial", 12));
        // Head Of State Label and TextField
        lblHeadOfState = new Label("Head Of State: ");
        lblHeadOfState.setFont(Font.font("Arial", 13));
        txtHeadOfState = new TextField();
        txtHeadOfState.setFont(Font.font("Arial", 12));
        // Capital Label and TextField
        lblCapital = new Label("Capital: ");
        lblCapital.setFont(Font.font("Arial", 13));
        txtCapital = new TextField();
        txtCapital.setFont(Font.font("Arial", 12));
        // Code 2 Label and TextField
        lblCode2 = new Label("Code 2: ");
        lblCode2.setFont(Font.font("Arial", 13));
        txtCode2 = new TextField();
        txtCode2.setFont(Font.font("Arial", 12));
        // OK Button
        okButton = new Button("OK");
        okButton.setFont(Font.font("Arial", 13));
        okButton.setOnAction(e -> okBtnClick());
        // Empty Region Helps to visualize better the grid pane
        Region emptyRegion = new Region();

        /* Grid Pane initialization */
        GridPane countryFormPane = new GridPane();
        countryFormPane.setPadding(new Insets(10));
        countryFormPane.setAlignment(Pos.TOP_CENTER);
        countryFormPane.setHgap(5);
        countryFormPane.setVgap(5);
        countryFormPane.setPrefWidth(700);

        ColumnConstraints col0 = new ColumnConstraints();
        col0.setPrefWidth(200);
        col0.setHalignment(HPos.LEFT);
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setFillWidth(true);
        col1.setHgrow(Priority.ALWAYS);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setFillWidth(true);
        col2.setHgrow(Priority.ALWAYS);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setHgrow(Priority.ALWAYS);

        countryFormPane.getColumnConstraints().addAll(col0, col1, col2,col3);

        // List View col:0, row:0
        countryFormPane.add(listViewCountries, 0, 0);
        GridPane.setRowSpan(listViewCountries, 16);
        GridPane.setHalignment(listViewCountries, HPos.LEFT);
        // Code Label  inside grid pane col:1, row:0
        countryFormPane.add(lblCode, 1, 0);
        GridPane.setHalignment(lblCode, HPos.RIGHT);
        GridPane.setValignment(lblCode, VPos.CENTER);
        // Code TextField col:2, row:0
        countryFormPane.add(txtCode, 2, 0);
        GridPane.setHalignment(txtCode, HPos.LEFT);
        GridPane.setValignment(txtCode, VPos.CENTER);
        // Name Label col:1, row:1
        countryFormPane.add(lblName, 1, 1);
        GridPane.setHalignment(lblName, HPos.RIGHT);
        GridPane.setValignment(lblName, VPos.CENTER);
        // Name TextField col:2, row:1
        countryFormPane.add(txtName, 2, 1);
        GridPane.setHalignment(txtName, HPos.LEFT);
        GridPane.setValignment(txtName, VPos.CENTER);
        // Continent Label col:1, row:2
        countryFormPane.add(lblContinent, 1, 2);
        GridPane.setHalignment(lblContinent, HPos.RIGHT);
        GridPane.setValignment(lblContinent, VPos.CENTER);
        // Continent ComboBox col:2, row:2
        countryFormPane.add(continentCombo, 2, 2);
        GridPane.setHalignment(continentCombo, HPos.LEFT);
        GridPane.setValignment(continentCombo, VPos.CENTER);
        // Region Label col:1, row:3
        countryFormPane.add(lblRegion, 1, 3);
        GridPane.setHalignment(lblRegion, HPos.RIGHT);
        GridPane.setValignment(lblRegion, VPos.CENTER);
        // Region TextField col:2, row:3
        countryFormPane.add(txtRegion, 2, 3);
        GridPane.setHalignment(txtRegion, HPos.LEFT);
        GridPane.setValignment(txtRegion, VPos.CENTER);
        // Surface Area Label col:1, row:4
        countryFormPane.add(lblSurfaceArea, 1, 4);
        GridPane.setHalignment(lblSurfaceArea, HPos.RIGHT);
        GridPane.setValignment(lblSurfaceArea, VPos.CENTER);
        // Surface Area TextField col:2, row:4
        countryFormPane.add(txtSurfaceArea, 2, 4);
        GridPane.setHalignment(txtSurfaceArea, HPos.LEFT);
        GridPane.setValignment(txtSurfaceArea, VPos.CENTER);
        // Independence Year Label col:1, row:5
        countryFormPane.add(lblIndependenceYear, 1, 5);
        GridPane.setHalignment(lblIndependenceYear, HPos.RIGHT);
        GridPane.setValignment(lblIndependenceYear, VPos.CENTER);
        // Independence Year TextField col:2, row:5
        countryFormPane.add(txtIndependenceYear, 2, 5);
        GridPane.setHalignment(txtIndependenceYear, HPos.LEFT);
        GridPane.setValignment(txtIndependenceYear, VPos.CENTER);
        // Population Label col:1, row:6
        countryFormPane.add(lblPopulation, 1, 6);
        GridPane.setHalignment(lblPopulation, HPos.RIGHT);
        GridPane.setValignment(lblPopulation, VPos.CENTER);
        // Population TextField col:2, row:6
        countryFormPane.add(txtPopulation, 2, 6);
        GridPane.setHalignment(txtPopulation, HPos.LEFT);
        GridPane.setValignment(txtPopulation, VPos.CENTER);
        // Life Expectancy Label col:1, row:7
        countryFormPane.add(lblLifeExpectancy, 1, 7);
        GridPane.setHalignment(lblLifeExpectancy, HPos.RIGHT);
        GridPane.setValignment(lblLifeExpectancy, VPos.CENTER);
        // Life Expectancy TextField col:2, row:7
        countryFormPane.add(txtLifeExpectancy, 2, 7);
        GridPane.setHalignment(txtLifeExpectancy, HPos.LEFT);
        GridPane.setValignment(txtLifeExpectancy, VPos.CENTER);
        // GNP Label col:1, row:8
        countryFormPane.add(lblGNP, 1, 8);
        GridPane.setHalignment(lblGNP, HPos.RIGHT);
        GridPane.setValignment(lblGNP, VPos.CENTER);
        // GNP TextField col:2, row:8
        countryFormPane.add(txtGNP, 2, 8);
        GridPane.setHalignment(txtGNP, HPos.LEFT);
        GridPane.setValignment(txtGNP, VPos.CENTER);
        // Local Name Label col:1, row:9
        countryFormPane.add(lblLocalName, 1, 9);
        GridPane.setHalignment(lblLocalName, HPos.RIGHT);
        GridPane.setValignment(lblLocalName, VPos.CENTER);
        // Local Name TextField col:2, row:9
        countryFormPane.add(txtLocalName, 2, 9);
        GridPane.setHalignment(txtLocalName, HPos.RIGHT);
        GridPane.setValignment(txtLocalName, VPos.CENTER);
        // Government Form Label col:1, row:10
        countryFormPane.add(lblGovernmentForm, 1, 10);
        GridPane.setHalignment(lblGovernmentForm, HPos.RIGHT);
        GridPane.setValignment(lblGovernmentForm, VPos.CENTER);
        // Government Form TextField col:2, row:10
        countryFormPane.add(txtGovernmentForm, 2, 10);
        GridPane.setHalignment(txtGovernmentForm, HPos.LEFT);
        GridPane.setValignment(txtGovernmentForm, VPos.CENTER);
        // Head Of State Label col:1, row:11
        countryFormPane.add(lblHeadOfState, 1, 11);
        GridPane.setHalignment(lblHeadOfState, HPos.RIGHT);
        GridPane.setValignment(lblHeadOfState, VPos.CENTER);
        // Head Of State TextField col:2, row:11
        countryFormPane.add(txtHeadOfState, 2, 11);
        GridPane.setHalignment(txtHeadOfState, HPos.LEFT);
        GridPane.setValignment(txtHeadOfState, VPos.CENTER);
        // Capital Label col:1, row:12
        countryFormPane.add(lblCapital, 1, 12);
        GridPane.setHalignment(lblCapital, HPos.RIGHT);
        GridPane.setValignment(lblCapital, VPos.CENTER);
        // Capital TextField col:2, row:12
        countryFormPane.add(txtCapital, 2, 12);
        GridPane.setHalignment(txtCapital, HPos.LEFT);
        GridPane.setValignment(txtCapital, VPos.CENTER);
        // Code 2 Label col:1, row:13
        countryFormPane.add(lblCode2, 1, 13);
        GridPane.setHalignment(lblCode2, HPos.RIGHT);
        GridPane.setValignment(lblCode2, VPos.CENTER);
        // Code 2 TextField col:2, row:13
        countryFormPane.add(txtCode2, 2, 13);
        GridPane.setHalignment(txtCode2, HPos.LEFT);
        GridPane.setValignment(txtCode2, VPos.CENTER);
        // OK Button col:1, row:14
        countryFormPane.add(okButton, 1, 14);
        GridPane.setColumnSpan(okButton, 2);
        GridPane.setHalignment(okButton, HPos.CENTER);
        GridPane.setValignment(okButton, VPos.CENTER);
        // Empty Region col:3, row:0
        countryFormPane.add(emptyRegion, 3,0);


        // SCENE INITIALIZATION
        Scene scene = new Scene(countryFormPane);
        scene.widthProperty().addListener((ob, ov, nv) -> {
            countryFormPane.setPrefWidth(scene.getWidth());
        });
        scene.heightProperty().addListener((ob, ov, nv) -> {
            countryFormPane.setPrefHeight(scene.getHeight());
            listViewCountries.setPrefHeight(scene.getHeight());
        });

        // STAGE INITIALIZATION
        stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Country");
        stage.setX((Screen.getPrimary().getVisualBounds().getWidth()-700)/2);
        stage.setY((Screen.getPrimary().getVisualBounds().getHeight()-600)/2);
        stage.setWidth(700);
        stage.setHeight(600);
        stage.initModality(Modality.APPLICATION_MODAL);
        listViewCountries.getSelectionModel().select(0);
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
        if (!txtIndependenceYear.getText().isEmpty()) {
            try {
                indYear = Integer.parseInt(txtIndependenceYear.getText());
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
            System.out.println("INDEPENDENCE YEAR: " + txtIndependenceYear.getText());
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

    public void loadForm(Country c) {
        txtCode.setText(c.getCode());
        txtName.setText(c.getName());
        continentCombo.setValue(c.getContinent());
        txtRegion.setText(c.getRegion());
        txtSurfaceArea.setText(c.getSurfaceArea().toString());
        txtIndependenceYear.setText(c.getIndepYear() == null ? "" : c.getIndepYear().toString());
        txtPopulation.setText(c.getPopulation().toString());
        txtLifeExpectancy.setText(c.getLifeExpectancy() == null ? "" : c.getLifeExpectancy().toString());
        txtGNP.setText(c.getGnp() == null ? "" : c.getGnp().toString());
        txtLocalName.setText(c.getLocalName());
        txtGovernmentForm.setText(c.getGovernmentForm());
        txtHeadOfState.setText(c.getHeadOfState() == null ? "" : c.getHeadOfState());
        txtCapital.setText(c.getCapital() == null ? "" : c.getCapital().toString());
        txtCode2.setText(c.getCode2());
    }
}
