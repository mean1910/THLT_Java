package com.example.__TrongNghia.Validator;

import com.example.__TrongNghia.Validator.annotation.ValidCategoryId;
import com.example.__TrongNghia.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId() != null;
    }
}
