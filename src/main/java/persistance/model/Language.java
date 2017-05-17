package persistance.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import persistance.listeners.ValidateLanguageListener;

@Entity
@EntityListeners(ValidateLanguageListener.class)
@Table(name = "Language")
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private long id;

	@Column(name = "ExternalId", length = 36, nullable = false, unique = true, updatable = false)
	private String externalId;

	@Column(name = "Code", nullable = false, length = 50)
	private String code;

	@Column(name = "Name", length = 50, nullable = false)
	private String name;

	@Column(name = "NativeName", length = 50, nullable = false)
	private String nativeName;
	
	@Column(name = "IsObsolete", nullable = false)
	private boolean isObsolete;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNativeName() {
		return nativeName;
	}

	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}
	
	public boolean getIsObsolete() {
		return isObsolete;
	}

	public void setIsObsolete(boolean isObsolete) {
		this.isObsolete = isObsolete;
	}
	
	@PrePersist
	public void setExternalId() {
		setExternalId(UUID.randomUUID().toString());
	}

}
