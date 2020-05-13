
package DAO;

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

public class MovieDAO {

    // This class is going to treat all transaction on my database from the view
    /* I used boolean to be possible to print out the status of the command, but I could 
    use void as well if did not wanted to return a statement */
    public static boolean insert(Movie movie) {

        //  *** try..catch is going to treat any possible error. ***
        try {
            Connection connectionClass = ConnectionClass.getConnectionClass();

            // *** Here are all fields from the database ***
            String sql = "INSERT INTO media(title, year_of_release, price, rented_of_day,"
                    + "availability, media_format, description, media_type) "
                    // *** Here is going to get the values insert on the database ***
                    + "VALUES (?,?,?,?,?,?,?,?)";

            // *** PreparedStament is a class that execute commads sql, getting the value. *** vai retornar o codigo da midia gerada 
            PreparedStatement stmt = connectionClass.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            // *** Here is going to get the information on the Media class. ***
            stmt.setString(1, movie.getTitle());
            stmt.setInt(2, movie.getYearOfRelease());
            stmt.setFloat(3, movie.getPrice());
            stmt.setInt(4, movie.getRentedDays());
            stmt.setInt(5, movie.getAvailability());
            stmt.setString(6, movie.getMediaFormat());
            stmt.setString(7, movie.getDescription());
            stmt.setString(8, movie.getMediaType());

            // *** Execute the program ***
            int result = stmt.executeUpdate();
            if (result > 0) {
                // Here it will recover the key generated in media
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    int idMedia = rs.getInt(1);
                    movie.setIdMedia(String.valueOf(idMedia));
                    String sqlMovie = "INSERT into movie(idmedia, director)"
                            + "values (?,?)";
                    
              PreparedStatement stmtMovie = connectionClass.prepareStatement(sqlMovie);
                stmtMovie.setInt(1,idMedia);
                stmtMovie.setString(2, movie.getDirector());
                
                result = stmtMovie.executeUpdate();
                stmtMovie.close();
                }
            }
                    

            // *** Finish the command and realease space memory that is not being used. ***
            stmt.close();

            return (result > 0) ? true : false;

            // *** Here is going to return any possible error. ***
        } catch (Exception e) {
            System.out.println("MovieDao.insert: " + e.getMessage());
        }
        return false;
    }

    public static boolean update(Movie movie) {
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
                    + "availability = ?,"
                    + "media_format = ?,"
                    + "description = ?,"
                    + "media_type = ?"
                    + "WHERE idMedia = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            // *** Here is going to get the information on the Media class. ***
            stmt.setString(1, movie.getTitle());
            stmt.setInt(2, movie.getYearOfRelease());
            stmt.setInt(3, movie.getRentedDays());
            stmt.setFloat(4, movie.getPrice());
            stmt.setInt(5, movie.getAvailability());
            stmt.setString(6, movie.getMediaFormat());
            stmt.setString(7, movie.getDescription());
            stmt.setString(8, movie.getMediaType());
            stmt.setString(9, movie.getIdMedia());
           
            // *** Here is going to make sure if the update was executed. ***  
            int numberRows = stmt.executeUpdate();
            if (numberRows >0) {
                sql = "update Movie SET director = ? WHERE idmedia = ? ";
                
                PreparedStatement stmtMovie = conn.prepareStatement(sql);
                stmtMovie.setString(1, movie.getDirector());
                stmtMovie.setString(2, movie.getIdMedia());
                
                numberRows = stmtMovie.executeUpdate();
                stmtMovie.close();
            }
            
            stmt.close();
            
            return numberRows > 0;
           
        } catch (Exception e) {
            System.out.println("MovieDao.uptade: " + e.getMessage());

            return false;
        }
    }

    public static boolean delete(int idMedia) {
        // *** Here is going to delete any media details, when need. ***

        //  *** try..catch is going to treat any possible error. ***
        try {
            Connection conn = ConnectionClass.getConnectionClass();
            // *** Here are all fields from my database ***   
            String sql = "DELETE FROM movie WHERE idMedia = ?";
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
            System.out.println("MovieDao.delete: " + e.getMessage());

            return false;
        }
    }

    public static List<Movie> list() {

        // *** Here is an Array, that is going to list all clients from the database. ***
        List<Movie> movieList = new ArrayList<Movie>();

        //  *** try..catch is going to treat any possible error. ***      
        try {

            Connection conn = ConnectionClass.getConnectionClass();
            /* *** Here are all fields from the database, also is join the plan_type table
        on the media table.*** */
            String sql = "SELECT * FROM media "
            + "join movie on media.idmedia= movie.idmedia ";
            
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                Movie m = new Movie();
                m.setIdMedia(result.getString("idMedia"));
                m.setTitle(result.getString("title"));
                m.setDirector(result.getString("director"));
                m.setYearOfRelease(result.getInt("year_of_release"));
                m.setPrice(result.getInt("price"));
                m.setRentedDays(result.getInt("rented_of_day"));
                m.setAvailability(result.getInt("availability"));
                m.setMediaFormat(result.getString("media_format"));
                m.setDescription(result.getString("description"));
                movieList.add(m);
            }

            result.close();
            stmt.close();

        } catch (Exception e) {
            System.out.println("MovieDao.list: " + e.getMessage());

        }
        return movieList;
    }
     public static List<Movie> list(Media mediaSearch) {
        // *** Here is going to search for a client by id or name. ***
        List<Movie> movieList = new ArrayList<Movie>();

        //  *** try..catch is going to treat any possible error. ***
        try {

            Connection conn = ConnectionClass.getConnectionClass();
            /* *** Here are all fields from the database, also is join the plan_type table
        on the client table.*** */
            String sql = "SELECT * FROM media "
                    + "join movie on media.idmedia = movie.idmedia "
                    + "WHERE title like ? or media.idmedia = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + mediaSearch.getTitle()+ "%");
            stmt.setString(2, mediaSearch.getIdMedia());

            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                Movie m = new Movie();
                m.setIdMedia(result.getString("idmedia"));
                m.setYearOfRelease(result.getInt("year_of_release"));
                m.setPrice(result.getFloat("price"));
                m.setRentedDays(result.getInt("rented_of_day"));
                m.setAvailability(result.getInt("availability"));
                m.setMediaFormat(result.getString("media_format"));
                m.setDescription(result.getString("description"));
                m.setMediaType(result.getString("media_type"));
                
                m.setDirector(result.getString("director"));

                movieList.add(m);
            }
            result.close();
            stmt.close();

        } catch (Exception e) {
           System.out.println("MovieDao.list: " + e.getMessage());
        }
        return movieList;
    }
     
      public static Movie getMovieById(int idMedia) {
        // *** Here is going to delete any media details, when need. ***
        Movie m = new Movie();
        //  *** try..catch is going to treat any possible error. ***
        try {
            Connection conn = ConnectionClass.getConnectionClass();
            // *** Here are all fields from my database ***   
            String sql = "SELECT * FROM media "
                    + "join movie on media.idmedia = movie.idmedia "
                    + "WHERE media.idmedia = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idMedia);
            
            ResultSet result = stmt.executeQuery();
            //stmt.close();
            
            if (result.next() ) {
                m.setIdMedia(result.getString("idmedia"));
                m.setYearOfRelease(result.getInt("year_of_release"));
                m.setPrice(result.getFloat("price"));
                m.setRentedDays(result.getInt("rented_of_day"));
                m.setAvailability(result.getInt("availability"));
                m.setMediaFormat(result.getString("media_format"));
                m.setDescription(result.getString("description"));
                m.setMediaType(result.getString("media_type"));
                
                m.setDirector(result.getString("director"));

            }

        } catch (Exception e) {
           System.out.println("MovieDao.getMovieById: " + e.getMessage());
        }
         return m;
    }
}
// *** REFERENCES: ***
/* Banco de Dados em Java - Aula 10 - Testando a classe DAO
YouTube, 10 Jan. 2013, https://youtu.be/5l-dByzcWRQ.*/