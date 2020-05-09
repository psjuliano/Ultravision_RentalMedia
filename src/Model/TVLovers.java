
package Model;

/**
 *
 * @author Priscila
 */
    // *** This is a Generic interface class, that is extends MediaInterface. ***
interface TVLovers<T> extends MediaInterface{
    public String getStudio();
    public TVLovers<T> setMediaFormat(MediaFormat mediaFormat);
    
    
}
