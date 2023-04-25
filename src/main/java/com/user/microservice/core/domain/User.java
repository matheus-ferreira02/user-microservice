package com.user.microservice.core.domain;

import com.user.microservice.core.exception.DomainException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;

import static java.lang.String.format;

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

    private static final long MINIMUM_LENGTH = 3;

    public static User create(final long id,
                              final String firstname,
                              final String lastname,
                              final String username,
                              final String email,
                              final LocalDate birthDate) {

        validateName(firstname, lastname);
        validateUsername(username);
        validateEmail(email);
        //todo: fazer o restante das validações

        return new User(id, firstname, lastname, username, email, birthDate);
    }

    private static void validateName(String firstname, String lastname) {
        validateIsNotBlank(firstname);
        validateIsNotBlank(lastname);
    }

    private static void validateUsername(String username) {
        validateIsNotBlank(username);

        final var usernameHasNoMinimumLength = username.length() > MINIMUM_LENGTH;

        if (usernameHasNoMinimumLength) {
            throw new DomainException(format("%s username must be at least %d characters", username, MINIMUM_LENGTH));
        }
    }

    private static void validateEmail(String email) {
        validateIsNotBlank(email);

        // todo: fazer uma validação de formato
        final var isValidFormat = true;

        if (!isValidFormat) {
            throw new DomainException(format("%s is malformed", email));
        }
    }

    // todo: poder receber mais de um parametro
    private static void validateIsNotBlank(String value) {
        final var valueIsBlank = StringUtils.isBlank(value);

        if (valueIsBlank) {
            throw new DomainException(format("%s cannot be empty", value));
        }
    }
}
