package co.knry.essentials;

public class ZooGiftShop {


    public int admission(int basePrice, SaleTodayOnly sale) {
         sale = new SaleTodayOnly(){

            @Override
            int dollarsOff() {
                return 0;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    public static void main(String ... args) {
        SaleTodayOnly sale = null;

        ZooGiftShop zooGiftShop = new ZooGiftShop();
        zooGiftShop.admission(30, sale);

        System.out.println(sale.dollarsOff());
    }

    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

}
