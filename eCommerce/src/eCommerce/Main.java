package eCommerce;

import eCommerce.business.concretes.EmailValidation;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.concretes.GoogleAdapter;
import eCommerce.core.concretes.LogManager;
import eCommerce.dataAccess.concretes.HibernateCustomerDao;
import eCommerce.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
	
		User user = new User(1,"seyma ","aksoy","aksoyseyma1927@gmail.com","1234567");
		User user2 = new User(1,"seyma ","aksoy","aksoyseyma192","1234567");
		User user3 = new User(1,"seyma ","aksoy","aksoyseyma1927@gmail.com","1234567");
		User user4 = new User(1,"s","aksoy","aksoyseyma1@gmail.com","1234567");
		User user5 = new User(1,"seyma","aksoy","aksoyseyma","1234567");
		UserManager userManager2 = new UserManager(new EmailValidation(), new HibernateCustomerDao(), new LogManager(),new GoogleAdapter());
		UserManager userManager = new UserManager(new EmailValidation(), new HibernateCustomerDao(), new LogManager());

		userManager.add(user);
		userManager.vertificationLink(user, true);
		userManager.login(user.geteMail(),user.getPassword());
		
		System.out.println("Google ile giriþ-----------------");
		userManager2.add(user);
		
		System.out.println("User 3----------------------------");
		userManager.add(user3);
		
		System.out.println("User 4----------------------------");

		userManager.add(user4);
		
		System.out.println("User 5----------------------------");

		userManager.add(user5);



		
	}

}
