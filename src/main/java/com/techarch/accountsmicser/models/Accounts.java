package com.techarch.accountsmicser.models;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "accounts")
@Getter
@Setter
@AllArgsConstructor

public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    //@ManyToOne
      @Column(name = "user_Id",nullable = false)//nullable = falsereferencedColumnName = "user_Id")

      private Long userId;

    @Column(name = "account_number", length = 20, unique = true, nullable = false)
    private String accountNumber;

    @Column(name = "account_type", length = 20, nullable = false)
    private String accountType;

    @Column(name = "balance", precision = 15, scale = 2, columnDefinition = "DECIMAL(15, 2) DEFAULT 0.0")
    private BigDecimal balance = BigDecimal.ZERO;

    @Column(name = "currency", length = 10, columnDefinition = "VARCHAR(10) DEFAULT 'USD'")
    private String currency = "USD";

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt = LocalDateTime.now();

    // getters and setters
}
