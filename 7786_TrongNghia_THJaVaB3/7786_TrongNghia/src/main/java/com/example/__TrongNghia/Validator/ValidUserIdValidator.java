package com.example.__TrongNghia.Validator;

import com.example.__TrongNghia.Validator.annotation.ValidUserId;
import com.example.__TrongNghia.entity.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        if (user == null)
            return true;
        return user.getId() != null;
    }
}
