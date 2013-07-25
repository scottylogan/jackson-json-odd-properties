/**
 * Test creating JSON from Java objects with name mapping
 */
package edu.stanford.itlab;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author swl
 *
 */
public class SerializeTest {
	
	private static final String NAME = "test:group";
	private static final String ORGID = "CXXY";
	private static final String GROUP =
		"{"
		+ "\"schemas\":[\"urn:mace:schemata:group\",\"urn:lsju:schemata:group\"],"
		+ "\"name\":\"" + NAME + "\",\"displayName\":\"Test Group\","
		+ "\"urn:lsju:schemata:group\":{\"orgId\":\"" + ORGID + "\",\"publicKeys\":null,\"isNestable\":false}"
		+ "}";
	

	@Test
	public void test() throws JsonProcessingException {
		StanfordGroup lsjuGroup = new StanfordGroup();
		lsjuGroup.setNestable(false);
		lsjuGroup.setOrgId(ORGID);
		Group group = new Group();
		group.setName(NAME);
		group.setDisplayName("Test Group");
		group.setSchemas(new String[] { "urn:mace:schemata:group", "urn:lsju:schemata:group" });
		group.setLsjuGroup(lsjuGroup);
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(group);
		assertEquals(GROUP, json);
	}

}
