/**
 * Created by dulun on 11.12.2016.
 */
public interface TrafficLightState {

    void handle(TrafficLight light) throws InterruptedException;

    String getColor();
}
