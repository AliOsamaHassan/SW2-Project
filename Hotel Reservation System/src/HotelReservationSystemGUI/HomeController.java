/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelReservationSystemGUI;

/*import static HotelReservationSystemGUI.RoomsController.roomCapacityColumn;
import static HotelReservationSystemGUI.RoomsController.roomNumberColumn;
import static HotelReservationSystemGUI.RoomsController.roomStatusColumn;
import static HotelReservationSystemGUI.RoomsController.roomTypeColumn;*/
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Ali
 */
public class HomeController implements Initializable {

    public static final String URL_FXML = "Home.fxml";

   
    @FXML
    private AnchorPane root;
    @FXML
    public static AnchorPane rootP;
    @FXML
    private JFXButton b1;
    @FXML
    private JFXButton b2;
    @FXML
    private JFXButton b3;
    @FXML
    private JFXButton b4;
    @FXML
    private AnchorPane anchorpane;
    @FXML
    private ImageView img;

    private Connection con ;
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        rootP = root;
      try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("WelcomeMessage.fxml"));
            this.anchorpane.getChildren().setAll(pane);
         } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*  db = new Database();
        this.con = db.connect();     
        if(con != null){
            db.setCellTable();
            db.getData("SELECT * FROM  rooms"); 
        }*/
 
        
    }

    @FXML
    void viewHomePage(ActionEvent event) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("WelcomeMessage.fxml"));
            this.anchorpane.getChildren().setAll(pane);
         } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void viewRooms(ActionEvent event) throws IOException{
         // this.changingAnchorPane.getChildren().setAll(FXMLLoader.load("Rooms.fxml"));
         try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("Rooms.fxml"));
            this.anchorpane.getChildren().setAll(pane);
         } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        
    @FXML
    void viewFoodPlanPage(ActionEvent event) {
        // this.changingAnchorPane.getChildren().setAll(FXMLLoader.load("Rooms.fxml"));
         try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("FoodPlans.fxml"));
            this.anchorpane.getChildren().setAll(pane);
         } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    @FXML
    void viewGuestsPage(ActionEvent event) {

    }
     
    @FXML
    void goSignOut(ActionEvent event) {

    }
    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }
            
}
