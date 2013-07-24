/**
 * 
 */
package edu.stanford.itlab;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author swl
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class JSONTest {

	public static final String GROUP = 
		"{"
		+ "\"schemas\": [ \"urn:mace:schemata:group\", \"urn:lsju:schemata:group\" ],"
		+ "\"name\": \"bar:foo\","
		+ "\"displayName\": \"All the patrons at Foo\","
		+ "\"urn:lsju:schemata:group\": {"
		+   "\"isNestable\": true,"
		+   "\"orgId\": \"CXXY\","
		+   "\"publicKeys\": [ \"...\", \"...\" ]"
		+ "}"
		+ "}";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		Group group = null;
		try {
			group = mapper.readValue(GROUP, Group.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Name: " + group.getName());
		System.out.println("Name: " + group.getLsjuGroup().getOrgId());
	}

}
