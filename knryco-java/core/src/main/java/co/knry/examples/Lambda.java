package co.knry.examples;

import java.util.*;

public class Lambda {

    public static void main(String[] args) {
        I1 i=()-> "I have nothing to say.";
        System.out.println(i.show());

        // Single-parameter lambda expression.
        I2 i2=(msg)->{
            return "Hello, "+msg;
        };
        System.out.println(i2.show("Sonoo"));

        // The function parentheses can be omitted.
        I2 s2= msg ->{
            return "Hello, "+msg;
        };
        System.out.println(s2.show("Sonoo"));

        // lambda expression with Multiple parameters
        I3 a=(x,y)->(x+y);
        System.out.println(a.sum(10,20));

        // Multiple parameters with data type in lambda expression
        I3 b=(int x,int y)->(x+y);
        System.out.println(b.sum(100,200));

    }

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer,Integer> hm = new HashMap();

        int max = 0;

        int birdId=-1;

        for(Integer x:arr){
            if(!hm.containsKey(x)){
                hm.put(x,1);
            }else{
                hm.put(x, hm.get(x)+1);
            }
            if (hm.get(x)>max){
                max=hm.get(x);
                birdId=x;
            }
        }
        return birdId;
    }

    class Bird {
        int id;
        int count;


    }

}
