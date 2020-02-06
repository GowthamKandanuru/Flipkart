package Config;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {
	
	private  Properties props;
	
	public PropertyFile()
	{
		props = new Properties();
		FileInputStream input;
		try {
			input = new FileInputStream("K:\\Testlab\\Flipkart\\mirage\\Resources\\config.properties");
			props.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getDriver()
	{
		return props.getProperty("driver");
	}
	public String getDriverPath()
	{
		return props.getProperty("driverPath");
	}
	public String getUrl()
	{
		return props.getProperty("url");
	}
	public String getUser()
	{
		return props.getProperty("username");
	}
	public String getPass()
	{
		return props.getProperty("password");
	}
	public String getExcelPath()
	{
		return props.getProperty("Excelpath");
	}
	public String getSheet()
	{
		return props.getProperty("Sheetname");
	}
}

