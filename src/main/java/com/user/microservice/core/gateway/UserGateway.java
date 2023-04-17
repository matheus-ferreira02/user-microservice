package com.user.microservice.core.gateway;

import com.user.microservice.core.domain.User;

import java.util.Optional;

public interface UserGateway {
    User save(User user);

    Optional<User> findByUsername(String username);
}
