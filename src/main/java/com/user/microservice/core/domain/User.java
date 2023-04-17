package com.user.microservice.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
public class User {
    private final long id;

    private final String firstname;

    private final String lastname;

    private final String username;

    private final String email;

    private final LocalDate birthdate;
}
