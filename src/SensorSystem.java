import java.util.ArrayList;

public class SensorSystem {
    ArrayList<TableListener> listeners = new ArrayList<TableListener>();

    public void register(TableListener alarmListener) {
        listeners.add(alarmListener);
    }

    // Call alarm methods for every TableListener
    public void soundTheAlarm() {
        for(TableListener listener : listeners) {
            listener.alarm();
        }
    }
}
