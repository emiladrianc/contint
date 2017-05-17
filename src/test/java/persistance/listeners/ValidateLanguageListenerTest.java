package persistance.listeners;

import org.junit.Test;

import persistance.model.Language;

public class ValidateLanguageListenerTest {
	private Language language = new Language();

	@Test(expected = IllegalArgumentException.class)
	public void TestNameIsNull() {
		language.setName(null);

		new ValidateLanguageListener().validate(language);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestNameIsEmpty() {
		language.setName("");

		new ValidateLanguageListener().validate(language);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestCodeIsNull() {
		language.setName("Language");
		language.setCode(null);

		new ValidateLanguageListener().validate(language);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestCodeIsEmpty() {
		language.setName("Language");
		language.setCode("");

		new ValidateLanguageListener().validate(language);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestNativeNameIsNull() {

		language.setName("Language");
		language.setCode("Code");

		language.setNativeName(null);

		new ValidateLanguageListener().validate(language);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestNativeNameIsEmpty() {
		language.setName("Language");
		language.setCode("Code");
		language.setNativeName("");

		new ValidateLanguageListener().validate(language);
	}
	
	@Test
	public void Test() {
		language.setName("Language");
		language.setCode("Code");
		language.setNativeName("NativeName");

		new ValidateLanguageListener().validate(language);
	}
}
