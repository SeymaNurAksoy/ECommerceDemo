package eCommerce.core.concretes;

import eCommerce.core.abstracts.LogService;


public class LogManager  implements LogService{
	
	@Override
	public boolean sucessLog() {
		System.out.println("�yelik olu�turuldu");
		return true;
	}

	@Override
	public boolean unsucessLog() {
		System.out.println("�yelik olu�turulamad�...");
		return false;
	}

	@Override
	public boolean unsucessLink() {
		System.out.println("Linke t�klanmad�...");
		return true;
	
	}

	@Override
	public boolean sucessLink() {
		System.out.println("Linke t�kland�...");
		return true;
	}

	@Override
	public void warning() {
		System.out.println("Linke t�klanmassa �yelik i�lemleri kay�t edilemez...");
		
		
	}

	@Override
	public void validEmail() {
		System.out.println("Email ge�erli");
		
	}

	@Override
	public void inValidEmail() {
		System.out.println("Email ge�ersiz");
		
	}

	@Override
	public void successLogIn() {
		System.out.println("Giri� Ba�ar�l�...");
		
	}

	@Override
	public void unSuccessLogIn() {
		System.out.println("Giri� Ba�ar�s�z...");
		
	}
	@Override
	public void successLogOut() {
		System.out.println("��k�� Ba�ar�l�...");
		
	}

	@Override
	public void unSuccessLogOut() {
		System.out.println("��k�� Ba�ar�s�z...");
		
	}

	

}
