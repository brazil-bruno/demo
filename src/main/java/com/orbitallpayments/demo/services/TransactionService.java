package com.orbitallpayments.demo.services;

import com.orbitallpayments.demo.domains.Transaction;
import com.orbitallpayments.demo.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction save(Transaction transaction) {
        Date currentTime = new Date();

        transaction.setActivated(true);
        transaction.setCreatedAt(currentTime);
        transaction.setUpdatedAt(currentTime);

        return transactionRepository.save(transaction);
    }

}
