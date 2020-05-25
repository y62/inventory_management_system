package ims.app.dao;

import ims.app.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface UserRepo extends CrudRepository<User, Long> {
}
