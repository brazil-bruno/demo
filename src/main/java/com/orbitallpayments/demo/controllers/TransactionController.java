package com.orbitallpayments.demo.controllers;

import com.orbitallpayments.demo.canonicals.TransactionCanonical;
import com.orbitallpayments.demo.domains.Transaction;
import com.orbitallpayments.demo.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public Transaction save(@RequestBody TransactionCanonical canonical) {
        Transaction domain = Transaction.builder()
                .id(canonical.getId())
                .activated(canonical.isActivated())
                .amount(canonical.getAmount())
                .description(canonical.getDescription())
                .createdAt(canonical.getCreatedAt())
                .updatedAt(canonical.getUpdatedAt())
                .build();

        Transaction fetchedTransaction = transactionService.save(domain);

        return fetchedTransaction;
    }

}
