package product;

import part.*;

/**
 * Created by dulun on 11.12.2016.
 */
public abstract class SmartPhone {

    String modelName;

    String batteryProp;
    String cpuAndRamProp;
    String displayProp;
    String storageProp;
    String casesProp;
    String cameraProp;

    // Component
    Display display;
    Battery battery;
    CpuAndRam cpuAndRam;
    Storage storage;
    Camera camera;
    Cases cases;

    public abstract void createPhone();

    public void attachCpuAndRam(){

        System.out.println("Cpu & Ram: " + cpuAndRamProp + ", " + cpuAndRam.toString() + " eklendi.");
    }

    public void attachDisplay(){

        System.out.println("Display: " + displayProp + ", " + display.toString() + " takildi.");
    }

    public void attachBattery(){

        System.out.println("Battery: " + batteryProp + ", " + battery.toString() + " takildi.");
    }

    public void attachStorage(){

        System.out.println("Storage: " + storageProp + ", " + storage.toString() + " eklendi.");
    }

    public void attachCamera(){

        System.out.println("Camera: " + cameraProp + ", " + camera.toString() + " eklendi.");
    }

    public void enclosePhoneCase(){

        System.out.println("Cases: " + casesProp + ", " + cases.toString() + " ozellikleri eklendi.");
    }

    public String getModelName(){

        return modelName;
    }

    public void setModelName(String modelName){

        this.modelName = modelName;
    }
}
