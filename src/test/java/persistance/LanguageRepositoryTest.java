package persistance;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import persistance.model.Language;

public class LanguageRepositoryTest {
	
	private Long id = 11L;
	private String name = "Language";
	private String code = "Code";
	private String nativeName = "LanguageNativeName";
	private String externalId = UUID.randomUUID().toString();

	@Test(expected = IllegalArgumentException.class)
	public void TestConstructorNullFactory() {
		new LanguageRepositoryImpl(null);
	}

	@Test()
	public void TestConstructorNotNullFactory() {

		EntityManager mockEntityManager = Mockito.mock(EntityManager.class);

		LanguageRepositoryImpl repo = new LanguageRepositoryImpl(mockEntityManager);
		Assert.assertNotNull(repo);
	}

	@Test
	public void TestAddCountry() {
		EntityManager mockEntityManager = Mockito.mock(EntityManager.class);
		EntityTransaction mockEntityTransaction = Mockito.mock(EntityTransaction.class);
		
		Mockito.when(mockEntityManager.getTransaction()).thenReturn(mockEntityTransaction);
		
		LanguageRepositoryImpl repo = new LanguageRepositoryImpl(mockEntityManager);

		Language languge = repo.createLanguage(id, externalId, name, code, nativeName);

		Assert.assertTrue(languge.getId() == id);
		Assert.assertTrue(languge.getExternalId().equals(externalId));
		Assert.assertTrue(languge.getName().equals(name));
		Assert.assertTrue(languge.getCode().equals(code));
		Assert.assertTrue(languge.getNativeName().equals(nativeName));

	}
}
