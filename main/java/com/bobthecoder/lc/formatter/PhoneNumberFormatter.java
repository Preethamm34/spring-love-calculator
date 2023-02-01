package com.bobthecoder.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.bobthecoder.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		System.out.println("inside the print method of the phoneNumberFormatter");

		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		System.out.println("inside parse method of the phoneNumberFormatter");

		Phone phone = new Phone();
		String[] phoneNumberArray = completePhoneNumber.split("-");

		// wether the number consist of -

		int index = completePhoneNumber.indexOf('-');
		if (index == -1) {

			// if the "-" is nott found then add 91 as the default code
			phone.setCountryCode("91");
			phone.setUserNumber(phoneNumberArray[0]);

		}

		else {

			phone.setCountryCode(phoneNumberArray[0]);
			phone.setUserNumber(phoneNumberArray[1]);

		}
		return phone;
	}

}
