package com.bobthecoder.lc.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int lower; //18
	private int upper; //75
	
	@Override
	public void initialize(Age age) {
		//t can write the post construct work here
		this.lower = age.lower();
		this.upper = age.upper();
		
	}
	
	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		// i need to write the logic here
		if(age == null) {
			return false; //if the age is null
		}
		
		
		if(age < lower || age > upper) {
			return false; //fail
		}
		
		return true; // pass
	}

}
