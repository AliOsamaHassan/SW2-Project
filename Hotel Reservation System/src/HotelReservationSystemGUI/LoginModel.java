package HotelReservationSystemGUI;

import java.sql.*;

public class LoginModel
{
	Connection connection;
	public LoginModel()
	{
		connection=MyAppDatabaseConnection.Connector();
		if(connection==null)
		{
			System.exit(1);
		}
	}
	
	public boolean isLoginValid(String user, String pass) throws SQLException
	{
            PreparedStatement preparedStatement=null;
            ResultSet resultSet=null;
            String query = "select * from systemusers where userName=? and password=?";
            if( MyAppDatabaseConnection.getInstance().makeQuery(query)== true){
                return true ;
            }
            else {
                return false;
            }
        }


}