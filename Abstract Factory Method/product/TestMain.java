package product;

import market.EUMarket;
import market.GlobalMarket;
import market.PhoneMarket;
import market.TurkeyMarket;
import product.SmartPhone;

/**
 * Created by dulun on 10.12.2016.
 */
public class TestMain {

    public static void main(String[] args) {

        PhoneMarket market = new TurkeyMarket();
        System.out.println("Turkey Market");
        SmartPhone phone = market.orderPhone("MaximumEffort");
        System.out.println();

        PhoneMarket market1 = new EUMarket();
        System.out.println("EU Market");
        SmartPhone phone1 = market1.orderPhone("MaximumEffort");
        System.out.println();

        PhoneMarket market2 = new GlobalMarket();
        System.out.println("Global Market");
        SmartPhone phone2 = market2.orderPhone("MaximumEffort");
        System.out.println();

        ////////////////////////////////////////////////////////////////

        System.out.println("Turkey Market");
        SmartPhone phone3 = market.orderPhone("IflasDeluxe");
        System.out.println();

        System.out.println("EU Market");
        SmartPhone phone4 = market1.orderPhone("IflasDeluxe");
        System.out.println();

        System.out.println("Global Market");
        SmartPhone phone5 = market2.orderPhone("IflasDeluxe");
        System.out.println();

        ////////////////////////////////////////////////////////////////

        System.out.println("Turkey Market");
        SmartPhone phone6 = market.orderPhone("I-I-Aman-Iflas");
        System.out.println();

        System.out.println("EU Market");
        SmartPhone phone7 = market1.orderPhone("I-I-Aman-Iflas");
        System.out.println();

        System.out.println("Global Market");
        SmartPhone phone8 = market2.orderPhone("I-I-Aman-Iflas");
        System.out.println();

    }
}
