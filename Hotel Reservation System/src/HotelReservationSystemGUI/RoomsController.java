/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelReservationSystemGUI;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author Ali
 */
public class RoomsController implements Initializable {

    private Connection con = MyAppDatabaseConnection.Connector();;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private ObservableList <RoomList> data=FXCollections.observableArrayList();
   
    @FXML
    private JFXButton addNewRoom;
    @FXML
    private JFXButton EditRoom;
    @FXML
    private JFXButton deleteRoom;
    @FXML
    private TableView<RoomList> tableRooms;
    @FXML
    private TableColumn<?,?> roomCapacityColumn;
    @FXML
    private TableColumn<?,?> roomTypeColumn;
    @FXML
    private TableColumn<?,?> roomNumberColumn;
    @FXML
    private TableColumn<?,?> roomStatusColumn;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setRoomCellTable();
        getRoomData();
    }
    
    
     public void setRoomCellTable(){
        roomNumberColumn.setCellValueFactory(new PropertyValueFactory<>("roomNumber"));
        roomTypeColumn.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        roomCapacityColumn.setCellValueFactory(new PropertyValueFactory<>("roomCapacity"));
        roomStatusColumn.setCellValueFactory(new PropertyValueFactory<>("roomStatus"));
        System.out.println("I'm in setCellTable");

     }
     
     public void getRoomData (){ 
        try{          
            System.out.println("I'm in getRoomData Function\nResult from Database"); 
            data = FXCollections.observableArrayList();
           //String q = "SELECT * FROM rooms" ;
            ArrayList <String> columnsNames = null   ;
            columnsNames.add("floorNumber");
            columnsNames.add("roomNumber");
            columnsNames.add("room_type_id_fk");
            columnsNames.add("roomCapacity");
            columnsNames.add("isAvailable");
            
            
     //       String q = "SELECT * FROM rooms" ;

          ArrayList <String>result =  MyAppDatabaseConnection.getInstance().getTableData("rooms",columnsNames,"");
         //  pst = con.prepareStatement(query);
         //  rs=pst.executeQuery(query);
            while(!result.isEmpty()){
              /*  int roomNumber = rs.getInt(2);
                String roomType = rs.getString(3);
                int roomCapacity = rs.getInt(4);
                String roomStatus = rs.getString(5);
                System.out.println("Room number : "+roomNumber+"\nRoom Type : "+roomType+"\nRoom Capacity : "+roomCapacity+" \nRoom Status : "+roomStatus );   
               */
                      System.out.println("helooooooooo");
                data.add(new RoomList(rs.getInt(2), ""+rs.getString(3),rs.getInt(4), rs.getString(5)));
                this.tableRooms.setItems(data);
            }
            pst.close();
            rs.close();
        }
        catch(Exception ex){
            System.out.println("Erssssssssror : "+ex);
        }     
     }

     
    @FXML
    void EditRoomFun(ActionEvent event) {

    }

    @FXML
    void addNewRoomFun(ActionEvent event) {                
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("addNewRoom.fxml"));
            Scene scene = new Scene(fxmlLoader.load());           
            Stage stage = new Stage();
            stage.setTitle("Add New Room");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    }

    @FXML
    void deleteRoomFun(ActionEvent event) {

    }

    
}
