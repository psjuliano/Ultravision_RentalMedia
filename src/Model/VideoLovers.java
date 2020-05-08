
package Model;

/**
 *
 * @author Marcelo
 */
interface VideoLovers<T> extends MediaInterface {
    public String getDirector();
    public VideoLovers<T> setMediaFormat(MediaFormat mediaFormat);
    
}