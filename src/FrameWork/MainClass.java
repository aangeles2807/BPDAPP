package FrameWork;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass {
    public static void main(String args []) throws IOException, InterruptedException {

        objectData d = new objectData();
        CaseClass c = new CaseClass();

        //get case from list in datapool
        ArrayList data = d.ReadExcel("C:\\Users\\aangeles\\IdeaProjects\\BPDAPP\\src\\xml\\", "ListadeCasos.xlsx");
        for(int i=0; i<data.size(); i++){
            c.Case((ArrayList) data.get(i));
        }
    }
}
