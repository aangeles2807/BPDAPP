package FrameWork;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BotConstruction {

        public AndroidDriver GetDriver() throws MalformedURLException {
            // code to be executed
            DesiredCapabilities dc = new DesiredCapabilities();

            dc.setCapability(MobileCapabilityType.DEVICE_NAME, "592fcb8");
            dc.setCapability("platformName","android");
            dc.setCapability("appPackage","com.popular.app.android");
            dc.setCapability("appActivity","com.siddhatech.tutorial.TutorialActivity");
            dc.setCapability("noReset",true);

            AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://10.0.75.1:4723/wd/hub"), dc);

            return driver;
        }
}
