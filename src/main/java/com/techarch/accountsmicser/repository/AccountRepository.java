package com.techarch.accountsmicser.repository;

import com.techarch.accountsmicser.models.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository <Accounts,Long> {

    List<Accounts> findByUserId(Long user_id);
    boolean existsByAccountNumber(String accountNumber);
    //Accounts findByAccountNumber(String accountNumber);
    /*JpaRepository:

save(Account account): Saves or updates an account entity.
findById(Long accountId): Retrieves an account by its primary key.
findAll(): Retrieves all accounts.
deleteById(Long accountId): Deletes an account by its ID.
existsById(Long accountId): Checks if an account exists with a specific ID.*/
}
