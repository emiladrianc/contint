package persistance.listeners;

import java.util.UUID;

import javax.persistence.PrePersist;

import persistance.model.Country;

public class CountryListener {
	
	@PrePersist
	public void countryPrePersist(Country country) {
		country.setExternalId(UUID.randomUUID().toString());
	}
}
