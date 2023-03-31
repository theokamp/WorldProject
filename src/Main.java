// JavaFX libraries
import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.control.*;

// Project libraries
import forms.*;

public class Main extends Application {

    Menu menuManage, menuDiagrams, menuHelp;
    MenuItem menuItemCountries, menuItemCities, menuItemLanguages, menuItemCountriesPerContinent,
             menuItemCitiesPerCountry, menuItemPopulationDistribution, menuItemReligionDistribution,
             menuItemContents, menuItemAbout;
    MenuBar menuBar;


    @Override
    public void start(Stage stage) {

        // Menu Manage Initialization
        menuItemCountries = new MenuItem("Countries");
        menuItemCountries.setAccelerator(new KeyCodeCombination(KeyCode.C, KeyCombination.CONTROL_DOWN, KeyCombination.SHIFT_DOWN));
        menuItemCountries.setOnAction(e -> countryFormShow());
        menuItemCities = new MenuItem("Cities");
        menuItemCities.setAccelerator(new KeyCodeCombination(KeyCode.I, KeyCombination.CONTROL_DOWN, KeyCombination.SHIFT_DOWN));
        menuItemLanguages = new MenuItem("Languages");
        menuItemLanguages.setAccelerator(new KeyCodeCombination(KeyCode.L, KeyCombination.CONTROL_DOWN, KeyCombination.SHIFT_DOWN));
        menuManage = new Menu("_Manage");
        menuManage.getItems().addAll(menuItemCountries, menuItemCities, menuItemLanguages);

        // Menu Diagrams init
        menuItemCountriesPerContinent = new MenuItem("Countries Per Continent");
        menuItemCitiesPerCountry = new MenuItem("Cities Per Country");
        menuItemPopulationDistribution = new MenuItem("Population Distribution");
        menuItemReligionDistribution = new MenuItem("Religion Distribution");
        menuDiagrams = new Menu("_Diagrams");
        menuDiagrams.getItems().addAll(menuItemCountriesPerContinent, menuItemCitiesPerCountry, new SeparatorMenuItem(),
                menuItemPopulationDistribution, menuItemReligionDistribution);

        // Menu Help init
        menuItemContents = new MenuItem("Contents");
        menuItemAbout = new MenuItem("About");
        menuHelp = new Menu("_Help");
        menuHelp.getItems().addAll(menuItemContents, menuItemAbout);

        // Menu Bar Init
        menuBar = new MenuBar(menuManage, menuDiagrams, menuHelp);

        // Menu Pane init
        HBox menuPane = new HBox();
        menuPane.getChildren().add(menuBar);
        menuPane.setAlignment(Pos.TOP_LEFT);

        // Scene init
        Scene scene = new Scene(menuPane);
        scene.widthProperty().addListener((ob, ov, nv) -> {
            menuPane.setPrefWidth(scene.getWidth());
            menuBar.setPrefWidth(scene.getWidth());
        });

        // Stage init
        stage.setScene(scene);
        stage.setTitle("World Project");
        stage.setX((Screen.getPrimary().getVisualBounds().getWidth()-800)/2);
        stage.setY((Screen.getPrimary().getVisualBounds().getHeight()-800)/2);
        stage.setWidth(800);
        stage.setHeight(800);
        stage.show();
    }

    public static void main(String[] args) {
	    launch(args);
    }

    // Method to open country form
    public void countryFormShow(){
        CountryForm countryForm = new CountryForm();
        countryForm.show();
    }
}
