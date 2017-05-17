package persistance.model;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

public class LanguageTest {

	private Language language;
	private Long id = 1L;
	private String externalId = UUID.randomUUID().toString();
	private String code = "US";
	private String name = "English";
	private String nativeName = "EnglishNative";
	private boolean isObsolete = true;
	
	public LanguageTest() {
		language = new Language();
	}

	@Test
	public void TestSetAndGetId() {
		language.setId(id);
		Assert.assertTrue(id.equals(language.getId()));
	}

	@Test
	public void TestSetAndGetExternalId() {
		language.setExternalId(externalId);
		Assert.assertTrue(externalId.equals(language.getExternalId()));
	}

	@Test
	public void TestSetAndGetName() {
		language.setName(name);
		Assert.assertTrue(name.equals(language.getName()));
	}

	@Test
	public void TestSetAndGetCode() {
		language.setCode(code);
		Assert.assertTrue(code.equals(language.getCode()));
	}

	@Test
	public void TestSetAndGetNativeName() {
		language.setNativeName(nativeName);
		Assert.assertTrue(nativeName.equals(language.getNativeName()));
	}

	@Test
	public void TestSetAndGetIsObsolete()
	{
		language.setIsObsolete(isObsolete);
		Assert.assertTrue(isObsolete == language.getIsObsolete());
	}	
	
	@Test
	public void TestSetExternalId() {
		Language language = new Language();

		language.setExternalId();

		Assert.assertNotNull(language.getExternalId());
		Assert.assertFalse(language.getExternalId().equals(""));

	}

}
