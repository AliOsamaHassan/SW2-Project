package HotelReservationSystemGUI;

import java.sql.*;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MyAppDatabaseConnection
{

   private  static MyAppDatabaseConnection db_obj = null;
   PreparedStatement preparedStatement=null;
   ResultSet rs = null;
   ArrayList <String> data = new ArrayList();
               
   Connection connection;

    private  MyAppDatabaseConnection() {
            
        connection = this.Connector();
    }
    
    public static MyAppDatabaseConnection getInstance(){
        if(db_obj == null)
            db_obj = new MyAppDatabaseConnection();   
     
        return db_obj;
       //return null;
    }
    
    
	public static Connection Connector()
	{
		try
		{
                    Class.forName("com.mysql.jdbc.Driver");
                    String url = "jdbc:mysql://127.0.0.1:3306/hotelreservationsystem";
                    String user = "root";
                    String password = "";
                    Connection conn=DriverManager.getConnection(url,user,password);
                    return conn;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}
        
        public boolean makeQuery(String givenquery) throws SQLException{
            PreparedStatement preparedStatement=null;
            ResultSet resultSet=null;
            
            String query=givenquery;
            try
            {
                    preparedStatement =connection.prepareStatement(query);
                    resultSet=preparedStatement.executeQuery();	  
                    if(resultSet.next())
                        return true;
                    else	
                        return false;            
            }
            catch(Exception e)	
            {	
                return false;
            }
            finally	
            {
                preparedStatement.close();
                resultSet.close();
            }
       
        }
        
        
        public ArrayList getTableData (String TableName , ArrayList columnsNames, String condition){ 
            ArrayList <String>finalArrayList = new ArrayList();
            try{                    
                System.out.println("I'm in getTableData Function in MyAppDatabaseConnection class \n"); 
                String query = "select ";
                //query = "select "+columnsNames+" from "+TableName+" where "+condition;             
                String col ; 
                for(int i = 0 ; i<columnsNames.size() ; i++)
                {
                   col = columnsNames.get(i)+"";
                   query += col;
                   if(i < columnsNames.size() -1 )
                       query += ",";
                }
                query += " from "+TableName+" where "+condition;
                
                preparedStatement = connection.prepareStatement(query);
                rs=preparedStatement.executeQuery(query);
 
                for (int i =0 ; i<columnsNames.size() ; i++)
                    while(rs.next()){
                        finalArrayList.add (i, rs.getString(i));
                    
                        System.out.println(finalArrayList.get (i));
                   
                    }
                    preparedStatement.close();
                    rs.close();
            }
            catch(Exception ex){
            System.out.println("Erssssssssror in getTableData Fun. : "+ex);
            }     
            return finalArrayList;
        }
        
        
        
}
