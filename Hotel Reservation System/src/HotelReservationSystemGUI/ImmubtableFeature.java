public interface ImmubtableFeature {

    public int getType();

    public int getID();

    public String getDescription();

    public double getCost();

    public void viewAvailableFeature();

    public void serveFeature(ServeBehavior serveBehavior);
}
