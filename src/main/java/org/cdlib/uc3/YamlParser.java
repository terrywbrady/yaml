package org.cdlib.uc3;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class YamlParser {
    
    
    public static void main(String[] argv) {
    	ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
    	try {
			System.out.println(mapper.readTree(new File("config.yml")));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
