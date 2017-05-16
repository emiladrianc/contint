package persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import persistance.model.Language;

public class LanguageRepositoryImpl implements LanguageRepository {
	
	private EntityManager _entityManager;
	private EntityTransaction _entityTransaction;

	public LanguageRepositoryImpl(EntityManager entityManager) {
		if (entityManager == null)
			throw new IllegalArgumentException("Parameter cannnot be null: entityManager");

		_entityManager = entityManager;
		_entityTransaction = _entityManager.getTransaction();
	}
	
	public Language createLanguage(Long id, String externalId, String name, String code, String nativeName) {
		Language language= new Language();
		language.setId(id);
		language.setExternalId(externalId);
		language.setName(name);
		language.setCode(code);
		language.setNativeName(nativeName);
				
		_entityTransaction.begin();

		_entityManager.persist(language);

		_entityTransaction.commit();

		return language;
	}
}
