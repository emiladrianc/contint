package persistance.listeners;

import org.junit.Test;

import persistance.model.Country;

public class ValidateCountryListenerTest {

	private Country country = new Country();

	@Test(expected = IllegalArgumentException.class)
	public void TestNameIsNull() {
		country.setName(null);

		new ValidateCountryListener().validate(country);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestNameIsEmpty() {
		country.setName("");

		new ValidateCountryListener().validate(country);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestCodeIsNull() {
		country.setName("Country");
		country.setCode(null);

		new ValidateCountryListener().validate(country);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestCodeIsEmpty() {
		country.setName("Country");
		country.setCode("");

		new ValidateCountryListener().validate(country);
	}

	@Test
	public void Test() {
		country.setName("Country");
		country.setCode("Code");

		new ValidateCountryListener().validate(country);
	}

}
