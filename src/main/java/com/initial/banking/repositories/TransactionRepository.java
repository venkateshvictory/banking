package com.initial.banking.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.initial.banking.models.Transaction;


public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    // TODO Limit to recent transactions and implement separate endpoint to view old transactions
    List<Transaction> findBySourceAccountIdOrderByInitiationDate(long id);
}
