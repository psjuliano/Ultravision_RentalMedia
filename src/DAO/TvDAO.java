
package DAO;

import Model.BoxSet;
import Model.Media;
import Model.Movie;
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
// test
public class TvDAO {

    // This class is going to treat all transaction on my database from the view
    /* I used boolean to be possible to print out the status of the command, but I could 
    use void as well if did not wanted to return a statement */
    public static boolean insert(BoxSet tv) {

        //  *** try..catch is going to treat any possible error. ***
        try {
            Connection connectionClass = ConnectionClass.getConnectionClass();

            // *** Here are all fields from the database ***
            String sql = "INSERT INTO media(title, year_of_release, price, rented_of_day,"
                    + "avaiability, media_format, description, media_type) "
                    // *** Here is going to get the values insert on the database ***
                    + "VALUES (?,?,?,?,?,?,?,?)";

            // *** PreparedStament is a class that execute commads sql, getting the value. *** vai retornar o codigo da midia gerada 
            PreparedStatement stmt = connectionClass.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            // *** Here is going to get the information on the Media class. ***
            stmt.setString(1, tv.getTitle());
            stmt.setInt(2, tv.getYearOfRelease());
            stmt.setFloat(3, tv.getPrice());
            stmt.setInt(4, tv.getRentedDays());
            stmt.setInt(5, tv.getAvailability());
            stmt.setString(6, tv.getMediaFormat());
            stmt.setString(7, tv.getDescription());
            stmt.setString(8, tv.getMediaType());

            // *** Execute the program ***
            int result = stmt.executeUpdate();
            if (result > 0) {
                // Here will recover the key generated in media
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    int idMedia = rs.getInt(1);
                    tv.setIdMedia(String.valueOf(idMedia));
                    String sqlTv = "INSERT into tv(idmedia, studio)"
                            + "values (?,?)";
                    
              PreparedStatement stmtTv = connectionClass.prepareStatement(sqlTv);
                stmtTv.setInt(1,idMedia);
                stmtTv.setString(2, tv.getStudio());
                
                result = stmtTv.executeUpdate();
                stmtTv.close();
                }
            }
                    

            // *** Finish the commad and realease space memory that is not being used. ***
            stmt.close();

            return (result > 0) ? true : false;

            // *** Here is going to return any possible error. ***
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean update(BoxSet tv) {
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
                    + "description = ?,"
                    + "media_type = ?"
                    + "WHERE idMedia = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            // *** Here is going to get the information on the Media class. ***
            stmt.setString(1, tv.getTitle());
            stmt.setInt(2, tv.getYearOfRelease());
            stmt.setInt(3, tv.getRentedDays());
            stmt.setInt(4, tv.getAvailability());
            stmt.setString(5, tv.getMediaFormat());
            stmt.setString(6, tv.getDescription());
            stmt.setString(7, tv.getMediaType());
            stmt.setString(8, tv.getIdMedia());
           
            // *** Here is going to make sure if the update was executed. ***  
            int numberRows = stmt.executeUpdate();
            if (numberRows >0) {
                sql = "update tv SET studio = ? WHERE idmedia = ? ";
                
                PreparedStatement stmtTv = conn.prepareStatement(sql);
                stmtTv.setString(1, tv.getStudio());
                stmtTv.setString(2, tv.getIdMedia());
                
                numberRows = stmtTv.executeUpdate();
                stmtTv.close();
            }
            
            stmt.close();
            
            return numberRows > 0;

        } catch (Exception e) {
            return false;
        }
    }

    public static boolean delete(int idMedia) {
        // *** Here is going to delete any media details, when need. ***

        //  *** try..catch is going to treat any possible error. ***
        try {
            Connection conn = ConnectionClass.getConnectionClass();
            // *** Here are all fields from my database ***   
            String sql = "DELETE FROM tv WHERE idMedia = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, idMedia);
            int numberRows = stmt.executeUpdate();
            stmt.close();
            if (numberRows >0) {
                sql = "DELETE FROM media WHERE idMedia = ?";
                
             PreparedStatement stmtMedia = conn.prepareStatement(sql);

            stmtMedia.setInt(1, idMedia);
            numberRows = stmtMedia.executeUpdate();
            stmtMedia.close();
                
            }
            return numberRows > 0;

        } catch (Exception e) {

            return false;
        }
    }

    public static List<BoxSet> list() {

        // *** Here is an Array, that is going to list all client from the database. ***
        List<BoxSet> tvList = new ArrayList<BoxSet>();

        //  *** try..catch is going to treat any possible error. ***      
        try {

            Connection conn = ConnectionClass.getConnectionClass();
            /* *** Here are all fields from the database, also is join the plan_type table
        on the media table.*** */
            String sql = "SELECT * FROM media "
            + "left join tv on media.idmedia= tv.idmedia ";
            
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                BoxSet bs = new BoxSet();
                bs.setIdMedia(result.getString("idMedia"));
                bs.setTitle(result.getString("title"));
                bs.setStudio(result.getString("studio"));
                //m.setBand(result.getString("band"));
                //m.setStudio(result.getString("studio"));
                bs.setYearOfRelease(result.getInt("year_of_release"));
                bs.setPrice(result.getInt("price"));
                bs.setRentedDays(result.getInt("rented_of_day"));
                bs.setAvailability(result.getInt("avaiability"));
                bs.setMediaFormat(result.getString("media_format"));
                bs.setDescription(result.getString("description"));
                //c.setEmail(result.getString("plan").charAt(0));
                tvList.add(bs);
            }

            result.close();
            stmt.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return tvList;
    }
}
