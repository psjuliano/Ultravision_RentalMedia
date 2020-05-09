
package Model;

/**
 *
 * @author Marcelo
 */

 /* *** This class extends Media class, and implements TVLovers class. It is going
 to link all attributes from the Media, also it is going get all TVLovers behaviour. ***/

class LiveConcertVideo extends Media implements MusicLovers{
    // *** Attributes ***
    protected String band;

    // *** Constructor ***
    public LiveConcertVideo(String idMedia, String title,String band, int yearOfRelease) {
        this.idMedia = idMedia;
        this.title = title;
        this.band = band;
        this.yearOfRelease = yearOfRelease;
        this.mediaFormat = MediaFormat.DVD;
    }
    
    // *** toString is going to print the attribubes values and methods. ***
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