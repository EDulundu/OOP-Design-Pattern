import java.util.concurrent.TimeUnit;

/**
 * Created by dulun on 11.12.2016.
 */
public class TrafficLight {

    private TrafficLightState state;

    public TrafficLight() throws InterruptedException {

        setState(new RedLight());
    }

    public void changeLight() throws InterruptedException {

        state.handle(this);
    }

    public TrafficLightState getState() {

        return state;
    }

    public void setState(TrafficLightState state) throws InterruptedException {

        this.state = state;

        String color = state.getColor();
        if(color.equals("RED")){
            System.out.println("Red Light On    -->" + " Green On  olacak.");
            TimeUnit.SECONDS.sleep(4);
        }else if(color.equals("GREEN")){
            System.out.println("Green Light On  -->" + " Yellow On olacak.");
            TimeUnit.SECONDS.sleep(6);
        }else if(color.equals("YELLOW")){
            System.out.println("Yellow Light On -->" + " Red On    olacak.");
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
