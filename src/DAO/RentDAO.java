package DAO;

import Model.Media;
import controller.ClientsRegister;
import Model.PlanType;
import controller.RentRegister;
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
public class RentDAO {
    // *** This class is going to treat all transaction from the database on the view. ***

    /* I used boolean to be possible to print out the status of the command, but I could 
    have use void as well, if did not wanted to return a statement */
    public static boolean insert(RentRegister rent) {

        //  *** try..catch is going to treat any possible error. ***
        try {
            Connection connectionClass = ConnectionClass.getConnectionClass();

            // *** Here are all fields from the database ***
            String sql = "INSERT INTO rental(client_idMembership, dateOut, return_date ) "
                    // *** Here is going to get the values insert on the database ***
                    + "VALUES (?,?,?)";

            // *** PreparedStament is a class that execute commads sql, getting the value. ***
            PreparedStatement stmt = connectionClass.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            // *** Here is going to get the information on the ClientsRegister class. ***
            stmt.setString(1, rent.getClient().getIdMembership());
            stmt.setDate(2, new java.sql.Date(rent.getDateOut().getTime()));
            stmt.setDate(3, new java.sql.Date(rent.getDateReturn().getTime()));
           
            // *** Execute the program ***
            int result = stmt.executeUpdate();
            if (result >0) {
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                 rent.setId(rs.getInt(1));
                 result = insertMedia(rent);
                }
               
                rs.close();
                
            }
            // *** Finish the command and realease space memory that is not being used. ***
            stmt.close();

            return (result > 0) ? true : false;

            // *** Here is going to return any possible error. ***
        } catch (Exception e) {
            System.out.println("RentDAO.insert " + e.getMessage());
        }
        return false;
    }
    private static int insertMedia(RentRegister rent){
        
             try {
            Connection connectionClass = ConnectionClass.getConnectionClass();
            PreparedStatement stmt = null;
            int result = 0;
            
            for(Object o : rent.getMedia()){
            // *** Here are all fields from the database ***
            String sql = "INSERT INTO rental_media(idrental, idmedia) "
                    // *** Here is going to get the values insert on the database ***
                    + "VALUES (?,?)";
            Media m = (Media)o;
            // *** PreparedStament is a class that execute commads sql, getting the value. ***
            stmt = connectionClass.prepareStatement(sql);
            // *** Here is going to get the information on the ClientsRegister class. ***
            stmt.setInt(1, rent.getId());
            stmt.setString(2, m.getIdMedia());
           
            // *** Execute the program ***
            result = stmt.executeUpdate();
            
                if (result == 0) {
                    break;
                    
            }
            // *** Finish the command and realease space memory that is not being used. ***
            stmt.close();
            }
            return result;

            // *** Here is going to return any possible error. ***
        } catch (Exception e) {
                 System.out.println("RentalDAO.setMedia " + e.getMessage());
        }
        return 0;
        
        
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
                c.setBankCard(result.getString("Bank_card"));
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
    
   


