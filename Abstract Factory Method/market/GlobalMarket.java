package market;

import abstractFactoryMethod.GlobalComponentFactory;
import abstractFactoryMethod.PhoneComponentFactory;
import product.IIAmanIflas;
import product.IflasDeluxe;
import product.MaximumEffort;
import product.SmartPhone;

/**
 * Created by dulun on 11.12.2016.
 */
public class GlobalMarket extends PhoneMarket {

    @Override
    protected SmartPhone makeSmartPhone(String type) {
        SmartPhone phone = null;
        PhoneComponentFactory phoneFactory = new GlobalComponentFactory();

        if(type.equals("MaximumEffort")){
            phone = new MaximumEffort(phoneFactory);
            phone.setModelName("Global Style Maximum Effort");
        }else if(type.equals("IflasDeluxe")){
            phone = new IflasDeluxe(phoneFactory);
            phone.setModelName("Global Style Iflas Deluxe");
        }else if(type.equals("I-I-Aman-Iflas")){
            phone = new IIAmanIflas(phoneFactory);
            phone.setModelName("Global Style I-I-Aman-Iflas");
        }

        return phone;
    }
}
