package ims.app.dao;

import ims.app.entities.Batch;
import org.springframework.data.repository.CrudRepository;

public interface BatchRepo extends CrudRepository<Batch, Long> {
}
