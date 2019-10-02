package FrameWork;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;
import java.util.ArrayList;

public class CaseClass {

    public void Case(ArrayList caseData) throws IOException, InterruptedException {
        BotConstruction b = new BotConstruction();
        objectData d = new objectData();
        ArrayList data = d.ReadExcel((String) caseData.get(3), (String) caseData.get(4));

        // return driver with the capture app
        AndroidDriver<AndroidElement> driver = b.GetDriver();

        for(int i=0; i<data.size(); i++){
            Step(driver, (ArrayList) data.get(i));
        }

        driver.quit();
    }

    public void Step(AndroidDriver driver, ArrayList stepData){

        String step = stepData.get(0).toString();                               //contiene el paso espesificado en el caso de uso
        int verify = (int) stepData.get(1);
        String verificationPointElement = stepData.get(2).toString();           //elemento de verificacion segun la solicitud del cliente, si en el paso no se hace verificacion se coloca 'none'
        String searchElement = stepData.get(3).toString();                      //es el parametro de busqueda del elemento, puede ser un xpah o id
        int searchType = (int) stepData.get(4);                                 //es la funcion de busqueda que utiliza appium, puede ser "findElementByXPath" = 3,  "findElementByAccessibilityId" = 2 y "findElementById" que es igual a 1
        int sendKey =  (int) stepData.get(5);                                   //espesifica si se va a escribir en un textbox o no
        String sendKeyValue = stepData.get(6).toString();                       //es el parametro de escritura en los textbox
        int navidateBack = (int) stepData.get(7);                               //es una opcion realizar el evento de retornar a la pantalla anterior, puede ser 1 o 0

        System.out.println(step);
        if(navidateBack == 0){
            //return app element
            MobileElement element = getElement(searchElement, searchType, driver);

            //if is required by the test case step, verify the step
            if(verify == 1){
                if (element.isDisplayed()) {
                    System.out.println("Verification Point Success: "+ verificationPointElement +" found");
                }else{
                    System.out.println("Verification Point Fail: "+ verificationPointElement +" not found");
                }
            }

            //clic
            element.click();

            //if is required by the test case step, send data to textbox
            if(sendKey != 0){
                element.sendKeys(sendKeyValue);
            }
        }else{
            driver.navigate().back();
        }
    }

    public MobileElement getElement(String searchElement, int searchType, AndroidDriver driver){
        boolean repeat = true;
        MobileElement element = null;
        while (repeat){
            try{
                if (searchType == 1){
                    element = (MobileElement) driver.findElementById(searchElement);
                    break;
                }else if(searchType == 2){
                    element = (MobileElement) driver.findElementByAccessibilityId(searchElement);
                    break;
                }else if(searchType == 3){
                    element = (MobileElement) driver.findElementByXPath(searchElement);
                    break;
                }else{
                    System.out.println("searchType not found");
                    break;
                }
            }catch (NoSuchElementException e){
                continue;
            }
        }
       return element;
    }
}
