package eCommerce.core.concretes;

import eCommerce.core.abstracts.GoogleService;
import google.GoogleManager;

public class GoogleAdapter implements GoogleService {

	@Override
	public void logToSystem(String message) {
		
		GoogleManager googleManager = new GoogleManager();

		googleManager.add();
		
	}
}
