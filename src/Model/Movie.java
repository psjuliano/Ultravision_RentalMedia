/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Marcelo
 */

/* *** This class extends Media class, and implements VideoLovers class. It is going
   to link all attributes from the Media, also it is going get all VideoLovers behaviour. */
public class Movie extends Media implements VideoLovers {

    // *** Attributes ***
    private String director;

    // *** Constructor ***
    public Movie(String idMedia, String title, String band, String director, int yearOfRelease) {
        this.idMedia = idMedia;
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.mediaFormat = MediaFormat.DVD;
    }

    @Override

    // *** Here is going to verifier if the mediaFormat are the right type. ***
    public VideoLovers<Movie> setMediaFormat(MediaFormat mediaFormat) {

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

    // *** toString is going to print the attribubes values and methods. ***
    @Override
    public String toString() {
        return "Media{" + "idMedia=" + idMedia + ", title=" + title + ", yearOfRelease="
                + yearOfRelease + ", price=" + price + ", rentedDays=" + rentedDays + ", availability="
                + availability + ", mediaFormat=" + mediaFormat + ", description=" + description + '}';
    }

    @Override
    public String getDirector() {
        return this.director;
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

    @Override
    public MediaFormat mediaFormat() {
        return this.mediaFormat;

    }
}
