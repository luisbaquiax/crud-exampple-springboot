package org.baquiax.crudexample.repositories;

import org.baquiax.crudexample.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
