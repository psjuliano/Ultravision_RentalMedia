
package Model;

/**
 *
 * @author Priscila
 * test
 */
class BoxSet extends Media implements TVLovers{
    private String studio;
    
    
     public BoxSet(String idMedia, String title,String studio, int yearOfRelease) {
        this.idMedia = idMedia;
        this.title = title;
        this.studio = studio;
        this.yearOfRelease = yearOfRelease;
        this.mediaFormat = MediaFormat.BLUERAY;
    
    }
     
     @Override
    public TVLovers<BoxSet> setMediaFormat(MediaFormat mediaFormat) {
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
        return "Media{" + "idMedia=" + idMedia + ", title=" + title + ", studio=" + studio + ", yearOfRelease=" +
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
    public String getStudio() {
        return this.studio;
    }

    public MediaFormat mediaFormat() {
        return this.mediaFormat;

    }
    
}
