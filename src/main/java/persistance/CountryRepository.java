package persistance;

import persistance.model.Country;

public interface CountryRepository {

	Country createCountry(String name);

	Country createCountry(Country country);

	Country findCountry(Long id);
	
	void removeCountry(Long id);
	
	void removeCountry(Country country);
	
	void changeName(Long id, String name);
	
	void changeName(Country country, String name);
}
