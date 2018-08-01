/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik.screens;

/**
 *
 * @author ndjaka
 */
public class Screens {
    private static final Screens INSTANCE = new Screens();

    private Screens() {
    }

    public static Screens getInstance() {
        return INSTANCE;
    }

    // Define all the screens/containers here
    // Give a descriptive screen name
    public String SCREEN_4_NAME = "home";
    public String SCREEN_0_NAME = "profilContent";
    
    public String SCREEN_3_NAME = "exportContent";
    public String SCREEN_1_NAME = "importContent";
    public String SCREEN_2_NAME = "produitContent";
 

    // Define the package where your view files are located
    public String PACKAGE_VIEW = "/trackafrik/View/";

    // The actual screen/ui .fxml
    public String SCREEN_4_FXML = "home.fxml";
    public String SCREEN_0_FXML = "profilContent.fxml";
    public String SCREEN_2_FXML = "produitContent.fxml";
    public String SCREEN_1_FXML = "importContent.fxml";
    public String SCREEN_3_FXML = "exportContent.fxml";
}
