package com.orbitallpayments.demo.repositories;

import com.orbitallpayments.demo.domains.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, UUID> {

    List<Transaction> findByDescription(String description);

}
