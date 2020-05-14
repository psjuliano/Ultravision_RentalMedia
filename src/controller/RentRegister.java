package controller;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public class RentRegister {

    // *** Attributes ***
    private int id;
    private ClientsRegister client;
    private Date dateOut;
    private Date dateReturn;
    
   
    private List<Object> media;

    // *** Getter and Setter ***

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClientsRegister getClient() {
        return client;
    }

    public void setClient(ClientsRegister client) {
        this.client = client;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public Date getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }

    public List<Object> getMedia() {
        return media;
    }

    public void setMedia(List<Object> media) {
        this.media = media;
    }
   
}
