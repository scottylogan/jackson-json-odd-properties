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
public class StanfordGroup extends Group {

	@JsonProperty("urn:lsju:schemata:group")
	private StanfordGroupData stanfordGroupData;

	/**
	 * @return the stanfordGroupData
	 */
	public StanfordGroupData getStanfordGroupData() {
		return stanfordGroupData;
	}

	/**
	 * @param stanfordGroupData the stanfordGroupData to set
	 */
	public void setStanfordGroupData(StanfordGroupData stanfordGroupData) {
		this.stanfordGroupData = stanfordGroupData;
	}

}
