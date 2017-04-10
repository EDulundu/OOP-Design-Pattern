import observerpattern.Observer;
import observerpattern.Subject;
import java.util.concurrent.TimeUnit;

/**
 * Created by dulun on 11.12.2016.
 */
public class TrafficLight implements Observer {

    private TrafficLightState state;

    private boolean flag = false;

    private int observerId;

    private static int observerIdTracker = 0;

    private int timeout_X = 6;

    public TrafficLight() throws InterruptedException {

        setState(new RedLight());
    }

    public TrafficLight(Subject hiTech) throws InterruptedException {

        this.observerId = ++observerIdTracker;
        System.out.println("New Traffic Light ObserverID: " + observerId);
        hiTech.register(this);

        setState(new RedLight());
    }

    @Override
    public void update(boolean flag) {

        if(this.flag != flag){

            this.flag = flag;
            if(this.flag)
                timeout_X = 9;
            else
                timeout_X = 6;

            System.out.println("Traffic Light ObserverID: " + observerId + " flag: " + this.flag);
        }

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
            TimeUnit.SECONDS.sleep(timeout_X);
        }else if(color.equals("YELLOW")){
            System.out.println("Yellow Light On -->" + " Red On    olacak.");
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
