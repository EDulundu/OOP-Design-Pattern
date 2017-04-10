import java.util.concurrent.TimeUnit;

/**
 * Created by dulun on 11.12.2016.
 */
public class GreenLight implements TrafficLightState {

    private String color = "GREEN";

    @Override
    public void handle(TrafficLight light) throws InterruptedException {

        light.setState(new YellowLight());
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }
}
