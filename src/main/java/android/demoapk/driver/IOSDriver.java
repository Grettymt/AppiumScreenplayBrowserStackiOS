package android.demoapk.driver;

import io.appium.java_client.ios.IOSElement;
import io.github.cdimascio.dotenv.Dotenv;
import org.apache.xpath.operations.String;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSDriver {
    public static io.appium.java_client.ios.IOSDriver<IOSElement> driver;

    public static IOSDriver configureDriver() throws MalformedURLException {

        //Dotenv dotenv = Dotenv.configure().load();

        //String browserstackUser = dotenv.get("BROWSERSTACK_USER");
       // String browserstackKey = dotenv.get("BROWSERSTACK_KEY");

        try {
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("browserstack.user", "cristhianmorenog_hlGAeI");
            caps.setCapability("browserstack.key","hWrsHgyYs7x79zH6vsF2");

            caps.setCapability("app", "bs://90ecf4ee5d354af16022a85c14f196efd9ff5e64");

            caps.setCapability("device", "iPhone 12 Pro");
            caps.setCapability("os_version", "16.0");

            caps.setCapability("project", "IOSDemo");
            caps.setCapability("build", "IOS SauceLab build 2");
            caps.setCapability("name", "Test IOS");

            driver =  new io.appium.java_client.ios.IOSDriver<IOSElement>(new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);

        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return new IOSDriver();
    }

    public io.appium.java_client.ios.IOSDriver<IOSElement> start(){
        return driver;
    }

}
