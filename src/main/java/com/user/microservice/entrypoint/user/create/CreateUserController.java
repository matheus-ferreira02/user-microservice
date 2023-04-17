package com.user.microservice.entrypoint.user.create;

import com.user.microservice.core.domain.User;
import com.user.microservice.core.usecase.user.CreateUser;
import com.user.microservice.entrypoint.user.create.request.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class CreateUserController {

    private final CreateUser createUser;

    @PostMapping
    // todo: colocar @Valid
    ResponseEntity<User> createUser(@RequestBody UserRequest request) {
        final var userCreated = createUser.execute(request.toDomain());

        // todo: alterar para retornar created (uri))
        return ResponseEntity.ok(userCreated);
    }
}
