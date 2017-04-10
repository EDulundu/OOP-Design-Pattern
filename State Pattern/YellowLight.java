import java.util.concurrent.TimeUnit;

/**
 * Created by dulun on 11.12.2016.
 */
public class YellowLight implements TrafficLightState {

    private String color = "YELLOW";

    @Override
    public void handle(TrafficLight light) throws InterruptedException {

        light.setState(new RedLight());
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }
}
