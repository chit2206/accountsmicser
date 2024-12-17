package com.techarch.accountsmicser.services.interfaces;

import com.techarch.accountsmicser.dto.UserDTO;
import com.techarch.accountsmicser.models.Accounts;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    /**
     * Creates a new account for a user.
     *
     * @param account the account entity to be created
     * @return the created account entity
     */
    Accounts createAccount(Accounts account);

    /**
     * Retrieves an account by its ID.
     *
     * @param accountId the ID of the account
     * @return the account entity
     */
    Optional<Accounts> getAccountById(Long accountId);

    /**
     * Retrieves all accounts associated with a given user ID.
     *
     * @param userId the ID of the user
     * @return the list of accounts for the user
     */
    List<Accounts> getAccountsByUserId(Long userId);

    /**
     * Updates an existing account.
     *
     * @param accountId the ID of the account to be updated
     * @param account the updated account entity
     * @return the updated account entity
     */
    Accounts updateAccount(Long accountId, Accounts account);

    /**
     * Deletes an account by its ID.
     *
     * @param accountId the ID of the account to be deleted
     */
    void deleteAccount(Long accountId);

    /**
     * Validates the user details by calling the User Service.
     *
     * @param userId the ID of the user to validate
     * @return the UserDTO containing user details
     */
    UserDTO validateUser(Long userId);
}
