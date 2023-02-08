package resources;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class GetScreenshot extends BaseForm {
	@Test
	public static String capture(String screenshotName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;//take screen shot of the driver ,here TakesScreenshot is interface ts is referance variale/object
		File source =ts.getScreenshotAs(OutputType.FILE);// screen shot nibe file hisabe
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+screenshotName+".png";//where screenshot will be stored
		
		File destination=new File(destinationFile);
		FileUtils.copyFile(source,destination);
		return destinationFile;


}
}
