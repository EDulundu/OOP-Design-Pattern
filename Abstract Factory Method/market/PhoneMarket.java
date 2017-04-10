package market;

import product.SmartPhone;

/**
 * Created by dulun on 11.12.2016.
 */
public abstract class PhoneMarket {

    protected abstract SmartPhone makeSmartPhone(String type);

    public SmartPhone orderPhone(String type){

        SmartPhone phone = makeSmartPhone(type);

        phone.createPhone();
        phone.attachCpuAndRam();
        phone.attachDisplay();
        phone.attachBattery();
        phone.attachStorage();
        phone.attachCamera();
        phone.enclosePhoneCase();

        return phone;
    }
}
