package org.example.repository;

import org.example.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends JpaRepository<LoginEntity, Integer  > {
    boolean findByEmail(String email);
}
