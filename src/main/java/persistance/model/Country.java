package persistance.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long _id;
	
	@GeneratedValue
	@Column(columnDefinition="uuid", updatable = false)
	private UUID _externalId;
	
	@Column(nullable = false, length = 50)
	private String _code;
	
	@Column(length = 50)
	private String _name;

	public long getId() {
		return _id;
	}

	public void setId(long _id) {
		this._id = _id;
	}

	public UUID getExternalId() {
		return _externalId;
	}

	public void setExternalId(UUID _externalId) {
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
		
}
