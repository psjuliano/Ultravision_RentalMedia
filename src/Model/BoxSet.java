package Model;

/**
 *
 * @author Priscila
 */
/* *** This class extends Media class, and implements TVLovers class. It is going
  to link all attributes from the Media, also it is going get all TVLovers behaviour. ***/
class BoxSet extends Media implements TVLovers {

    // *** Attributes ***
    private String studio;

    // *** Constructor ***
    public BoxSet(String idMedia, String title, String studio, int yearOfRelease) {
        this.idMedia = idMedia;
        this.title = title;
        this.studio = studio;
        this.yearOfRelease = yearOfRelease;
        this.mediaFormat = MediaFormat.BLUERAY;

    }
    // *** Here is going to verifier if the mediaFormat are the right type. *** 

    @Override
    public TVLovers<BoxSet> setMediaFormat(MediaFormat mediaFormat) {
        switch (mediaFormat) {
            case DVD:
            case BLUERAY:
                this.mediaFormat = mediaFormat;
                break;
            default:
                throw new IllegalArgumentException();
        }
        return this;
    }

    // *** toString is going to print the attributes values and methods. ***
    @Override
    public String toString() {
        return "Media{" + "idMedia=" + idMedia + ", title=" + title + ", studio=" + studio + ", yearOfRelease="
                + yearOfRelease + ", price=" + price + ", rentedDays=" + rentedDays + ", availability="
                + availability + ", mediaFormat=" + mediaFormat + ", description=" + description + '}';
    }

    @Override
    public String getIdMedia() {
        return this.idMedia;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int getYearOfRelease() {
        return this.yearOfRelease;

    }

    public String getStudio() {
        return this.studio;
    }

    public MediaFormat mediaFormat() {
        return this.mediaFormat;
    }
}
