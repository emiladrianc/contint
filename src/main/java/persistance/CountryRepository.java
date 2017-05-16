package persistance;

import persistance.model.Country;

public interface CountryRepository {

	Country createCountry(Long id, String externalId, String name, String code);

	Country createCountry(Country country);

	Country findCountry(Long id);
	
	Country findCountry(String code);
	
	void removeCountry(Long id);
	
	void removeCountry(Country country);
	
	void changeName(Long id, String name);
	
	void changeName(Country country, String name);
}
