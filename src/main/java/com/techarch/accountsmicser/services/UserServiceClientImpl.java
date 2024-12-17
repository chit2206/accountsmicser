package com.techarch.accountsmicser.services;

import com.techarch.accountsmicser.dto.UserDTO;
import com.techarch.accountsmicser.services.interfaces.UserServiceClient;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@AllArgsConstructor
@Service
public class UserServiceClientImpl implements UserServiceClient {
    private static final Logger logger = LogManager.getLogger(AccountServiceImpl.class);

    @Autowired
    private RestTemplate restTemplate;

    private static final String USER_SERVICE_URL = "http://localhost:8080/users"; // Replace with User Service base URL

    @Override
    public UserDTO getUserById(Long userId) {
        String url = USER_SERVICE_URL + "/" + userId;

         UserDTO udto=restTemplate.getForObject(url, UserDTO.class);
         logger.info("{}",udto);
        return udto;
    }
}
