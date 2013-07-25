/**
 * Test converting JSON to Java objects, with name mapping
 */
package edu.stanford.itlab;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author swl
 *
 */
public class DeserializeTest {
	
	private static final String NAME = "test:group";
	private static final String ORGID = "CXXY";
	private static final String GROUP =
		"{"
		+ "\"schemas\":[\"urn:mace:schemata:group\",\"urn:lsju:schemata:group\"],"
		+ "\"name\":\"" + NAME + "\",\"displayName\":\"Test Group\","
		+ "\"urn:lsju:schemata:group\":{\"orgId\":\"" + ORGID + "\",\"publicKeys\":null,\"isNestable\":false}"
		+ "}";


	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		StanfordGroup group = mapper.readValue(GROUP, StanfordGroup.class);

		assertEquals(NAME, group.getName());
		assertEquals(ORGID, group.getStanfordGroupData().getOrgId());
	}
}
