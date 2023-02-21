package com.bolsadeideas.springboot.form.app.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IdentificadorRegexValidator implements ConstraintValidator<IdentificadorRegex, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if(!value.matches("[0-9]{2}[.][0-9]{3}[.][0-9]{3}[-][A-Z]{1}"))
			return false;
		return true;
	}

}
