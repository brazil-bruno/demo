package com.orbitallpayments.demo.domains;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
@Entity(name = "transactional")
public class Transaction implements Serializable {
    @Id
    private UUID id;
    private String description;
    private double amount;
    private boolean activated;
    private Date createdAt;
    private Date updatedAt;
}
