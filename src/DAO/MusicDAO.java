package DAO;

import Model.Media;
import Model.Movie;
import Model.Music;
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
public class MusicDAO {

    // This class is going to treat all transaction on my database from the view
    /* I used boolean to be possible to print out the status of the command, but I could 
    use void as well if did not wanted to return a statement */
    public static boolean insert(Music music) {

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
            stmt.setString(1, music.getTitle());
            stmt.setInt(2, music.getYearOfRelease());
            stmt.setFloat(3, music.getPrice());
            stmt.setInt(4, music.getRentedDays());
            stmt.setInt(5, music.getAvailability());
            stmt.setString(6, music.getMediaFormat());
            stmt.setString(7, music.getDescription());
            stmt.setString(8, music.getMediaType());

            // *** Execute the program ***
            int result = stmt.executeUpdate();
            if (result > 0) {
                // Here it will recover the key generated in media
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    int idMedia = rs.getInt(1);
                    music.setIdMedia(String.valueOf(idMedia));
                    String sqlMusic = "INSERT into music(idmedia, band)"
                            + "values (?,?)";

                    PreparedStatement stmtMusic = connectionClass.prepareStatement(sqlMusic);
                    stmtMusic.setInt(1, idMedia);
                    //stmtMusic.setString(2, music.getDirector());

                    result = stmtMusic.executeUpdate();
                    stmtMusic.close();
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

    public static boolean update(Music music) {
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
            stmt.setString(1, music.getTitle());
            stmt.setInt(2, music.getYearOfRelease());
            stmt.setInt(3, music.getRentedDays());
            stmt.setInt(4, music.getAvailability());
            stmt.setString(5, music.getMediaFormat());
            stmt.setString(6, music.getDescription());
            stmt.setString(7, music.getMediaType());
            stmt.setString(8, music.getIdMedia());

            // *** Here is going to make sure if the update was executed. ***  
            int numberRows = stmt.executeUpdate();
            if (numberRows > 0) {
                sql = "update music SET band = ? WHERE idmedia = ? ";

                PreparedStatement stmtMusic = conn.prepareStatement(sql);
                //stmtMusic.setString(1, music.getDirector());
                stmtMusic.setString(2, music.getIdMedia());

                numberRows = stmtMusic.executeUpdate();
                stmtMusic.close();
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
            String sql = "DELETE FROM music WHERE idMedia = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, idMedia);
            int numberRows = stmt.executeUpdate();
            stmt.close();
            if (numberRows > 0) {
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

    public static List<Music> list() {

        // *** Here is an Array, that is going to list all client from the database. ***
        List<Music> musicList = new ArrayList<Music>();

        //  *** try..catch is going to treat any possible error. ***      
        try {

            Connection conn = ConnectionClass.getConnectionClass();
            /* *** Here are all fields from the database, also is join the plan_type table
        on the media table.*** */
            String sql = "SELECT * FROM media "
                    + "join music on media.idmedia= music.idmedia ";

            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                Music music = new Music();
                music.setIdMedia(result.getString("idMedia"));
                music.setTitle(result.getString("title"));
                //music.setDirector(result.getString("director"));
                //m.setBand(result.getString("band"));
                //m.setStudio(result.getString("studio"));
                music.setYearOfRelease(result.getInt("year_of_release"));
                music.setPrice(result.getInt("price"));
                music.setRentedDays(result.getInt("rented_of_day"));
                music.setAvailability(result.getInt("avaiability"));
                music.setMediaFormat(result.getString("media_format"));
                music.setDescription(result.getString("description"));
                //c.setEmail(result.getString("plan").charAt(0));
                musicList.add(music);
            }

            result.close();
            stmt.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return musicList;
    }
}
