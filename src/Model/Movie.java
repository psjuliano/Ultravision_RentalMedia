
package Model;

/**
 *
 * @author Marcelo
 */
public class Movie extends Media implements VideoLovers{
    private String director;

    public Movie(String idMedia, String title,String band, String director, int yearOfRelease) {
        this.idMedia = idMedia;
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.mediaFormat = MediaFormat.DVD;
    }
    
    @Override
    // Verifica se as midias batem
    public VideoLovers<Movie>setMediaFormat(MediaFormat mediaFormat) {
        
        switch(mediaFormat){
            case DVD:
            case BLUERAY: 
            this.mediaFormat = mediaFormat;
            break;
            default: 
        throw new IllegalArgumentException();
        }
        return this;
    }

    @Override
    public String toString() {
        return "Media{" + "idMedia=" + idMedia + ", title=" + title + ", yearOfRelease=" +
         yearOfRelease + ", price=" + price + ", rentedDays=" + rentedDays + ", availability=" + 
           availability + ", mediaFormat=" + mediaFormat + ", description=" + description + '}';
    }
    @Override
    public String getDirector() {
        return this.director;
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
    public MediaFormat mediaFormat() {
        return this.mediaFormat;

    }

    
}