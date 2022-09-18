package com.orbitallpayments.demo.canonicals;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
public class TransactionCanonical {
    private UUID id;
    private String description;
    private double amount;
    private boolean activated;
    private Date createdAt;
    private Date updatedAt;
}
