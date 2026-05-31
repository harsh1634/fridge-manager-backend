package com.fridgeapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateRequest {
    private String username;
    private String password;

    @NotBlank(message = "Email address is required.")
    @Email(message = "Invalid email address format.")
    private String email;
}