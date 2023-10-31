package com.canddella.FeelBetter.repositary;


import com.canddella.FeelBetter.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
