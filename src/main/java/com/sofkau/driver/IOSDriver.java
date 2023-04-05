package com.sofkau.driver;

import io.appium.java_client.ios.IOSElement;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSDriver {
    public static io.appium.java_client.ios.IOSDriver<IOSElement> DRIVER;

    public static IOSDriver configureDriver(){

        Dotenv dotenv = Dotenv.configure().load();

        String browserstackUser = dotenv.get("BROWSERSTACK_USER");
        String browserstackKey = dotenv.get("BROWSERSTACK_KEY");

        try {
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("browserstack.user", browserstackUser);
            caps.setCapability("browserstack.key", browserstackKey);

            caps.setCapability("app", "bs://56592204140531e881ed5b6a15a0044e6de15c2a");

            caps.setCapability("device", "iPhone 13");
            caps.setCapability("os_version", "15");

            caps.setCapability("project", "");
            caps.setCapability("build", "");
            caps.setCapability("name", "");

            DRIVER =  new io.appium.java_client.ios.IOSDriver<IOSElement>(new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);

        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return new IOSDriver();
    }

    public io.appium.java_client.ios.IOSDriver<IOSElement> start(){
        return DRIVER;
    }

}
