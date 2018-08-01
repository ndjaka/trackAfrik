/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trackafrik;

import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author ndjaka
 */
public class TrackAfrik extends Application {
    public static Stage  win;
    @Override
    public void start(Stage stage) throws Exception {
       win = stage;
      Parent root = FXMLLoader.load(getClass().getResource("/trackafrik/View/logincontent.fxml"));
        stage.setResizable(false);
        stage.setTitle("TrackAfrik");
        InputStream is = getClass().getResourceAsStream("/trackafrik/images/logo.png");
        stage.getIcons().add(new Image(is));
        Scene scene = new Scene(root,683,428);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
