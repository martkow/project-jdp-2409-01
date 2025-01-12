package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.controller.exception.InvalidCredentialsException;
import com.kodilla.ecommercee.domain.UserDto;
import com.kodilla.ecommercee.generator.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/users")
@Tag(name = "Authentication", description = "Managing user authentication and token generation")
public class AuthController {
    private final AuthService authService;

    @Operation(
            summary = "Authenticate user and generate token",
            description = "Authenticates the user using their username and password. If the credentials are valid, it returns a token for future requests."
    )
    @PostMapping("/key")
    public ResponseEntity<?> login(@RequestBody UserDto userDto) throws InvalidCredentialsException {
            String token = authService.authenticate(userDto.getUsername(), userDto.getPassword());
            return ResponseEntity.ok(token);
    }
}

