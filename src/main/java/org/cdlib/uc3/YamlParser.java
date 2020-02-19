package org.cdlib.uc3;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.yaml.snakeyaml.Yaml;

/*
 * The following example might be useful if it is necessary to preserve the full text of an anchor reference
 * https://github.com/Xceptance/xlt-nocoding/commit/75f2f78542e529b56cf4f763073475f5f25c60e1
 */

public class YamlParser {
    
     public static void main(String[] argv) {
    	String fs = (argv.length == 0) ? "config.yml" : argv[0];
    	File f = new File(fs);
        final Yaml yaml = new Yaml();

    	try {
            final Object loadedYaml = yaml.load(new FileReader(f));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(loadedYaml,LinkedHashMap.class);

            System.out.println(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
