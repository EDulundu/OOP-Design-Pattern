package abstractFactoryMethod;

import part.*;
import part.euMarket.*;

/**
 * Created by dulun on 11.12.2016.
 */
public class EUComponentFactory implements PhoneComponentFactory {


    @Override
    public Display createDisplay() {

        return new EUDisplay();
    }

    @Override
    public Battery createBattery() {

        return new EUBattery();
    }

    @Override
    public CpuAndRam createCpuAndRam() {

        return new EUCpuAndRam();
    }

    @Override
    public Storage createStorage() {

        return new EUStorage();
    }

    @Override
    public Camera createCamera() {

        return new EUCamera();
    }

    @Override
    public Cases createCases() {

        return new EUCases();
    }
}
