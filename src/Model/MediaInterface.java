package Model;

/**
 *
 * @author Priscila
 */
// *** This interface class is going to implement all methods as public. ***
interface MediaInterface {

    public String getIdMedia();

    public String getTitle();

    public int getYearOfRelease();

    public float getPrice();

    public int getRentedDays();

    public int getAvailability();

    public MediaFormat mediaFormat();

    public String getDescription();

}
