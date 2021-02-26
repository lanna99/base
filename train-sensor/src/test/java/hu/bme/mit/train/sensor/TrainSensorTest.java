package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    TrainSensorImpl tsi;

    @Before
    public void before() {
        tsi = new TrainSensorImpl();
    }

    @Test
    public void test() {
        tsi.overrideSpeedLimit(20);
        assertEquals(20, tsi.getSpeedLimit());
    }
}
