package HotelReservationSystemGUI;
import HotelReservationSystemGUI.Main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.sql.SQLException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Ali
 */
public class LoginController implements Initializable {
    LoginModel loginModel=new LoginModel();
    @FXML
    private JFXPasswordField passwordTextField;

    @FXML
    private JFXButton login;

    @FXML
    private JFXTextField usernameTextFiled;

    @FXML
    private JFXButton signup;
        
    @FXML
    Text errorReport;

    @FXML
    protected  void makeLogin(ActionEvent event) throws IOException {
        String username = this.usernameTextFiled.getText();
        String password = this.passwordTextField.getText();        
        	try
		{
			if(loginModel.isLoginValid(username, password) == true )
			{
			//	Main.showHome();
			}
			else
			{
				errorReport.setText("Error! Invalid Username or Password.");
			}
		} catch (SQLException e)
		{
			errorReport.setText("Error! Invalid Username or Password.");
			e.printStackTrace();
		}
    
    }
    
    @FXML
    void makeSignup(ActionEvent event) {

    }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
