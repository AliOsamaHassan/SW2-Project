package HotelReservationSystemGUI;
public class RoomBooking implements ServeBehavior {

    @Override
    public Boolean serveFeature(Object feature) {
        Room room =(Room)feature;
        room.setAvailability(Boolean.FALSE);
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
}
