package com.example.testtab;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiSelector;
//import androidx.test.uiautomator.UiDevice;


/*
1. Open App Manu
2. Go to Settings
3. Navigate to Connections
4. Navigate to Bluetooth
5. Turn On/Off Bluetooth
6. Navigate Back to Connections
7. Go Back to Home Screen
*/

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.time.OffsetDateTime;

@RunWith(AndroidJUnit4.class)
public class Tab_Settings extends Utility_Functions{


        private UiDevice device;
        @Before
        public void setUp() throws Exception {

            device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
            device.pressHome();




        }
        @Test
        public void mst_Operations() throws Exception {
            // Context of the app under test.


            int i;
            for(i=1;i<=Tab_Settings;i++) {
                mst_Settings();
                System.out.println(" **********************MST_Settings " + i);
            }

        }

        public void mst_Settings() throws Exception{
            try{



                //*******************initializing the required objects********************
                UiObject Sound_Vib = new UiObject(new UiSelector()
                        .text(Settings_Sounds_and_Vib_Text));
                UiObject Notification = new UiObject(new UiSelector()
                        .text(Settings_Notifications_Text));
                UiObject Display = new UiObject(new UiSelector()
                        .text(Settings_Display_Text));
                UiObject Wallpaper = new UiObject(new UiSelector()
                        .text(Settings_Sounds_and_Vib_Text));
                UiObject Adv_Feature = new UiObject(new UiSelector()
                        .text(Settings_Advanced_features_Text));
                UiObject Dev_Maintenance = new UiObject(new UiSelector()
                        .text(Settings_Device_Maintenence_Text));
                UiObject Apps = new UiObject(new UiSelector()
                        .text(Settings_Apps_Text));
                UiObject Lock_Screen = new UiObject(new UiSelector()
                        .text(Settings_Lock_and_Security_Text));
                UiObject Cloud_Acc = new UiObject(new UiSelector()
                        .text(Settings_Cloud_and_Accounts_Text));
                UiObject Google = new UiObject(new UiSelector()
                        .text(Settings_Google_Text));
                UiObject Access = new UiObject(new UiSelector()
                        .text(Settings_Assessibility_Text));
                UiObject Gen_Mgnt = new UiObject(new UiSelector()
                        .text(Settings_General_Management_Text));
                UiObject SW_Udt = new UiObject(new UiSelector()
                        .text(Settings_SW_update_Text));
                UiObject User_Mnul = new UiObject(new UiSelector()
                        .text(Settings_User_Manual_Text));
                UiObject Abt_Tab = new UiObject(new UiSelector()
                        .text(Settings_About_Tab_Text));
                UiObject Devop = new UiObject(new UiSelector()
                        .text(Settings_Sounds_and_Vib_Text));


                device.wakeUp();
                device.pressBack();
                device.pressHome();
                ufMenu_srch_App("Settings");

                UiObject Scroll_Up = new UiObject(new UiSelector()
                        .resourceId("com.android.settings:id/dashboard_container"));
                Scroll_Up.swipeDown(2);

                UiObject Tap_on_Connection = new UiObject(new UiSelector()
                        .text(Settings_Connections_Text));
                Tap_on_Connection.click();


                UiObject  Tap_On_Bluetooth = new UiObject(new UiSelector()
                        .className(Connection_Blutooth_Class).text("Bluetooth"));
                Tap_On_Bluetooth.click();
                Thread.sleep(5000);
                UiObject  BT_On_or_Off = new UiObject(new UiSelector()
                        .resourceId(Switch_Text_BT_Resource_Id));
                String test = BT_On_or_Off.getText();


                //****************************Condition BT Toggle ON or OFF *******************************
                if(test.equalsIgnoreCase("OFF")){
                    Thread.sleep(5000);
                    UiObject  Tap_On_BT_Switch_OFF = new UiObject(new UiSelector()
                            .resourceId(Bluetooth_Switch_Resource_Id).text("OFF"));
                    Tap_On_BT_Switch_OFF.click();

                }else {
                    Thread.sleep(5000);
                    UiObject Tap_On_BT_Switch_ON = new UiObject(new UiSelector()
                            .resourceId(Bluetooth_Switch_Resource_Id).text("ON"));
                    Tap_On_BT_Switch_ON.click();
                }
                Tap_on_Connection.click();

                /*UiObject  Return = new UiObject(new UiSelector()
                        .resourceId(Navigate_Up_Xpath));
                Return.click();*/

                device.pressBack();
                device.pressHome();
                //device.swipe(400, 200, 400, , 10);

               /** UiObject Network_Internet = new UiObject(new UiSelector()
                        .className(SETTINGS_MENU_className).index(0));
                Network_Internet.click();
                device.pressBack();
                Thread.sleep(3000);

                UiObject Connected_Devices = new UiObject(new UiSelector()
                        .className(SETTINGS_MENU_className).index(1));
                Connected_Devices.click();
                device.pressBack();
                Thread.sleep(3000);

                UiObject Apps_Notification = new UiObject(new UiSelector()
                        .className(SETTINGS_MENU_className).index(2));
                Apps_Notification.click();
                Thread.sleep(3000);

                device.pressBack();

                UiObject Battery = new UiObject(new UiSelector()
                        .className(SETTINGS_MENU_className).index(3));

                Battery.click();
                Thread.sleep(3000);
                device.pressBack();

                UiObject Display = new UiObject(new UiSelector()
                        .className(SETTINGS_MENU_className).index(4));


                Display.click();
                Thread.sleep(3000);
                device.pressBack();

                UiObject Sound = new UiObject(new UiSelector()
                        .className(SETTINGS_MENU_className).index(5));
                Sound.click();
                Thread.sleep(3000);
                device.pressBack();

                device.swipe(300, 700, 300, 100, 20);
                Thread.sleep(3000);
                device.swipe(300, 700, 300, 100, 20);



**/



            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println("********************Test Case Fail*******************");
                device.pressHome();


            }

        }
    }

