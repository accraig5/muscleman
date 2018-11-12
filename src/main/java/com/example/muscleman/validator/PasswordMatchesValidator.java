package com.example.muscleman.validator;

import com.example.muscleman.dto.UserDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object object, ConstraintValidatorContext context) {
        UserDto user = (UserDto) object;
        return user.getPassword().equals(user.getMatchingPassword());
    }
}
