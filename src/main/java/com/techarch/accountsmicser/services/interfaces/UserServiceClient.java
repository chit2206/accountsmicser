package com.techarch.accountsmicser.services.interfaces;

import com.techarch.accountsmicser.dto.UserDTO;
//@FeignClient(name = "user-service", url = "http://localhost:8080")
public interface UserServiceClient {
    /**
     * Fetch user details from the User Service by user ID.
     *
     * @param userId the ID of the user
     * @return UserDTO containing user details
     * @GetMapping("/users/{userId}")
     *     UserDTO getUserById(@PathVariable("userId") Long userId);
     */
    UserDTO getUserById(Long userId);
}
