import java.io.IOException;
import java.nio.file.Paths;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import persistance.CountryRepository;
import persistance.CountryRepositoryImpl;
import persistance.LanguageRepository;
import persistance.LanguageRepositoryImpl;
import persistance.model.Country;
import persistance.model.Language;

public class Main {

	public static void main(String[] args) {

		// Generate scripts for database
		Persistence.generateSchema("continuousPersistance", null);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("continuousPersistance");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		CountryRepository countryRepository = new CountryRepositoryImpl(entityManager);
		Country country = countryRepository.createCountry(1L, UUID.randomUUID().toString(), "United states", "US");

		LanguageRepository languageRepository = new LanguageRepositoryImpl(entityManager);
		Language englishLanguage = languageRepository.createLanguage(1L, UUID.randomUUID().toString(), "English", "En", "english");
		Language romanianLanguage = languageRepository.createLanguage(2L, UUID.randomUUID().toString(), "Romanian", "ro", "romana");

		/*		TextRepositoryImpl textRepository = new TextRepositoryImpl(entityManager);
		Text text = textRepository.createText(25L,  "name", "name");
		
		TranslatedTextRepositoryImpl translatedTextRepositoryImpl = new TranslatedTextRepositoryImpl(entityManager);
		translatedTextRepositoryImpl.createTranslatedText(2345L, englishLanguage, text, "Name");
		translatedTextRepositoryImpl.createTranslatedText(2346L, romanianLanguage, text, "Nume");*/
		
				
		
		

		/*
		 * 
		 * CustomerRepository customerRepository = new CustomerRepositoryImpl();
		 * 
		 * Customer customer = customerRepository.createCustomer(1L, "First",
		 * "last"); System.out.println("Customer persisted: " + customer);
		 * 
		 * customer = customerRepository.findCustomer(1L);
		 * System.out.println("Customer found: " + customer);
		 */

	}

}
