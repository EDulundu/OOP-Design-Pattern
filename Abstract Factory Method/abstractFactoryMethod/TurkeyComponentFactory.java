package abstractFactoryMethod;

import part.*;
import part.turkeyMarket.*;

/**
 * Created by dulun on 11.12.2016.
 */
public class TurkeyComponentFactory implements PhoneComponentFactory {

    @Override
    public Display createDisplay() {

        return new TurkeyDisplay();
    }

    @Override
    public Battery createBattery() {

        return new TurkeyBattery();
    }

    @Override
    public CpuAndRam createCpuAndRam() {

        return new TurkeyCpuAndRam();
    }

    @Override
    public Storage createStorage() {

        return new TurkeyStorage();
    }

    @Override
    public Camera createCamera() {

        return new TurkeyCamera();
    }

    @Override
    public Cases createCases() {

        return new TurkeyCases();
    }
}
