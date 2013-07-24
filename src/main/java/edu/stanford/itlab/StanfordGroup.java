/**
 * 
 */
package edu.stanford.itlab;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author swl
 *
 */
public class StanfordGroup {
	@JsonProperty("isNestable")
	private boolean nestable;
	private String orgId;
	private String[] publicKeys;
	/**
	 * @return the nestable
	 */
	public boolean isNestable() {
		return nestable;
	}
	/**
	 * @param nestable the nestable to set
	 */
	public void setNestable(boolean isNestable) {
		this.nestable = isNestable;
	}
	/**
	 * @return the orgId
	 */
	public String getOrgId() {
		return orgId;
	}
	/**
	 * @param orgId the orgId to set
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	/**
	 * @return the publicKeys
	 */
	public String[] getPublicKeys() {
		return publicKeys;
	}
	/**
	 * @param publicKeys the publicKeys to set
	 */
	public void setPublicKeys(String[] publicKeys) {
		this.publicKeys = publicKeys;
	}
}
