package com.server.TC.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phone;
    private String password;
    private String confirmPassword;

    public User() {}

    public User(String phone, String password, String confirmPassword) {
        this.phone = phone;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public Long getId() { return id; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getConfirmPassword() { return confirmPassword; }
    public void setConfirmPassword(String confirmPassword) { this.confirmPassword = confirmPassword; }
}
