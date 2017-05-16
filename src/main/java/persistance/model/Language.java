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
	private long _id;

	@Column(name = "ExternalId", length = 36, nullable = false, unique = true, updatable = false)
	private String _externalId;

	@Column(name = "Code", nullable = false, length = 50)
	private String _code;

	@Column(name = "Name", length = 50, nullable = false)
	private String _name;

	@Column(name = "NativeName", length = 50, nullable = false)
	private String _nativeName;

	public long getId() {
		return _id;
	}

	public void setId(long _id) {
		this._id = _id;
	}

	public String getExternalId() {
		return _externalId;
	}

	public void setExternalId(String _externalId) {
		this._externalId = _externalId;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String _code) {
		this._code = _code;
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	public String getNativeName() {
		return _nativeName;
	}

	public void setNativeName(String _nativeName) {
		this._nativeName = _nativeName;
	}
	
	@PrePersist
	public void setExternalId() {
		setExternalId(UUID.randomUUID().toString());
	}

}
