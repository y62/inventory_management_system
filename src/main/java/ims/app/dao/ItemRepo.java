package ims.app.dao;

import ims.app.entities.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepo extends CrudRepository<Item, Long> {

    @Override
    List<Item> findAll();
}
