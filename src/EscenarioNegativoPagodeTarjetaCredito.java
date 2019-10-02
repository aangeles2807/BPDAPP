package PopularApp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class EscenarioNegativoPagodeTarjetaCredito {
    public static void main(String args []) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "592fcb8");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","com.popular.app.android");
        dc.setCapability("appActivity","com.siddhatech.tutorial.TutorialActivity");
        dc.setCapability("noReset",true);

        try {

            AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://10.0.75.1:4723/wd/hub"), dc);

            MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
            el1.click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]");
            el3.click();
            el3.sendKeys("0078");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("image resource");
            el4.click();
            System.out.println("Pago Tarjeta de Credito");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.TextView");
            el5.click();

            System.out.println("Seleccionar tarjeta de credito");
            MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[4]/android.widget.TextView");
            el6.click();


            MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout");
            el7.click();

            System.out.println("Hacer clic en tarjeta de credito seleccionada");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ListView/android.widget.LinearLayout/android.widget.RelativeLayout");
            el8.click();

            System.out.println("Seleccionar el pago minimo");
            MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView");
            el9.click();

            System.out.println("Paso2");
            MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.Button[2]");
            el10.click();

            System.out.println("Paso3");
            MobileElement el11 = (MobileElement) driver.findElementById("android:id/button1");
            el11.click();

            System.out.println("Paso4");
            MobileElement el12 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"image resource\"])[2]");
            el12.click();

            System.out.println("Paso5");
            MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView");
            el13.click();


            driver.quit();

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
