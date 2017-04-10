package abstractFactoryMethod;

import part.*;
import part.globalMarket.*;

/**
 * Created by dulun on 11.12.2016.
 */
public class GlobalComponentFactory implements PhoneComponentFactory {


    @Override
    public Display createDisplay() {

        return new GlobalDisplay();
    }

    @Override
    public Battery createBattery() {

        return new GlobalBattery();
    }

    @Override
    public CpuAndRam createCpuAndRam() {

        return new GlobalCpuAndRam();
    }

    @Override
    public Storage createStorage() {

        return new GlobalStorage();
    }

    @Override
    public Camera createCamera() {

        return new GlobalCamera();
    }

    @Override
    public Cases createCases() {

        return new GlobalCases();
    }
}
