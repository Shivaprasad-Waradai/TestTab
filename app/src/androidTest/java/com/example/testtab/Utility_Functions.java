package com.example.testtab;

import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiSelector;

public class Utility_Functions extends Tab_Veriables{




    //***********************Search App from Main Menu**************************
    public void ufMenu_srch_App(String AppName) throws Exception {
        try {

            UiObject device_main_menu_Key = new UiObject(new UiSelector()
                    .text(APPS_MAIN_Menu_Text));
            UiObject search_App = new UiObject(new UiSelector()
                    .resourceId(APP_SEARCH_Field_Resource_ID));//Galaxy Tab


            UiObject click_on_App = new UiObject(new UiSelector()
                    .className("android.widget.TextView").index(0));//Frontier
            UiObject click_on_App1 = new UiObject(new UiSelector()
                    .className("android.widget.TextView").text("Settings"));//Frontier


            Thread.sleep(2000);
            device_main_menu_Key.click();
            Thread.sleep(2000);
            search_App.setText(AppName);
            Thread.sleep(2000);

            if (click_on_App1.exists()) {
                click_on_App1.click();
                Thread.sleep(2000);
            } else {
                click_on_App.click();
                Thread.sleep(2000);
            }

            System.out.println("*************************" + AppName + " Application found **************************");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("*************************" + AppName + " Application not found ****************************");


        }

    }
}