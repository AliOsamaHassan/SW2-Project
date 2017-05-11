
package HotelReservationSystemGUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

public class Main extends Application {
 
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Hotel Reservation System");
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show(); 
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             launch(args);
            //Database dba = new Database();

    }
    
}

