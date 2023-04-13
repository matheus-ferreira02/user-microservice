package com.user.microservice.core.gateway;

import com.user.microservice.core.domain.User;

public interface UserGateway {
    User save(User user);
}
