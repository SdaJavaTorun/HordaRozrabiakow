package com.sdajava.Horda.repository;

import com.sdajava.Horda.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by RENT on 2017-06-13.
 */

@Repository
public interface UserRepository extends CrudRepository{
    User findByUsername (String username);

    @Override
    Object save(Object o);

    @Override
    Iterable save(Iterable iterable);

    @Override
    Object findOne(Serializable serializable);

    @Override
    boolean exists(Serializable serializable);

    @Override
    Iterable findAll();

    @Override
    Iterable findAll(Iterable iterable);

    @Override
    long count();

    @Override
    void delete(Serializable serializable);

    @Override
    void delete(Object o);

    @Override
    void delete(Iterable iterable);

    @Override
    void deleteAll();
}
