/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelReservationSystemGUI;

/**
 *
 * @author Ali
 */
public class FoodPlanList {
    private String FoodPlanName ;
    private String FoodPlanCode;
    private String FoodPlanType;
    private int FoodPlanLPrice;
   
    public FoodPlanList(String FoodPlanName, String FoodPlanCode, String FoodPlanType, int FoodPlanLPrice) {
        this.FoodPlanName = FoodPlanName;
        this.FoodPlanCode = FoodPlanCode;
        this.FoodPlanType = FoodPlanType;
        this.FoodPlanLPrice = FoodPlanLPrice;
    }
    
  
    

    /**
     * @return the FoodPlanName
     */
    public String getFoodPlanName() {
        return FoodPlanName;
    }

    /**
     * @param FoodPlanName the roomNumber to set
     */
    public void setFoodPlanName(String FoodPlanName) {
        this.FoodPlanName = FoodPlanName;
    }

    /**
     * @return the FoodPlanCode
     */
    public String getFoodPlanCode() {
        return FoodPlanCode;
    }

    /**
     * @param FoodPlanCode the FoodPlanCode to set
     */
    public void setFoodPlanCode(String FoodPlanCode) {
        this.FoodPlanCode = FoodPlanCode;
    }

    /**
     * @return the FoodPlanType
     */
    public String getFoodPlanType() {
        return FoodPlanType;
    }

    /**
     * @param FoodPlanType the FoodPlanType to set
     */
    public void setFoodPlanType(String FoodPlanType) {
        this.FoodPlanType = FoodPlanType;
    }

    /**
     * @return the roomStatus
     */
    public int getFoodPlanLPrice() {
        return FoodPlanLPrice;
    }

    /**
     * @param roomStatus the roomStatus to set
     */
    public void setFoodPlanLPrice(int FoodPlanLPrice) {
        this.FoodPlanLPrice = FoodPlanLPrice;
    }
    
}
