package com.sdajava.Horda.repository;

import com.sdajava.Horda.model.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    @Query("SELECT r FROM Role r INNER JOIN r.users u WHERE u.username = ?1")
    Role findRoleByUsername(String username);

}