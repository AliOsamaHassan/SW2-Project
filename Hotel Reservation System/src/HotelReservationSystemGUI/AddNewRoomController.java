/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelReservationSystemGUI;
import HotelReservationSystemGUI.RoomsController;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Ali
 */
public class AddNewRoomController implements Initializable {
    Connection connection=MyAppDatabaseConnection.Connector();
    ObservableList<RoomList> data=FXCollections.observableArrayList();
    PreparedStatement preparedStatement=null;
    ResultSet rs = null;
	
    @FXML
    private JFXTextField roomNoTextField;
    @FXML
    private JFXTextField roomTypeTextField;
    @FXML
    private JFXTextField roomCapacityTextField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    public void confirmAdding() throws SQLException{
     String roomNumber=roomNoTextField.getText();
     String roomType=roomTypeTextField.getText();
     String roomCapacity=roomCapacityTextField.getText();
     String roomStatus="Available";
     String query="INSERT INTO rooms (roomNumber, roomType, roomCapacity,roomStatus) VALUES(?,?,?,?,?)";
     preparedStatement = null;

     try
     {
             preparedStatement = connection.prepareStatement(query);
             preparedStatement.setString(2, roomNumber);
             preparedStatement.setString(3, roomType);
             preparedStatement.setString(4, roomCapacity);
             preparedStatement.setString(5, roomStatus);
             
     }
     catch(SQLException e)
     {
             System.out.println(e);
     }
     finally
     {
             preparedStatement.execute();
             preparedStatement.close();
     }

     roomNoTextField.clear();
     roomTypeTextField.clear();
     roomCapacityTextField.clear();
     
     //  data.clear();
       //HotelReservationSystemGUI.RoomsController.getRoomData("SELECT * FROM rooms");
     //  Main.showInformationAlertBox("New R '"+name+"' Added Successfully!");

      
    }
    public void getRoomData (String query){ 
        try{          
            System.out.println("I'm in getData Function\nResult from Database"); 
            data = FXCollections.observableArrayList();
            preparedStatement = connection.prepareStatement(query);
            rs=preparedStatement.executeQuery(query);
            while(rs.next()){
                int roomNumber = rs.getInt(2);
                String roomType = rs.getString(3);
                int roomCapacity = rs.getInt(4);
                String roomStatus = rs.getString(5);
                System.out.println("Room number : "+roomNumber+"\nRoom Type : "+roomType+"\nRoom Capacity : "+roomCapacity+" \nRoom Status : "+roomStatus );   
                System.out.println("helooooooooo");
             //   data.add(new RoomList(rs.getInt(2), ""+rs.getString(3),rs.getInt(4), rs.getString(5)));
                //tableRooms.setItems(data);
            }
            preparedStatement.close();
            rs.close();
        }
        catch(Exception ex){
            System.out.println("Erssssssssror : "+ex);
        }     
     }
}
