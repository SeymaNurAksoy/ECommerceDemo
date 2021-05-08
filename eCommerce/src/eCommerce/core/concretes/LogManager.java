package eCommerce.core.concretes;

import eCommerce.core.abstracts.LogService;


public class LogManager  implements LogService{
	
	@Override
	public boolean sucessLog() {
		System.out.println("Üyelik oluþturuldu");
		return true;
	}

	@Override
	public boolean unsucessLog() {
		System.out.println("Üyelik oluþturulamadý...");
		return false;
	}

	@Override
	public boolean unsucessLink() {
		System.out.println("Linke týklanmadý...");
		return true;
	
	}

	@Override
	public boolean sucessLink() {
		System.out.println("Linke týklandý...");
		return true;
	}

	@Override
	public void warning() {
		System.out.println("Linke týklanmassa üyelik iþlemleri kayýt edilemez...");
		
		
	}

	@Override
	public void validEmail() {
		System.out.println("Email geçerli");
		
	}

	@Override
	public void inValidEmail() {
		System.out.println("Email geçersiz");
		
	}

	@Override
	public void successLogIn() {
		System.out.println("Giriþ Baþarýlý...");
		
	}

	@Override
	public void unSuccessLogIn() {
		System.out.println("Giriþ Baþarýsýz...");
		
	}
	@Override
	public void successLogOut() {
		System.out.println("Çýkýþ Baþarýlý...");
		
	}

	@Override
	public void unSuccessLogOut() {
		System.out.println("Çýkýþ Baþarýsýz...");
		
	}

	

}
