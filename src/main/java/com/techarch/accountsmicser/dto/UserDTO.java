package com.techarch.accountsmicser.dto;

public class UserDTO {


    private Long user_id; // Unique identifier for the user
    private String username; // Username of the user
    private String email; // Email address of the user
    private String phoneNumber; // Optional phone number of the user
    private String kycStatus; // KYC verification status// Default constructor
    public UserDTO() {
    }

    // Parameterized constructor
    public UserDTO(Long userId, String username, String email, String phoneNumber, String kycStatus) {
        this.user_id = userId;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.kycStatus = kycStatus;
    }

    // Getters and Setters
    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getKycStatus() {
        return kycStatus;
    }

    public void setKycStatus(String kycStatus) {
        this.kycStatus = kycStatus;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + user_id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", kycStatus='" + kycStatus + '\'' +
                '}';
    }
}



