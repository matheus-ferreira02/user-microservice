package com.user.microservice.entrypoint.user.create.request;

import com.user.microservice.core.domain.User;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class UserRequest {

    private final String firstName;

    private final String lastName;

    private final String email;

    private final LocalDate birthDate;

    public User toDomain() {
        return User.builder()
                .firstname(this.getFirstName())
                .lastname(this.getLastName())
                .email(this.getEmail())
                .birthdate(this.getBirthDate())
                .build();
    }

}
