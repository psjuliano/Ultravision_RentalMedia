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
    private String bankCard;
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

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
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
                + "\n" + "name= " + name
                + "\n" + "email= " + email
                + "\n" + "bankName= " + bankName
                + "\n" + "bankCard= " + bankCard
                + "\n" + "planType= " + planType
                + "\n" + "planStatus= " + planStatus
                + "\n" + "balance= " + balance
                + "\n" + "bonus= " + bonus
                + "\n" + "notes= " + notes;

    }

    
}
