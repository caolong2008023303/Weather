import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.weather.springboot.util.Utils;

@RunWith(SpringRunner.class)
public class UtilsTest {
	
	String temperature = "288.15";

    @Test
    public void tempFormat() {
        Assert.assertEquals(Utils.tempFormat(temperature), "15°C");
    }

}