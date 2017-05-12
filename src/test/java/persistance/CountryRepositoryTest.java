package persistance;

import javax.persistence.EntityManager;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class CountryRepositoryTest {
	
	@Test(expected=IllegalArgumentException.class)	
	public void TestConstructorNullFactory()
	{
		new CountryRepositoryImpl(null);		
	}
	
	@Test()	
	public void TestConstructorNotNullFactory()
	{			

		EntityManager mockEntityManager = Mockito.mock(EntityManager.class);
				
		CountryRepositoryImpl repo =  new CountryRepositoryImpl(mockEntityManager);
		Assert.assertNotNull(repo);		
	}
	
	@Test
	public void TestGetExternalId()
	{
		//Assert.assertNotNull(_country.getExternalId());
	}
	
}
