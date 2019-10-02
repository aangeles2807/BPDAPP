package PopularApp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BPDAppNavigate {

    public static void main(String args []) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "592fcb8");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","com.popular.app.android");
        dc.setCapability("appActivity","com.siddhatech.tutorial.TutorialActivity");
        dc.setCapability("noReset",true);

        try {

            AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://10.0.75.1:4723/wd/hub"), dc);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text=\"ACCESO CLIENTES\"]");

            if (el1.isDisplayed()) {
                System.out.println("Verification Point Success: ACCESO CLIENTES found");
            }else{
                System.out.println("Verification Point Fail: ACCESO CLIENTES not found");
            }

            el1.click();

            MobileElement cod1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]");
            cod1.click();
            cod1.sendKeys("0078");

            driver.quit();

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
