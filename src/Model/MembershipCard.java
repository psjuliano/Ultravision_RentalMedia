/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author psouz
 */
public class MembershipCard {

	   private int points;
	   private boolean freeRentAllowed;
	   
	   public void addPoints(int points){
			this.points += points;
			setRentAllowed();
	   }
	   
	   public boolean availFreeRent(){
			if(this.isfreeRentAllowed()){
				this.points -= 100;
				setRentAllowed();
				return true;
			} else {
				return false;
			}
	   }
	   
	   private void setRentAllowed(){
			if (this.points >= 100){
				this.freeRentAllowed = true;
			} else {
				this.freeRentAllowed = false;
			}
	   }
	   
	   public int getPoints() {
			return  points;
       }
	   
	   public boolean isfreeRentAllowed(){
			return freeRentAllowed;
	   
	   }
	   
}