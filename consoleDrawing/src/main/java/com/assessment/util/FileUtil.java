/**
 * 
 */
package com.assessment.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author jangabionza
 *
 */
public class FileUtil {
	
	public Properties getCommandList() {
		 Properties prop = new Properties();
		 try (InputStream input = FileUtil.class.getResourceAsStream("/commandList.properties")){
			 prop.load(input);
		} catch (IOException ex) {
            ex.printStackTrace();
        }
		return prop;
	}

}
