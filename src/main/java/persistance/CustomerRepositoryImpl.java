package persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import persistance.model.Customer;
import persistance.model.CustomerImpl;

public class CustomerRepositoryImpl implements CustomerRepository {

	private EntityManagerFactory _entityManagerFactory;
	private EntityManager _entityManager;
	private EntityTransaction _entityTransaction;

	public CustomerRepositoryImpl() {
		_entityManagerFactory = Persistence.createEntityManagerFactory("customerPersistance");
		_entityManager = _entityManagerFactory.createEntityManager();
		_entityTransaction = _entityManager.getTransaction();
	}

	public Customer createCustomer(Long id, String firstName, String lastName) {
		Customer customer = new CustomerImpl();
		customer.setId(id);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);

		_entityTransaction.begin();

		_entityManager.persist(customer);

		_entityTransaction.commit();

		return customer;
	}

	public Customer createCustomer(Customer customer) {
		_entityTransaction.begin();

		_entityManager.persist(customer);

		_entityTransaction.commit();

		return customer;
	}

	public Customer findCustomer(Long id) {
		return _entityManager.find(Customer.class, id);
	}

	public void removeCustomer(Long id) {
		Customer customer = _entityManager.find(Customer.class, id);
		if (customer != null) {
			_entityTransaction.begin();
			_entityManager.remove(customer);
			_entityTransaction.commit();
		}
	}

	public void removeCustomer(Customer customer) {
		Customer customerToBeDeleted = _entityManager.merge(customer);
		_entityManager.remove(customerToBeDeleted);
	}

	public void changeName(Long id, String firstName, String lastName) {
		Customer customer = _entityManager.find(Customer.class, id);
		if (customer != null) {
			_entityTransaction.begin();

			customer.setFirstName(firstName);
			customer.setLastName(lastName);

			_entityTransaction.commit();
		}
	}

	public void changeName(Customer customer, String firstName, String lastName) {
		Customer customertobeUpdated = _entityManager.merge(customer);
		_entityTransaction.begin();

		customertobeUpdated.setFirstName(firstName);
		customertobeUpdated.setLastName(lastName);

		_entityTransaction.commit();
	}
}
