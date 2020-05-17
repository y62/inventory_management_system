package ims.app.entities;

import javax.persistence.*;

@Entity
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long vendorId;
    private String cvr;


    public Vendor() {
    }

    public Vendor(String cvr) {
        this.cvr = cvr;
    }

    public long getVendorId() {
        return vendorId;
    }

    public void setVendorId(long producerId) {
        this.vendorId = vendorId;
    }

    public String getCvr() {
        return cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }
}
