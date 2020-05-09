package Model;

/**
 *
 * @author Marcelo
 */
// *** This is a Generic interface class, that is extends MediaInterface. ***
interface VideoLovers<T> extends MediaInterface {

    public String getDirector();

    public VideoLovers<T> setMediaFormat(MediaFormat mediaFormat);

}
