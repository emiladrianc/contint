package persistance.listeners;

import org.junit.Test;

import persistance.model.Language;

public class ValidateLanguageListenerTest {
	private Language _language = new Language();

	@Test(expected = IllegalArgumentException.class)
	public void TestNameIsNull() {
		_language.setName(null);

		new ValidateLanguageListener().validate(_language);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestNameIsEmpty() {
		_language.setName("");

		new ValidateLanguageListener().validate(_language);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestCodeIsNull() {
		_language.setName("Language");
		_language.setCode(null);

		new ValidateLanguageListener().validate(_language);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestCodeIsEmpty() {
		_language.setName("Language");
		_language.setCode("");

		new ValidateLanguageListener().validate(_language);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void TestNativeNameIsNull() {

		_language.setName("Language");
		_language.setCode("Code");

		_language.setNativeName(null);

		new ValidateLanguageListener().validate(_language);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestNativeNameIsEmpty() {
		_language.setName("Language");
		_language.setCode("Code");
		_language.setNativeName("");

		new ValidateLanguageListener().validate(_language);
	}
}
