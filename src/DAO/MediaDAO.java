/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import controller.ClientsRegister;
import Model.Media;
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
public class MediaDAO {
    
    // This class is going to treat all transaction on my database from the view
    /* I used boolean to be possible to print out the status of the command, but I could 
    use void as well if did not wanted to return a statement */
    
    public static boolean insert (Media media, PlanType planType){
        
         //  *** try..catch is going to treat any possible error. ***
        try {
            Connection connectionClass = ConnectionClass.getConnectionClass();
            
        // *** Here are all fields from the database ***
            String sql= "INSERT INTO media(title, year_of_release, price, rented_of_day,"
                    + "avaiability, media_format, description) "
         // *** Here is going to get the values insert on the database ***
                    + "VALUES (?,?,?,?,?,?,?)";
            
            System.out.println(media);
         // *** PreparedStament is a class that execute commads sql, getting the value. ***
            PreparedStatement stmt = connectionClass.prepareStatement(sql);
            
         // *** Here is going to get the information on the Media class. ***
            stmt.setString(1, media.getTitle());
            stmt.setInt(2, media.getYearOfRelease());
            stmt.setFloat(3, media.getPrice());
            stmt.setInt(4, media.getRentedDays());
            stmt.setInt(5, media.getAvailability());
            stmt.setString(6, media.getMediaFormat());
            stmt.setString(7, media.getDescription());
            
        // *** Execute the program ***
           int result = stmt.executeUpdate();
           
        // *** Finish the commad and realease space memory that is not being used. ***
            stmt.close();
            
            return (result >0)? true: false;
            
       // *** Here is going to return any possible error. ***
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
        
    public static boolean update(Media media){
       // *** Here is going to alter any media details, when need. ***
       
       //  *** try..catch is going to treat any possible error. ***
        try {
            Connection conn = ConnectionClass.getConnectionClass();
       // *** Here are all fields from my database ***
            String sql = "UPDATE media SET "
                    + "title = ?, "
                    + "year_of_release = ?,"
                    + "price = ?,"
                    + "rented_of_day = ?,"
                    + "avaiability = ?,"
                    + "media_format = ?,"
                    + "description = ?"
                    + "WHERE idMedia = ?";
            
             PreparedStatement stmt = conn.prepareStatement(sql);
            // *** Here is going to get the information on the Media class. ***
             stmt.setString(1, media.getTitle());
             stmt.setInt(2, media.getYearOfRelease());
             stmt.setInt(3, media.getRentedDays());
             stmt.setInt(4, media.getAvailability());
             //stmt.setString(5, media.getMediaFormat());
             stmt.setString(6, media.getDescription());
             //stmt.setString(2, String.valueOf(planType.getTipo()));
             stmt.setString(7, media.getIdMedia());
            
            // *** Here is going to make sure if the update was executed. ***  
            int numberRows = stmt.executeUpdate();
            return numberRows>0;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean delete(int idMedia){
   // *** Here is going to delete any media details, when need. ***
   
   //  *** try..catch is going to treat any possible error. ***
            try {
                Connection conn = ConnectionClass.getConnectionClass();
   // *** Here are all fields from my database ***   
                String sql = "DELETE FROM media WHERE idMedia = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                
                stmt.setInt(1, idMedia);
                int numberRows = stmt.executeUpdate();
                stmt.close();
                return numberRows > 0;
                
             
            } catch (Exception e) {
                
                return false;
            }
    }
    
    public static List<Media> list(Media mediaSearch){
        
        // *** Here is an Array, that is going to list all client from the database. ***
        List<Media> media = new ArrayList<Media>();
        
       //  *** try..catch is going to treat any possible error. ***      
        try {
            
            Connection conn = ConnectionClass.getConnectionClass();
       /* *** Here are all fields from the database, also is join the plan_type table
        on the media table.*** */
            String sql = "SELECT * FROM media";
                   // + "left join movie on media.id = movie.id "
                   // + "WHERE title like ? or id = ?";
                   /*select media. *,
                    movie.director,
                    from jogo
                    inner join movie on idmedia = id */
                   
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            
            while(result.next()){
                Media m = new Media();
                m.setIdMedia(result.getString("idMedia"));
                m.setTitle(result.getString("title"));
                //m.setDirector(result.getString("director"));
                //m.setBand(result.getString("band"));
                //m.setStudio(result.getString("studio"));
                m.setYearOfRelease(result.getInt("year_of_release"));
                m.setPrice(result.getInt("price"));
                m.setRentedDays(result.getInt("rented_of_day"));
                m.setAvailability(result.getInt("avaiability"));
                m.setMediaFormat(result.getString("media_format"));
                m.setDescription(result.getString("description"));
                //c.setEmail(result.getString("plan").charAt(0));
                media.add(m);  
                
            }
                
                result.close();
                stmt.close();
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
             
        }
            return media;
    }
}
    
   
    
    
    

