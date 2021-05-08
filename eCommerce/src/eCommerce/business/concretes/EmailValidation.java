package eCommerce.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.EmailService;

public class EmailValidation implements EmailService {

	

	private static final String PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	@Override
	public boolean isValidEmail(String eMail) {
		Pattern pattern = Pattern.compile(PATTERN);
		  Matcher matcher = pattern.matcher(eMail);
		  if(matcher.matches()){
			  
			  return true;
		  }else{
			
			  return false;
		  }		 
		
	}

	
}

