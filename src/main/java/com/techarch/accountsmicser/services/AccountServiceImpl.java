package com.techarch.accountsmicser.services;

import com.techarch.accountsmicser.dto.UserDTO;
import com.techarch.accountsmicser.models.Accounts;
import com.techarch.accountsmicser.repository.AccountRepository;
import com.techarch.accountsmicser.services.interfaces.AccountService;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class AccountServiceImpl implements AccountService {
    private static final Logger logger = LogManager.getLogger(AccountServiceImpl.class);
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private UserServiceClientImpl userServiceClient;

    @Override
    public Accounts createAccount(Accounts account) {
        // Validate user

        UserDTO userDTO = validateUser(account.getUserId());
        if (userDTO == null) {
            throw new IllegalArgumentException("Invalid user ID");}
            if (accountRepository.existsByAccountNumber(account.getAccountNumber())) {
                throw new IllegalArgumentException("Account number already exists");
            }


        return accountRepository.save(account);
    }

    @Override
    public Optional<Accounts> getAccountById(Long accountId) {
        return Optional.empty();
    }

    @Override
        public List<Accounts> getAccountsByUserId(Long user_id) {
logger.info("reached in getAccountById ");
            List<Accounts> account=accountRepository.findByUserId(user_id);
        logger.info(" accounts available  {}",account);
        return account;
        }



    @Override
    public Accounts updateAccount(Long accountId, Accounts account) {
        return null;
    }

    @Override
    public void deleteAccount(Long accountId) {

    }

    @Override
    public UserDTO validateUser(Long userId) {
        // Fetch user details from User Service
        UserDTO userDTO = userServiceClient.getUserById(userId);
        if (userDTO == null) {
            throw new IllegalArgumentException("User not found with ID: " + userId);
        }
        return userDTO;
    }
}
