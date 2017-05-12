package persistance;

import persistance.model.Customer;

public interface CustomerRepository {

	Customer createCustomer(Long id, String firstName, String lastName);

	Customer createCustomer(Customer customer);

	Customer findCustomer(Long id);
	
	void removeCustomer(Long id);
	
	void removeCustomer(Customer customer);
	
	void changeName(Long id, String firstName, String lastName);
	
	void changeName(Customer customer, String firstName, String lastName);
}
