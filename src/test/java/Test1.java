import activitiesObjects.SettingObject;

import configuration.Base;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test1 extends Base {
    static SettingObject object;

    @BeforeClass
    public static void bef() {
        object = new SettingObject(driver);
    }

    @Test
    public void testSetting1() {
        System.out.println(driver.currentActivity());
    }

    @Test
    public void testSettingTemp1() {
        object.temSelect(SettingObject.TEMP.F);
    }

    @Test
    public void testSettingSpeed1() {
        object.selectSpeedMetric(SettingObject.SPEED.M);
    }

}
