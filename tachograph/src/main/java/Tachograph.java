import com.google.common.collect.Table;

import java.util.Date;

public class Tachograph {
    // current time, joystick position, reference speed
    public Table<Date, Float, Float> table;

    public void addEntry(Date currentTime, Float joystickPos, Float refSpeed) {
        table.put(currentTime, joystickPos, refSpeed);
    }

    public int getSize() {
        return table.size();
    }
}
