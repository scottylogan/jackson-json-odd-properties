/**
 * Test converting JSON to Java objects, with name mapping and unknown parameters
 */
package edu.stanford.itlab;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author swl
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)

public class DeserializeWithJunkTest {
	
	private static final String NAME = "test:group";
	private static final String ORGID = "CXXY";
	private static final String GROUP =
		"{"
		+ "\"schemas\":[\"urn:mace:schemata:group\",\"urn:lsju:schemata:group\"],"
		+ "\"name\":\"" + NAME + "\",\"displayName\":\"Test Group\","
		+ "\"urn:lsju:schemata:group\":{\"orgId\":\"" + ORGID + "\",\"publicKeys\":null,\"isNestable\":false}"
		+ ",\"urn:itlab:schemata:group\":{\"wibble\":\"wobble\"}"
		+ "}";


	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		Group group = mapper.readValue(GROUP, Group.class);

		assertEquals(NAME, group.getName());
		assertEquals(ORGID, group.getLsjuGroup().getOrgId());
	}
}
