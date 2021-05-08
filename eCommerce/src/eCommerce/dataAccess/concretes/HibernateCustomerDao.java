package eCommerce.dataAccess.concretes;

import eCommerce.dataAccess.abstracts.CustomerDao;

import eCommerce.entities.concretes.User;

public class HibernateCustomerDao  implements CustomerDao{

	@Override
	public void save(User customer) {
		
		System.out.println("Sisteme kayýt oldunuz .");
		
	}

	@Override
	public void delete(User customer) {

		System.out.println("Sistemden silindiniz .");
		
	}

	@Override
	public void update(User customer) {

		System.out.println("Sistem bilgileriniz güncellendi.");
		
	}

}
