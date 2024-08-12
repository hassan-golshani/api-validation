package org.example.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.lang.annotation.*;

@Constraint(validatedBy = {})
@NotNull
@Min(18)
@Max(65)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidAge {

    String message() default "INVALID_AGE_EXCEPTION";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}