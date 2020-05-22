package ims.app.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vendorId;
    private String cvr;

    @OneToMany(mappedBy = "vendor")
    private List<Product> products;

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
