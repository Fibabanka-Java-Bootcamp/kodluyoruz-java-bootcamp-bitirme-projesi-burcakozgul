package org.kodluyoruz.mybank.repositories;

import org.kodluyoruz.mybank.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    boolean existsByTckn(String tckn);
}
