package ims.app.dao;

import ims.app.dto.BatchObject;
import ims.app.entities.Batch;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface BatchRepo extends CrudRepository<Batch, Long> {

@Query(nativeQuery=true, value = "SELECT start_quantity as startQuantity, end_quantity as endQuantity, " +
        "expiration_date as expirationDate, status as status FROM BATCH ORDER BY expiration_date ASC")
    List<BatchObject> batches();

}
