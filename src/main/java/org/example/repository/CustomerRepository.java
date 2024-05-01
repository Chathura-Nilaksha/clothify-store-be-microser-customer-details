package org.example.repository;

import org.example.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.DefaultResponseErrorHandler;
//@EnableJpaRepositories
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
    String existsByEmail(String email);
    CustomerEntity findByEmail(String email);
}
