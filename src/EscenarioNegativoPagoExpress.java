
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class EscenarioNegativoPagoExpress {
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
            MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
            el1.click();

            if (el1.isDisplayed()) {
                System.out.println("Verification Point Success: ACCESO CLIENTES found");
            }else{
                System.out.println("Verification Point Fail: ACCESO CLIENTES not found");
            }

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]");
            el2.click();

            if (el2.isDisplayed()) {
                System.out.println("Verification Point Success: login code form found");
            }else{
                System.out.println("Verification Point Fail: login code form not found");
            }

            el2.sendKeys("0078");

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("image resource");
            el3.click();

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.TextView");
            el4.click();

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[5]/android.widget.TextView");
            el5.click();
            System.out.println("Campo Beneficiario");

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText");

            if (el6.isDisplayed()) {
                System.out.println("Verification Point Success: Account Field Form found");
            }else{
                System.out.println("Verification Point Fail: Account Field Form not found");
            }

            el6.click();
            el6.sendKeys("795901628");

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText");
            el7.click();
            el7.sendKeys("1");

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]");
            el8.click();

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[4]/android.widget.Button[2]");

            if (el9.isDisplayed()) {
                System.out.println("Verification Point Success: Pay Button found");
            }else{
                System.out.println("Verification Point Fail: Pay Button not found");
            }

            el9.click();

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement el10 = (MobileElement) driver.findElementById("android:id/button1");
            el10.click();

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.navigate().back();
            MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView");
            el11.click();

            driver.quit();

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
