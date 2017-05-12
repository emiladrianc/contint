package persistance.model;

import java.util.UUID;

public class Language {
	
	private final UUID _externalId;
	private final String _code;
	private String _name;
	private String _nativeName; 
		
	public Language(String code)
	{
		_code = code;
		_externalId = UUID.randomUUID();
	}
	
	public UUID getExternalId()
	{
		return _externalId;
	}

	public String getCode() {
		return _code;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}
	
	public String getNativeName() {
		return _nativeName;
	}

	public void setNativeName(String nativeName) {
		this._nativeName = nativeName;
	}
}
