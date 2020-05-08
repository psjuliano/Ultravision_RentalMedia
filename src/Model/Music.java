package Model;

/**
 *
 * @author Marcelo
 */
public class Music extends Media implements MusicLovers{
    // *** Attributes ****
    protected String band;
    
    // *** Constructor ***
    // Perguntar se tem problema em não fazer o constructor de todos os atributos
    public Music(String idMedia, String title,String band, int yearOfRelease) {
        this.idMedia = idMedia;
        this.title = title;
        this.band = band;
        this.yearOfRelease = yearOfRelease;
        this.mediaFormat = MediaFormat.CD;
        
    }
   
    @Override
    public String toString() {
        return "Media{" + "idMedia=" + idMedia + ", title=" + title + ", yearOfRelease=" +
         yearOfRelease + ", price=" + price + ", rentedDays=" + rentedDays + ", availability=" + 
           availability + ", mediaFormat=" + mediaFormat + ", description=" + description + '}';
    }
     
    @Override
    public String getIdMedia(){
        return this.idMedia;
    }

    @Override
    public String getTitle(){
        return this.title;
    }
    @Override
    public int getYearOfRelease(){
        return this.yearOfRelease;
        
    }
    @Override
    public String getBand() {
        return this.band;
    }

    @Override
    public MediaFormat mediaFormat() {
        return this.mediaFormat;

    }
    
    
}
