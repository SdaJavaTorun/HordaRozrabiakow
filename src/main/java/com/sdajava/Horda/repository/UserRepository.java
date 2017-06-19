package com.sdajava.Horda.repository;

import com.sdajava.Horda.model.Role;
import com.sdajava.Horda.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by RENT on 2017-06-13.
 */

@Repository
public interface UserRepository extends CrudRepository <User, Long> {

    User findByUsername(String username);

    User findById (Long id);

    User removeAllByUsername (String username);


    @Override
    User findOne(Long aLong);

    @Override
    boolean exists(Long aLong);

    @Override
    Iterable<User> findAll();

    @Override
    Iterable<User> findAll(Iterable<Long> iterable);

    @Override
    long count();

    @Override
    void delete(Long aLong);

    @Override
    void delete(User user);
}



