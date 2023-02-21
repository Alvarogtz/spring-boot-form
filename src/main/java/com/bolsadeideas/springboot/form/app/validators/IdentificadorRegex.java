package com.bolsadeideas.springboot.form.app.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = IdentificadorRegexValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface IdentificadorRegex {
	
	String message() default "Identificador inválido";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
