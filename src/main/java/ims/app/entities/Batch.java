package ims.app.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Batch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long batchId;
    private int startQuantity;
    private int endQuantity;
    private String expirationDate;
    private String status;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST},
            fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST},
            fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    public Batch() {
    }

    public Batch(int startQuantity, int endQuantity, String expirationDate, String status) {
        this.startQuantity = startQuantity;
        this.endQuantity = endQuantity;
        this.expirationDate = expirationDate;
        this.status = status;
    }

    public long getBatchId() {
        return batchId;
    }

    public void setBatchId(long batchId) {
        this.batchId = batchId;
    }

    public int getStartQuantity() {
        return startQuantity;
    }

    public void setStartQuantity(int startQuantity) {
        this.startQuantity = startQuantity;
    }

    public int getEndQuantity() {
        return endQuantity;
    }

    public void setEndQuantity(int finishQuantity) {
        this.endQuantity = finishQuantity;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
