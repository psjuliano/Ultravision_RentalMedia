package Model;

/**
 *
 * @author Priscila
 */
// *** This is a mother class, that is going to extends to her children. ***
public class Media {

    // ***** Attributes *****
    protected String idMedia;
    protected String title;
    protected int yearOfRelease;
    protected float price;
    protected int rentedDays;
    protected int availability;
    protected MediaFormat mediaFormat;
    protected String description;

    // *** toString is going to print the attribubes values and methods. ***
    @Override
    public String toString() {
        return "Media{" + "idMedia=" + idMedia + ", title=" + title + ", yearOfRelease="
                + yearOfRelease + ", price=" + price + ", rentedDays=" + rentedDays + ", availability="
                + availability + ", mediaFormat=" + mediaFormat + ", description=" + description + '}';
    }

    // *** Getter and Setter ***
    public String getIdMedia() {
        return idMedia;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public float getPrice() {
        return price;
    }

    public int getRentedDays() {
        return rentedDays;
    }

    public int getAvailability() {
        return availability;
    }

    public String getMediaFormat() {
        return mediaFormat.toString().toUpperCase();
    }

    public String getDescription() {
        return description;
    }

    public void setIdMedia(String idMedia) {
        this.idMedia = idMedia.valueOf(idMedia);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setRentedDays(int rentedDays) {
        this.rentedDays = rentedDays;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = MediaFormat.valueOf(mediaFormat.toUpperCase());
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
