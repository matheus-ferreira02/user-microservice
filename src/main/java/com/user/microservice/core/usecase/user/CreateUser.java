package com.user.microservice.core.usecase.user;

import com.user.microservice.core.gateway.UserGateway;
import com.user.microservice.core.usecase.user.request.CreateUserRequest;
import com.user.microservice.core.usecase.user.response.CreateUserResponse;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class CreateUser {

    private final UserGateway userGateway;

    public CreateUserResponse execute(final CreateUserRequest userRequest) {
        return null;
    }
}
