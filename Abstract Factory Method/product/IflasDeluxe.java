package product;

import abstractFactoryMethod.PhoneComponentFactory;

/**
 * Created by dulun on 11.12.2016.
 */
public class IflasDeluxe extends SmartPhone {

    PhoneComponentFactory phoneFactory;

    public IflasDeluxe(PhoneComponentFactory phoneFactory){

        this.phoneFactory = phoneFactory;
        this.batteryProp = "20h, 2800mAh";
        this.displayProp = "5.3 inches";
        this.cameraProp = "12Mp front, 5Mp rear";
        this.casesProp = "149x73x7.7 mm waterproof, aluminum";
        this.cpuAndRamProp = "2.2GHz, 6GB";
        this.storageProp = "MicroSD support, 32GB";
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
