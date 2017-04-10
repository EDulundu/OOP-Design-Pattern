package market;

import abstractFactoryMethod.EUComponentFactory;
import abstractFactoryMethod.PhoneComponentFactory;
import product.IIAmanIflas;
import product.IflasDeluxe;
import product.MaximumEffort;
import product.SmartPhone;

/**
 * Created by dulun on 11.12.2016.
 */
public class EUMarket extends PhoneMarket {

    @Override
    protected SmartPhone makeSmartPhone(String type) {

        SmartPhone phone = null;
        PhoneComponentFactory phoneFactory = new EUComponentFactory();

        if(type.equals("MaximumEffort")){
            phone = new MaximumEffort(phoneFactory);
            phone.setModelName("EU Style Maximum Effort");
        }else if(type.equals("IflasDeluxe")){
            phone = new IflasDeluxe(phoneFactory);
            phone.setModelName("EU Style Iflas Deluxe");
        }else if(type.equals("I-I-Aman-Iflas")){
            phone = new IIAmanIflas(phoneFactory);
            phone.setModelName("EU Style I-I-Aman-Iflas");
        }

        return phone;
    }
}
