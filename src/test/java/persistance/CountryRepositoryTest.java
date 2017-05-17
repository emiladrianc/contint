package persistance;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import persistance.model.Country;

public class CountryRepositoryTest {

	private Long id = 11L;
	private String name = "Country";
	private String code = "Code";
	private String externalId = UUID.randomUUID().toString();

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

		Country country = repo.createCountry(id, externalId, name, code);

		Assert.assertTrue(country.getId() == id);
		Assert.assertTrue(country.getExternalId().equals(externalId));
		Assert.assertTrue(country.getName().equals(name));
		Assert.assertTrue(country.getCode().equals(code));

	}

}
