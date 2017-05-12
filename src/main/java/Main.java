import persistance.CustomerRepository;
import persistance.CustomerRepositoryImpl;
import persistance.model.Customer;

public class Main {

	public static void main(String[] args) {

		CustomerRepository customerRepository = new CustomerRepositoryImpl();

		Customer customer = customerRepository.createCustomer(1L, "First", "last");
		System.out.println("Customer persisted: " + customer);
		
		customer = customerRepository.findCustomer(1L);
		System.out.println("Customer found: " + customer);

	}

}
