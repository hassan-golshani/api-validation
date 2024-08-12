package org.example.model;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.example.validation.ValidAge;
import org.example.validation.ValidEmail;

@Data
public final class CreateUserRequest {
    private @NotBlank String name;
    private @NotBlank String surname;
    private @ValidEmail String email;
    private @ValidAge Integer age;
}