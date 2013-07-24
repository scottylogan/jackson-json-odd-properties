/**
 * 
 */
package edu.stanford.itlab;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author swl
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Group {
	private String[] schemas;
	private String name;
	private String displayName;
	
	@JsonProperty("urn:lsju:schemata:group")
	private StanfordGroup lsjuGroup;

	/**
	 * @return the schemas
	 */
	public String[] getSchemas() {
		return schemas;
	}
	/**
	 * @param schemas the schemas to set
	 */
	public void setSchemas(String[] schemas) {
		this.schemas = schemas;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}
	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	/**
	 * @return the lsjuGroup
	 */
	public StanfordGroup getLsjuGroup() {
		return lsjuGroup;
	}
	/**
	 * @param lsjuGroup the lsjuGroup to set
	 */
	public void setLsjuGroup(StanfordGroup ljsuGroup) {
		this.lsjuGroup = ljsuGroup;
	}
}
