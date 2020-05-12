package DAO;

import Model.Media;
import controller.ClientsRegister;
import Model.PlanType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public class RentalDAO {
    // *** This class is going to treat all transaction from the database on the view. ***

    /* I used boolean to be possible to print out the status of the command, but I could 
    have use void as well, if did not wanted to return a statement */
    public static boolean insert(ClientsRegister client) {

        //  *** try..catch is going to treat any possible error. ***
        try {
            Connection connectionClass = ConnectionClass.getConnectionClass();

            // *** Here are all fields from the database ***
            String sql = "INSERT INTO rental(media_idmedia, dateOut, return_date ) "
                    // *** Here is going to get the values insert on the database ***
                    + "VALUES (?,?,?)";

            System.out.println(client);
            // *** PreparedStament is a class that execute commads sql, getting the value. ***
            PreparedStatement stmt = connectionClass.prepareStatement(sql);
            // *** Here is going to get the information on the ClientsRegister class. ***
            stmt.setString(1, client.getName());
            stmt.setString(2, client.getEmail());
            stmt.setString(3, client.getBankName());
            stmt.setInt(4, client.getBankCard());
            stmt.setString(5, client.getPlanStatus());
            stmt.setFloat(6, client.getBalance());
            stmt.setString(7, client.getNotes());
            stmt.setInt(8, client.getPlanType().getIdPlan());

            // *** Execute the program ***
            int result = stmt.executeUpdate();

            // *** Finish the command and realease space memory that is not being used. ***
            stmt.close();

            return (result > 0) ? true : false;

            // *** Here is going to return any possible error. ***
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean update(ClientsRegister client) {
        // *** Here is going to alter any client details, when need.

        //  *** try..catch is going to treat any possible error. ***
        try {
            Connection conn = ConnectionClass.getConnectionClass();
            // *** Here are all fields from my database ***
            String sql = "UPDATE client SET "
                    + "name = ?, "
                    + "email = ?,"
                    + "bank_name = ?,"
                    + "bank_card = ?,"
                    + "plan_status = ?,"
                    + "balance = ?,"
                    + "bonus = ?,"
                    + "notes = ?,"
                    + "plan_id = ? "
                    + "WHERE idMembership = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            // *** Here is going to get the information on the ClientsRegister class. ***    
            stmt.setString(1, client.getName());
            stmt.setString(2, client.getEmail());
            stmt.setString(3, client.getBankName());
            stmt.setInt(4, client.getBankCard());
            stmt.setString(5, client.getPlanStatus());
            stmt.setInt(6, client.getBonus());
            stmt.setFloat(7, client.getBalance());
            stmt.setString(8, client.getNotes());
            stmt.setInt(9, client.getPlanType().getIdPlan());
            stmt.setString(10, client.getIdMembership());

            // *** Here is going to make sure if the update was executed.
            int numberRows = stmt.executeUpdate();
            return numberRows > 0;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }

    public static List<ClientsRegister> list() {
        // *** Here is an Array, that is going to list all rental from the database. ***
        List<ClientsRegister> client = new ArrayList<ClientsRegister>();

        //  *** try..catch is going to treat any possible error. ***  
        try {

            Connection conn = ConnectionClass.getConnectionClass();
            /* *** Here are all fields from the database, also is join the client table
        on the rental table.*** */
            String sql = "SELECT * FROM client "
                    + "left join plan_type on client.plan_id = plan_type.idplan_type";

            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                ClientsRegister c = new ClientsRegister();
                c.setIdMembership(result.getString("idMembership"));
                c.setName(result.getString("name"));
                c.setEmail(result.getString("email"));
                c.setBankName(result.getString("bank_name"));
                c.setBankCard(result.getInt("Bank_card"));
                c.setPlanStatus(result.getString("plan_status"));
                c.setBalance(result.getFloat("balance"));
                c.setNotes(result.getString("notes"));
                //  
                PlanType p = new PlanType();
                p.setIdPlan(result.getInt("plan_id"));
                p.setPlanName(result.getString("plan"));

                c.setPlanType(p);
                client.add(c);

            }
            result.close();
            stmt.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return client;
    }

   
/*
    public Media  getItemRented(int idMedia) {
         // *** Here is going to delete any media details, when need. ***
        Media itemRented = new Media();
        //  *** try..catch is going to treat any possible error. ***
        try {
            Connection conn = ConnectionClass.getConnectionClass();
            // *** Here are all fields from my database ***   
            String sql = "SELECT * FROM media WHERE idMedia = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idMedia);
            
            ResultSet rs = stmt.executeQuery();
            //int numberRows = stmt.executeUpdate();
            //stmt.close();
            
            //if (rs.next() ) {
             //   media.setIdMedia("idmedia");
             //   media.setTitle("title");
            }

        } catch (Exception e) {
            System.out.println("Sql Error: " + e.getMessage());
        }
         return media;
    }
        */
    }
    
   


