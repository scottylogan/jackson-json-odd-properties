/**
 * 
 */
package edu.stanford.itlab;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author swl
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GroupWithoutProperties {
	private String[] schemas;
	private String name;
	private String displayName;
	
	private StanfordGroupData urnLsjuSchemataGroup;

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
	 * @return the urnLsjuSchemataGroup
	 */
	public StanfordGroupData getUrnLsjuSchemataGroup() {
		return urnLsjuSchemataGroup;
	}
	/**
	 * @param urnLsjuSchemataGroup the urnLsjuSchemataGroup to set
	 */
	public void setUrnLsjuSchemataGroup(StanfordGroupData lsjuGroup) {
		this.urnLsjuSchemataGroup = lsjuGroup;
	}
}
