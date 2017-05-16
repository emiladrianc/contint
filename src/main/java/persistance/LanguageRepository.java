package persistance;

import persistance.model.Language;

public interface LanguageRepository {

	Language createLanguage(Long id, String externalId, String name, String code, String nativeName);
}
