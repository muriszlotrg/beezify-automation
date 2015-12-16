package properties;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;

import org.testng.Reporter;

public class ReadConfigData {
	protected String workingDir;
	protected Properties properties;

	public ReadConfigData() {
		super();
		workingDir = System.getProperty("user.dir");
		properties = new Properties();
		try {
			FileInputStream Master = new FileInputStream(workingDir + "\\PropertiesFiles\\configData.properties");
			properties.load(Master);
			Master.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Gets url from properties file
	 * @return Beezify url
	 */
	public String getPageUrl() {
        Reporter.log("Getting url from properties file",true);
		return properties.getProperty("pageURL");
	}

	/**
	 * Gets username from properties file
	 * @return username
	 */
	public String getUserName() {
		Reporter.log("Getting username from properties file",true);
		return properties.getProperty("user");
	}

	/**
	 * Gets password from properties file
	 * @return password
	 */
	public String getPassword() {
		Reporter.log("Getting password from properties file",true);
		return properties.getProperty("password");
	}

	/**
	 * Gets domain from properties file
	 * @return domain
	 */
	public String getDomain() {
		Reporter.log("Getting domain from properties file",true);
		return properties.getProperty("domain");
	}


}
