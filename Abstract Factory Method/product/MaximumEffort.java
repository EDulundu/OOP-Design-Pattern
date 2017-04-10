package product;

import abstractFactoryMethod.PhoneComponentFactory;

/**
 * Created by dulun on 11.12.2016.
 */
public class MaximumEffort extends SmartPhone {

    PhoneComponentFactory phoneFactory;

    public MaximumEffort(PhoneComponentFactory phoneFactory){

        this.phoneFactory = phoneFactory;
        this.batteryProp = "27h, 3600mAh";
        this.displayProp = "5.5 inches";
        this.cameraProp = "12Mp front, 8Mp rear";
        this.casesProp = "151x73x7.7 mm dustproof, waterproof, aluminum";
        this.cpuAndRamProp = "2.8GHz, 8GB";
        this.storageProp = "MicroSD support, 64GB";
    }

    @Override
    public void createPhone() {
        System.out.println(getModelName() + " Phone modeli olusturuluyor.");

        cpuAndRam = phoneFactory.createCpuAndRam();
        display = phoneFactory.createDisplay();
        battery = phoneFactory.createBattery();
        storage = phoneFactory.createStorage();
        camera = phoneFactory.createCamera();
        cases = phoneFactory.createCases();
    }
}
