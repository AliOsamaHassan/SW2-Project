public abstract class Feature implements ImmubtableFeature {

    protected ServeBehavior serveBehavior;

    protected AvailableBehavior availableBehavior;

    protected double cost;

    protected String description;

    protected Boolean isAvailable;

    protected int type;

    static protected int featureID=0;

    public void setAvailability(Boolean isAvailable) {
        
        this.isAvailable=isAvailable;
        
        
       
       /* catch
        {
            
            
        throw new UnsupportedOperationException("Not supported yet.");
        }*/
    }

    
    
    public int getType() {
        return type;
        
       // throw new UnsupportedOperationException("Not supported yet.");
        //return type ;
    }

    public int getID() {
        return featureID ;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getCost() {
        return cost;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setID() {
        featureID++;
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Void setDescription(String description) {
        this.description=description;
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setCost(double cost) {
        this.cost= cost;
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getDescription() {
        return description;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public double getPrice() {
         return cost;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    @Override
    public void viewAvailableFeature() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void serveFeature(ServeBehavior serveBehavior) {
         this.serveBehavior=serveBehavior;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
