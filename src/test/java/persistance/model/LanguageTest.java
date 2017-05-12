package persistance.model;

import org.junit.Assert;
import org.junit.Test;

public class LanguageTest {
	
	private Language _language;
	private String _code = "US";
	private String _name = "English";
	private String _nativeName = "EnglishNative";
		
	public LanguageTest()
	{
		_language = new Language(_code);
	}
	
	@Test
	public void TestGetExternalId()
	{
		Assert.assertNotNull(_language.getExternalId());
	}
	
	@Test
	public void TestSetAndGetName()
	{
		_language.setName(_name);
		Assert.assertTrue(_name.equals(_language.getName()));
	}
	
	@Test
	public void TestSetAndGetNativeName()
	{
		_language.setNativeName(_nativeName);
		Assert.assertTrue(_nativeName.equals(_language.getNativeName()));
	}
	
	@Test
	public void TestGetCode()
	{
		Assert.assertTrue(_code.equals(_language.getCode()));
	}
}
