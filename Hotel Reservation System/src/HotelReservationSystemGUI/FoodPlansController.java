package HotelReservationSystemGUI;

import com.jfoenix.controls.JFXButton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FoodPlansController {

    private Connection con = MyAppDatabaseConnection.Connector();;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private ObservableList <FoodPlanList> data=FXCollections.observableArrayList();
    @FXML
    private JFXButton EditFoodPlan;
    @FXML
    private TableView<FoodPlanList> tableFoodPlans;
    @FXML
    private TableColumn<?, ?> FoodPlanCodeColumn;
    @FXML
    private TableColumn<?, ?> FoodPlanNameColumn;
    @FXML
    private TableColumn<?, ?> FoodPlanPriceColumn;
    @FXML
    private TableColumn<?, ?> roomPlanActionColumn;
    @FXML
    private JFXButton deleteFoodPlan;
    @FXML
    private JFXButton addNewFoodPlan;
    @FXML
    private TableColumn<?, ?> FoodPlanTypeColumn;

    @FXML
    void EditFoodPlanFun(ActionEvent event) {

    }

    @FXML
    void addFoodPlanFun(ActionEvent event) {

    }

    @FXML
    void deleteFoodPlan(ActionEvent event) {

    }
     public void setFoodPlanCellTable(){
        this.FoodPlanNameColumn.setCellValueFactory(new PropertyValueFactory<>("FoodPlanName"));
        this.FoodPlanCodeColumn.setCellValueFactory(new PropertyValueFactory<>("FoodPlanCode"));
        this.FoodPlanPriceColumn.setCellValueFactory(new PropertyValueFactory<>("FoodPlanType"));
        this.FoodPlanTypeColumn.setCellValueFactory(new PropertyValueFactory<>("FoodPlanPrice"));
        System.out.println("I'm in setCellTable");

     }
     
     public void getFoodPlanData (String query){ 
        try{          
            System.out.println("I'm in getFoodPlanData Function\nResult from Database"); 
            data = FXCollections.observableArrayList();
            pst = con.prepareStatement(query);
            rs=pst.executeQuery(query);
            while(rs.next()){
                int roomNumber = rs.getInt(2);
                String roomType = rs.getString(3);
                int roomCapacity = rs.getInt(4);
                String roomStatus = rs.getString(5);
                //System.out.println("Food Plane number : "+roomNumber+"\Food Plane Code : "+roomType+"\Food Plane Type : "+roomCapacity+" \nFood Plane Price : "+roomStatus );   
                System.out.println("helooooooooo");
                data.add(new FoodPlanList(rs.getString(2), ""+rs.getString(3),rs.getString(4), rs.getInt(5)));
                this.tableFoodPlans.setItems(data);
            }
            pst.close();
            rs.close();
        }
        catch(Exception ex){
            System.out.println("Erssssssssror : "+ex);
        }     
     }
}
