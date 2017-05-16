package persistance.listeners;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import persistance.model.Country;

public class ValidateCountryListener {

	@PrePersist
	@PreUpdate
	public void validate(Country country) {

		if (country.getName() == null || "".equals(country.getName()))
			throw new IllegalArgumentException("Invalid name");

		if (country.getCode() == null || "".equals(country.getCode()))
			throw new IllegalArgumentException("Invalid code");

	}
}
