package persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import persistance.model.Language;

public class LanguageRepositoryImpl implements LanguageRepository {
	
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;

	public LanguageRepositoryImpl(EntityManager entityManager) {
		if (entityManager == null)
			throw new IllegalArgumentException("Parameter cannnot be null: entityManager");

		this.entityManager = entityManager;
		this.entityTransaction = this.entityManager.getTransaction();
	}
	
	public Language createLanguage(Long id, String externalId, String name, String code, String nativeName) {
		Language language= new Language();
		language.setId(id);
		language.setExternalId(externalId);
		language.setName(name);
		language.setCode(code);
		language.setNativeName(nativeName);
				
		this.entityTransaction.begin();

		this.entityManager.persist(language);

		this.entityTransaction.commit();

		return language;
	}
}
