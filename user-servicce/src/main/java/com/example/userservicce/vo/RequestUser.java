package com.example.userservicce.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestUser {

    @NotNull(message = "Email cannot ne null")
    @Size(min = 2, message = "Email not be less than two characters")
    private String email;

    @NotNull(message = "Name cannot ne null")
    @Size(min = 2, message = "Name not be less than two characters")
    private String name;

    @NotNull(message = "Password cannot ne null")
    @Size(min = 8, message = "Password must be equal or grater than 8 characters")
    private String pwd;
}
