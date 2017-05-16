package persistance.model;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

public class LanguageTest {
	
	private Language _language;
	private Long _id = 1L;
	private String _externalId = UUID.randomUUID().toString();
	private String _code = "US";
	private String _name = "English";
	private String _nativeName = "EnglishNative";
		
	public LanguageTest()
	{
		_language = new Language();
	}
	
	@Test
	public void TestSetAndGetId()
	{
		_language.setId(_id);
		Assert.assertTrue(_id.equals(_language.getId()));
	}
	
	@Test
	public void TestSetAndGetExternalId()
	{
		_language.setExternalId(_externalId);
		Assert.assertTrue(_externalId.equals(_language.getExternalId()));
	}
	
	@Test
	public void TestSetAndGetName()
	{
		_language.setName(_name);
		Assert.assertTrue(_name.equals(_language.getName()));
	}
	
	@Test
	public void TestSetAndGetCode()
	{
		_language.setCode(_code);
		Assert.assertTrue(_code.equals(_language.getCode()));
	}	
	
	@Test
	public void TestSetAndGetNativeName()
	{
		_language.setNativeName(_nativeName);
		Assert.assertTrue(_nativeName.equals(_language.getNativeName()));
	}	
	
	@Test
	public void TestSetExternalId()
	{
		Language language = new Language();
		
		language.setExternalId();
				
		Assert.assertNotNull(language.getExternalId());
		Assert.assertFalse(language.getExternalId().equals(""));
		
	}		  

}
