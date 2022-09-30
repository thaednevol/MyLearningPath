package co.knry.lnkndquiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String ... args){
        List<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c"));

        for (String value: list){
            if (value.equals("a")){
                list.remove(value);
            }
        }
        System.out.println(list);
    }


}
