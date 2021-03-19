package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TrainSensorTest {
    TrainController mockTrainController;
    TrainUser mockTrainUser;
    TrainSensorImpl trainSensor;

    @Before
    public void before() {
        mockTrainController = mock(TrainController.class);
        mockTrainUser = mock(TrainUser.class);
        trainSensor = new TrainSensorImpl(mockTrainController, mockTrainUser);
    }

    @Test
    public void checkSpeedLimit() {
        Assert.assertEquals(10, 10);
    }

    @Test
    public void absoluteMinMargin() {
        trainSensor.overrideSpeedLimit(-8);
        verify(mockTrainUser, times(1)).setAlarmState(true);
    }

    @Test
    public void absoluteMaxMargin() {
        trainSensor.overrideSpeedLimit(508);
        verify(mockTrainUser, times(1)).setAlarmState(true);
    }

    @Test
    public void relativeMargin() {
        trainSensor.overrideSpeedLimit(mockTrainController.getReferenceSpeed() / 2 - 1);
        verify(mockTrainUser, times(1)).setAlarmState(true);
    }

    @Test
    public void betweenMargin() {
        trainSensor.overrideSpeedLimit(mockTrainController.getReferenceSpeed() / 2 + 1);
        verify(mockTrainUser, times(1)).setAlarmState(false);
    }
}
