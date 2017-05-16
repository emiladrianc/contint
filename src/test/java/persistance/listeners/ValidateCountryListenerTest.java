package persistance.listeners;

import org.junit.Test;

import persistance.model.Country;

public class ValidateCountryListenerTest {

	private Country _country = new Country();

	@Test(expected = IllegalArgumentException.class)
	public void TestNameIsNull() {
		_country.setName(null);

		new ValidateCountryListener().validate(_country);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestNameIsEmpty() {
		_country.setName("");

		new ValidateCountryListener().validate(_country);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestCodeIsNull() {
		_country.setName("Country");
		_country.setCode(null);

		new ValidateCountryListener().validate(_country);
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestCodeIsEmpty() {
		_country.setName("Country");
		_country.setCode("");

		new ValidateCountryListener().validate(_country);
	}

}
