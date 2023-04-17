package com.user.microservice.core.usecase.user;

import com.user.microservice.core.domain.User;
import com.user.microservice.core.gateway.UserGateway;
import com.user.microservice.core.usecase.user.exception.AlreadyExistsException;
import lombok.RequiredArgsConstructor;

import static java.lang.String.format;

@RequiredArgsConstructor
public class CreateUser {

    private final UserGateway userGateway;

    public User execute(final User userRequest) {
        final var user = userGateway.findByUsername(userRequest.getUsername());

        // todo: alterar o nome para algo mais descritivo
        user.ifPresent(u -> {
            throw new AlreadyExistsException(format("User %s already exists", u.getUsername()));
        });

        return userGateway.save(userRequest);
    }
}
