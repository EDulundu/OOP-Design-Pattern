
/**
 * Created by dulun on 11.12.2016.
 */
public class TestMain {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Traffic Light is starting!!!");
        TrafficLight light = new TrafficLight();

        // green
        light.changeLight();

        // yellow
        light.changeLight();

        // red
        light.changeLight();

        // green
        light.changeLight();

        // yellow
        light.changeLight();

        // red
        light.changeLight();

    }

}
