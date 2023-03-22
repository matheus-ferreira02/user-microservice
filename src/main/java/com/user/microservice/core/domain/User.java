package com.user.microservice.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class User {
    private final long id;

    private final String firstname;

    private final String lastname;

    private final String email;

    private final LocalDate birthdate;
}
