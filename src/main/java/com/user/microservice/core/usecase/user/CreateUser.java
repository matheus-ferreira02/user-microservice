package com.user.microservice.core.usecase.user;

import com.user.microservice.core.domain.User;
import com.user.microservice.core.gateway.UserGateway;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateUser {

    private final UserGateway userGateway;

    public User execute(final User user) {
        return userGateway.save(user);
    }
}
