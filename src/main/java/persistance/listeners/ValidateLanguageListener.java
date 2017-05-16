package persistance.listeners;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import persistance.model.Language;

public class ValidateLanguageListener {
	
	@PrePersist
	@PreUpdate
	public void validate(Language language) {

		if (language.getName() == null || "".equals(language.getName()))
			throw new IllegalArgumentException("Invalid name");

		if (language.getCode() == null || "".equals(language.getCode()))
			throw new IllegalArgumentException("Invalid code");
		
		if (language.getNativeName() == null || "".equals(language.getNativeName()))
			throw new IllegalArgumentException("Invalid native name");
		
	}
}
