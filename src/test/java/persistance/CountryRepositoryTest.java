package persistance;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import persistance.model.Country;

public class CountryRepositoryTest {

	private Long _id = 11L;
	private String _name = "Country";
	private String _code = "Code";
	private String _externalId = UUID.randomUUID().toString();

	@Test(expected = IllegalArgumentException.class)
	public void TestConstructorNullFactory() {
		new CountryRepositoryImpl(null);
	}

	@Test
	public void TestConstructorNotNullFactory() {

		EntityManager mockEntityManager = Mockito.mock(EntityManager.class);

		CountryRepositoryImpl repo = new CountryRepositoryImpl(mockEntityManager);
		Assert.assertNotNull(repo);
	}

	@Test
	public void TestAddCountry() {
		EntityManager mockEntityManager = Mockito.mock(EntityManager.class);
		EntityTransaction mockEntityTransaction = Mockito.mock(EntityTransaction.class);
		
		Mockito.when(mockEntityManager.getTransaction()).thenReturn(mockEntityTransaction);
		
		CountryRepositoryImpl repo = new CountryRepositoryImpl(mockEntityManager);

		Country country = repo.createCountry(_id, _externalId, _name, _code);

		Assert.assertTrue(country.getId() == _id);
		Assert.assertTrue(country.getExternalId().equals(_externalId));
		Assert.assertTrue(country.getName().equals(_name));
		Assert.assertTrue(country.getCode().equals(_code));

	}

}
