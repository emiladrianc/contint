package persistance.listeners;

import java.util.UUID;

import javax.persistence.PrePersist;

import persistance.model.Language;

public class LanguageConverter {
	
	@PrePersist
	public void countryPrePersist(Language language) {
		language.setExternalId(UUID.randomUUID().toString());
	}
}
