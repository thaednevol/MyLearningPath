package co.knry.algorithms.hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        HashMap<Integer, Integer> socks = new HashMap<>();
        int pairOfSocks=0;

        for (int i=0; i<ar.size(); i++){
            if (socks.containsKey(ar.get(i))){
                int numberOfSocks = socks.get(ar.get(i))+1;
                socks.put(ar.get(i), numberOfSocks);

                if (numberOfSocks%2==0){
                    pairOfSocks++;
                }

            }
            else {
                socks.put(ar.get(i), 1);
            }

        }

        return pairOfSocks;

    }

}
