package persistance;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import persistance.model.Language;

public class LanguageRepositoryTest {
	
	private Long _id = 11L;
	private String _name = "Language";
	private String _code = "Code";
	private String _nativeName = "LanguageNativeName";
	private String _externalId = UUID.randomUUID().toString();

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

		Language languge = repo.createLanguage(_id, _externalId, _name, _code, _nativeName);

		Assert.assertTrue(languge.getId() == _id);
		Assert.assertTrue(languge.getExternalId().equals(_externalId));
		Assert.assertTrue(languge.getName().equals(_name));
		Assert.assertTrue(languge.getCode().equals(_code));
		Assert.assertTrue(languge.getNativeName().equals(_nativeName));

	}
}
