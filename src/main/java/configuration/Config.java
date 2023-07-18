package configuration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;



public class Config {
    public static AndroidDriver setUp(LISTDEV listdev){
        switch (listdev){
            case PIXELNATIVE -> {return greateNATIVEwether();}
            default -> { return null;}
        }

    }

    private static AndroidDriver greateNATIVEwether() {
        AndroidDriver driver=null;
        DesiredCapabilities caps=new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.APP,"C:\\path\\NativeAPK\\Wether.apk");
        caps.setCapability("appium:version", "10");//указываем версию Android
        caps.setCapability("appium:platformName", "Android");//Имя OS
        caps.setCapability("appium:deviceName", "emulator-5554");//Сообщаем, что будет использоваться эмулятор
        caps.setCapability("appium:newCommandTimeout", 1800);
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.weather.forecast.weatherchannel");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.weather.forecast.weatherchannel.activities.SettingActivity");
//        caps.setCapability("appium:noReset","true");
//       caps.setCapability("appium:fullReset","true");
        try {
            driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
