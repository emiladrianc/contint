package persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import persistance.model.Country;

public class CountryRepositoryImpl implements CountryRepository {

	private EntityManager _entityManager;
	private EntityTransaction _entityTransaction;

	public CountryRepositoryImpl(EntityManager entityManager) {
		if (entityManager == null)
			throw new IllegalArgumentException("Parameter cannnot be null: entityManager");
		
		_entityManager = entityManager;
		_entityTransaction = _entityManager.getTransaction();
	}

	public Country createCountry(Long id, String externalId, String name, String code) {
		Country country = new Country();
		country.setId(id);
		country.setExternalId(externalId);
		country.setName(name);
		country.setCode(code);

		_entityTransaction.begin();

		_entityManager.persist(country);

		_entityTransaction.commit();

		return country;
	}

	@Override
	public Country createCountry(Country country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Country findCountry(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Country findCountry(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCountry(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCountry(Country country) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeName(Long id, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeName(Country country, String name) {
		// TODO Auto-generated method stub
		
	}
}
