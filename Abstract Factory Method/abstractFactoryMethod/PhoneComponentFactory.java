package abstractFactoryMethod;

import part.*;

/**
 * Created by dulun on 11.12.2016.
 */
public interface PhoneComponentFactory {

    Display createDisplay();

    Battery createBattery();

    CpuAndRam createCpuAndRam();

    Storage createStorage();

    Camera createCamera();

    Cases createCases();
}
