
package controller;

import Model.PlanType;
import java.awt.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Priscila
 */
public class ClientsRegister {
    // *** Attributes ***
    private String idMembership;
    private String name;
    private String email;
    private String bankName;
    private int bankCard;
    private PlanType planType;
    private String planStatus;
    private float balance;
    private int bonus;
    private String notes;
    
    // *** Getter and Setter ***
    public String getIdMembership() {
        return idMembership;
    }

    public void setIdMembership(String idMembership) {
        this.idMembership = idMembership.valueOf(idMembership.toUpperCase());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBankCard() {
        return bankCard;
    }

    public void setBankCard(int bankCard) {
        this.bankCard = bankCard;
    }

    public PlanType getPlanType() {
        return planType;
    }

    public void setPlanType(PlanType planType) {
        this.planType = planType;
    }

    public String getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(String planStatus) {
        this.planStatus = planStatus;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    // Here is just to test on the console
    @Override
    public String toString() {
        return "\n" + "ClientsRegister"
        + "\n" + "idMembership= " + idMembership 
        +"\n"  + "name= " + name 
        +"\n"  + "email= " + email
        + "\n" + "bankName= " + bankName 
        + "\n" + "bankCard= " + bankCard 
        + "\n" + "planType= " + planType
        + "\n" + "planStatus= " + planStatus 
        + "\n" + "balance= " + balance 
        + "\n" + "bonus= " + bonus 
        + "\n" + "notes= " + notes;
        
    }
    
    
      //Aqui seria pra usar no console, se a gente não for tralhar com banco de dados
    
    /*public void status(){
        System.out.println("****************");
        System.out.println("Name: " +this.getLName()) ;
        System.out.println("IdMembership: " +this.getIdMembership());
        System.out.println("Email: " +this.getEmail());
        System.out.println("Plan Type: " +this.getPlanType());
        System.out.println("Balance: " +this.getBalance());
        System.out.println("Account Status: " +this.getPlanStatus());
        System.out.println("***************");
       
        
    }
    public void openAccount(){
        
    }
    public void loyalyBonus(){
        
    }
    public void closeAccount(){
        
    }
    public void PlanType(){
            
    }
    */
    
     /*public String Save(){
        
        try {
            FileWriter fw = new FileWriter("Clients.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("IdMembership :" +this.idMembership);
            pw.println("Name :" +this.name);
            pw.println("Email: "+this.email);
            pw.println("Bank Name: "+this.bankName);
            pw.println("IBAN: "+this.bankCard);
            pw.println("Balance: "+this.balance);
            pw.println("Bonus: "+this.bonus);
            pw.println("Notes: "+this.notes);
            pw.println("*************");
            
            //flush envia os dados direto para o armazemento
            pw.flush();
            pw.close();
            fw.close();
            
            
        } catch (IOException ex) {
            System.out.println("Error");
            
            
            Logger.getLogger(ClientsRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return "Registed sucessuful";
    }

    // Aqui tbm seria pra usar no console
     
    /*public ClientsRegister(String idMembership, String LName, String email, String iban, float Plan, float balance, String PlanStatus) {
        this.idMembership = idMembership;
        this.name = name;
        this.email = email;
        this.iban = iban;
        this.setPlan(Plan);
       // this.balance = balance;
        //this.PlanStatus = PlanStatus;
    }

    public String getIdMembership() {
        return idMembership;
    }

    public void setIdMembership(String idMembership) {
        this.idMembership = idMembership;
    }

    public String getLName() {
        return name;
    }

    public void setLName(String LName) {
        this.name = LName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public float getPlan() {
        return plan;
    }
     // Aqui está tratando a questão dos planos :
     
    public void setPlan(float Plan) {
        this.plan = plan;
        this.setPlanType();
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType() {
        if (this.plan == 10.5) {
            this.planType = "Music Lovers";    
        }else if(this.plan == 15){
            this.planType = "CD Lovers";
        }else if(this.plan == 20){
            this.planType = "TV Lovers";    
        }else if (this.plan == 30){
            this.planType = "Premiun";
        }else{
            this.planType = "Invalid";
        }   
    }

    public String getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(String PlanStatus) {
        this.planStatus = PlanStatus;
    }
      
 */ 
     // Termina aqui esse pedaço de codigo que trata a qestão dos planos

   
    
}


