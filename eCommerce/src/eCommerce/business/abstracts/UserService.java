package eCommerce.business.abstracts;


import eCommerce.entities.concretes.User;

public interface UserService {

	void login(String email,String password);
	
	void logout(String email,String password);
	
	void add(User customer);
	
	void delete (User customer);
	
	void update (User customer);
	
	boolean vertificationLink(User customer ,boolean link);
	
}
