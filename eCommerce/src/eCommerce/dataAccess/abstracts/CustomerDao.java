package eCommerce.dataAccess.abstracts;


import eCommerce.entities.concretes.User;

public interface CustomerDao {
	
	void save(User customer);
	
	void delete(User customer);
	
	void update(User customer);
	



}
