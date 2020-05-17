package ims.app.dao;

import ims.app.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Long> {

    @Override
    List<Product> findAll();
}
