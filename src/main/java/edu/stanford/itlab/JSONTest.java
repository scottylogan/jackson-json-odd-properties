/**
 * 
 */
package edu.stanford.itlab;

import java.io.File;
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		Group group = null;
		try {
			group = mapper.readValue(new File("group.json"), Group.class);
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
		System.out.println("Name:           " + group.getName());
		System.out.println("Stanford OrgID: " + group.getLsjuGroup().getOrgId());
	}

}
