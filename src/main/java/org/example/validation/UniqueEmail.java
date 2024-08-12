package org.example.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = {UniqueEmailValidator.class})
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueEmail {

    String message() default "EMAIL_EALREADY_EXIST_EXCEPTION";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}