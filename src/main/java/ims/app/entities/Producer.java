package ims.app.entities;

import javax.persistence.*;

@Entity
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long producerId;
    private String cvr;


    public Producer() {
    }

    public Producer(String cvr) {
        this.cvr = cvr;
    }

    public long getProducerId() {
        return producerId;
    }

    public void setProducerId(long producerId) {
        this.producerId = producerId;
    }

    public String getCvr() {
        return cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }
}
