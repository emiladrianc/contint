package persistance.model;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import persistance.model.Country;

public class CountryTest {

	private Country country;
	private Long id = 1L;
	private String externalId = UUID.randomUUID().toString(); 
	private String code = "US";
	private String name = "English";
	private boolean isObsolete = true;
		
	public CountryTest()
	{
		country = new Country();
	}
	
	@Test
	public void TestSetAndGetId()
	{
		country.setId(id);
		Assert.assertTrue(id.equals(country.getId()));
	}
	
	@Test
	public void TestSetAndGetExternalId()
	{
		country.setExternalId(externalId);
		Assert.assertTrue(externalId.equals(country.getExternalId()));
	}
	
	@Test
	public void TestSetAndGetName()
	{
		country.setName(name);
		Assert.assertTrue(name.equals(country.getName()));
	}
	
	@Test
	public void TestSetAndGetCode()
	{
		country.setCode(code);
		Assert.assertTrue(code.equals(country.getCode()));
	}
	
	@Test
	public void TestSetAndGetIsObsolete()
	{
		country.setIsObsolete(isObsolete);
		Assert.assertTrue(isObsolete == country.getIsObsolete());
	}	

	@Test
	public void TestSetExternalId()
	{
		Country country = new Country();
		
		country.setExternalId();
				
		Assert.assertNotNull(country.getExternalId());
		Assert.assertFalse(country.getExternalId().equals(""));
		
	}		  

}
