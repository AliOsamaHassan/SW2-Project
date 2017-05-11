package HotelReservationSystemGUI;

import HotelReservationSystemGUI.MyAppDatabaseConnection;
import java.sql.SQLException;

public class Room extends Feature {

    
    
    private int numberOfBed;
    private int type;
    

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed=numberOfBed;
        throw new UnsupportedOperationException("Not supported yet.");
    }
     public int getNumberOfBed() {
        
        //throw new UnsupportedOperationException("Not supported yet.");
        return this.numberOfBed;
    }

    
    public void setType(int type)
    {
        
     this.type=type;
        
    }
    public void setData( String description ,int numberOfBed , int type )
    {
        setID();
        setAvailability(true);
        setDescription(description);
        setNumberOfBed(numberOfBed);
        setType(type);
    }
    

    public Boolean addRoom( String description ,int numberOfBed  , int type ) throws SQLException {
        
        setData( description , numberOfBed ,  type );
        String q="insert into rooms  values ( , 3 ,10 , 1 , 2 , 0)" ;
        MyAppDatabaseConnection.getInstance().makeQuery(q);
        
        //database
        
         throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean deleteRoom() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean updateRoom( String description ,int numberOfBed  , int type ) {
        
        setData( description , numberOfBed ,  type );
        //database
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
