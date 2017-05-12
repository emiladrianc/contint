package persistance.model;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import persistance.model.Country;

public class CountryTest {

	private Country _country;
	private Long _id = 1L;
	private UUID _externalId = UUID.randomUUID(); 
	private String _code = "US";
	private String _name = "English";
		
	public CountryTest()
	{
		_country = new Country();
	}
	
	@Test
	public void TestSetAndGetId()
	{
		_country.setId(_id);
		Assert.assertTrue(_id.equals(_country.getId()));
	}
	
	@Test
	public void TestSetAndGetExternalId()
	{
		_country.setExternalId(_externalId);
		Assert.assertTrue(_externalId.equals(_country.getExternalId()));
	}
	
	@Test
	public void TestSetAndGetName()
	{
		_country.setName(_name);
		Assert.assertTrue(_name.equals(_country.getName()));
	}
	
	@Test
	public void TestSetAndGetCode()
	{
		_country.setCode(_code);
		Assert.assertTrue(_code.equals(_country.getCode()));
	}		  
	
}
