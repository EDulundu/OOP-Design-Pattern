package product;

import abstractFactoryMethod.PhoneComponentFactory;

/**
 * Created by dulun on 11.12.2016.
 */
public class IIAmanIflas extends SmartPhone {

    PhoneComponentFactory phoneFactory;

    public IIAmanIflas(PhoneComponentFactory phoneFactory){

        this.phoneFactory = phoneFactory;
        this.batteryProp = "16h, 2000mAh";
        this.displayProp = "4.5 inches";
        this.cameraProp = "8Mp front, 5Mp rear";
        this.casesProp = "143x69x7.3 mm waterproof, plastic";
        this.cpuAndRamProp = "2.2GHz, 4GB";
        this.storageProp = "MicroSD support, 16GB";
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
