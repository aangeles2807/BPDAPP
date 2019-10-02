import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PagoExpressENDatapool {
    public static void main(String args []) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "592fcb8");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","com.popular.app.android");
        dc.setCapability("appActivity","com.siddhatech.tutorial.TutorialActivity");
        dc.setCapability("noReset",true);

        boolean repeat = true;
        String searchObject = "";

        try {

            AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://10.0.75.1:4723/wd/hub"), dc);

            while (repeat){
                searchObject = "ACCESO CLIENTES";
                try{
                    MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
                    if (el1.isDisplayed()) {
                        System.out.println("Verification Point Success: "+ searchObject +" found");
                    }else{
                        System.out.println("Verification Point Fail: "+ searchObject +" not found");
                    }
                    el1.click();
                    break;
                }catch (NoSuchElementException e){
                    continue;
                }
            }

            while (repeat){
                try{
                    MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]");
                    el2.click();
                    el2.sendKeys("0078");
                    break;
                }catch (NoSuchElementException e){
                    continue;
                }
            }


            while (repeat){
                try{
                    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("image resource");
                    el3.click();
                    break;
                }catch (NoSuchElementException e){
                    continue;
                }
            }

            while (repeat){
                try{
                    MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.TextView");
                    el4.click();
                    break;
                }catch (NoSuchElementException e){
                    continue;
                }
            }

            while (repeat){
                searchObject = "Boton Expresos en Menu";
                try{
                    MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[5]/android.widget.TextView[@text=\"Expresos\"]");
                    if (el5.isDisplayed()) {
                        System.out.println("Verification Point Success: "+ searchObject +" found");
                    }else{
                        System.out.println("Verification Point Fail: "+ searchObject +" not found");
                    }
                    el5.click();
                    break;
                }catch (NoSuchElementException e){
                    continue;
                }
            }

            while (repeat){
                try{
                    MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText");
                    el6.click();
                    el6.sendKeys("0078546");
                    break;
                }catch (NoSuchElementException e){
                    continue;
                }
            }

            while (repeat){
                try{
                    MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText");
                    el7.click();
                    el7.sendKeys("0.1");
                    break;
                }catch (NoSuchElementException e){
                    continue;
                }
            }

            while (repeat){
                try{
                    MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]");
                    el8.click();
                    System.out.println("Hacer clic fuera para cerrar el teclado");
                    break;
                }catch (NoSuchElementException e){
                    continue;
                }
            }

            while (repeat){
                try{
                    MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[4]/android.widget.Button[2]");
                    el9.click();
                    System.out.println("Clic en continuar");
                    break;
                }catch (NoSuchElementException e){
                    continue;
                }
            }

            while (repeat){
                try{
                    MobileElement el10 = (MobileElement) driver.findElementById("android:id/button1");
                    el10.click();
                    System.out.println("Clic en continuar para cerrar la alerta");
                    break;
                }catch (NoSuchElementException e){
                    continue;
                }
            }

            while (repeat){
                try{
                    driver.navigate().back();
                    System.out.println("Back Button");
                    break;
                }catch (NoSuchElementException e){
                    System.out.println(e);
                    continue;
                }
            }

            while (repeat){
                try{

                    MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView");
                    el1.click();
                    System.out.println("Cerrar Sesion");
                    break;
                }catch (NoSuchElementException e){
                    continue;
                }
            }

            driver.quit();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
