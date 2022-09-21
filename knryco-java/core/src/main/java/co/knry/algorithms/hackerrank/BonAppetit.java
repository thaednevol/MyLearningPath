package co.knry.algorithms.hackerrank;

import java.util.List;

public class BonAppetit {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int brian = 0;
        for (int i = 0; i<bill.size(); i++){
            if (i!=k) {
                brian+=bill.get(i);
            }
        }

        int bactual = brian/2;

        int overcharged = b - bactual;

        if (overcharged == 0) {
            System.out.println("Bon appetit");
        }
        else {
            System.out.println(overcharged);
        }
    }

}
