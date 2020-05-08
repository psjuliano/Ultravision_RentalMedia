
package Model;

/**
 *
 * @author Priscila
 */
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
