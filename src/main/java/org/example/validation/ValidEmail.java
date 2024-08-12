package org.example.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {})
@NotBlank
@Email(message = "EMAIL_FORMAT_IS_NOT_VALID", regexp = "^(.+)@(.+)$")
@UniqueEmail
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEmail {

    String message() default "INVALID_EMAIL_EXCEPTION";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}