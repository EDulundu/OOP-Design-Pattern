import observerpattern.*;

/**
 * Created by dulun on 11.12.2016.
 */
public class TestMain {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Traffic Light is starting!!!");

        HiTech hiTech = new HiTech();
        TrafficLight light = new TrafficLight(hiTech);

        hiTech.changeDetected(false);

        // green
        light.changeLight();

        // yellow
        light.changeLight();

        hiTech.changeDetected(true);
        // red
        light.changeLight();

        // green
        light.changeLight();

        // yellow
        light.changeLight();

        hiTech.changeDetected(false);
        // red
        light.changeLight();

    }

}
