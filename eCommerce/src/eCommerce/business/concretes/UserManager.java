package eCommerce.business.concretes;

import java.util.ArrayList;

import eCommerce.business.abstracts.EmailService;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.abstracts.GoogleService;
import eCommerce.core.abstracts.LogService;
import eCommerce.dataAccess.abstracts.CustomerDao;

import eCommerce.entities.concretes.User;

public class UserManager implements UserService {

	EmailService service;
	CustomerDao dao;
	ArrayList<String> emails = new ArrayList<String>();
	LogService log;
	GoogleService google;

	public UserManager(EmailService service, CustomerDao dao, LogService log) {
		super();
		this.service = service;
		this.dao = dao;
		this.log = log;

	}

	public UserManager(EmailService service, CustomerDao dao, LogService log, GoogleService google) {
		super();
		this.service = service;
		this.dao = dao;
		this.log = log;
		this.google = google;
	}

	@Override
	public void login(String email, String password) {

		if (email.isEmpty() || password.isEmpty()) {
			this.log.unSuccessLogIn();
		} else {
			this.log.successLogIn();
		}

	}

	@Override
	public void logout(String email, String password) {

		if (email.isEmpty() || password.isEmpty()) {
			this.log.unSuccessLogOut();
		} else {
			this.log.successLogOut();
		}

	}

	@Override
	public void add(User customer) {

		if (customer.getFirstName().isEmpty() || customer.getFirstName().isEmpty()

				|| customer.getPassword().isEmpty() || customer.geteMail().isBlank()) {
			System.out.println("Ad ,soyad, email, þifre alanlarýndan herhangi biri boþ geçilemez");

		} else

		if (customer.getPassword().length() >= 6 && customer.getFirstName().length() >= 2
				&& customer.getLastName().length() >= 2) {

			if (emails.indexOf(customer.geteMail()) != -1) {
				System.out.println("Sayýn : " + customer.getFirstName() + " " + customer.getLastName()
						+ ". Bu E posta zaten sistemde kayýtlý ");
			} else {
				if (service.isValidEmail(customer.geteMail())) {
					this.log.validEmail();
					this.dao.save(customer);
					emails.add(customer.geteMail());
					if (this.google != null) {
						google.logToSystem("Üye olundu .");
					} else
						this.log.sucessLog();
					System.out.println("Dogrulama linkine týklayýnýz.");
					this.log.warning();
				} else {
					this.log.inValidEmail();
				}
			}
		} else {
			System.out.println(
					"Sayýn kullanýcý , þifreniz en az 6 ya da " + " isim ve soyisminiz en az 2 karakterden oluþmalý .");
			this.log.unsucessLog();
		}
	}

	@Override
	public void delete(User customer) {
		this.dao.delete(customer);

	}

	@Override
	public void update(User customer) {

		this.dao.update(customer);
	}

	@Override
	public boolean vertificationLink(User customer, boolean link) {
		if (service.isValidEmail(customer.geteMail())) {

				if (link) {
					this.log.sucessLink();

					return link;
				} else {
					this.log.unsucessLink();
				}
			} 
		
		return link;
	}
}
