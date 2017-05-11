package HotelReservationSystemGUI;

//import static HotelReservationSystemGUI.HomeController.rootP;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;


public class SidePanelContentController implements Initializable {
    

    @FXML
    private JFXButton b1;
    @FXML
    private JFXButton b2;
    @FXML
    private JFXButton b3;
    @FXML
    private JFXButton exit;
    @FXML
    private ImageView b;
    private ObservableList <RoomList> data;
    
    Connection con ;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.data = FXCollections.observableArrayList();
    }    
   
    
    @FXML
    private void viewRooms(ActionEvent event) {     
   /*     this.con = db.connect();     
        if(con != null){
            db.setCellTable();
            db.getData("SELECT * FROM  rooms"); 
            // RoomsController.loadDataFromDatabase();
        }
     */   
    }

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }
    
}
