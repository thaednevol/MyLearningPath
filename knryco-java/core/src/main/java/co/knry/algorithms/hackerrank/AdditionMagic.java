package co.knry.algorithms.hackerrank;

public class AdditionMagic {

    public String add(double a, String b){
        String numberFormatted = "";
        if(a == (long) a)
            numberFormatted = String.format("%d",(long)a);
        else
            numberFormatted = String.format("%s",a);

        return numberFormatted+b;
    }


    public String add(double a, double b){
        double c = a + b;

        return Double.toString(c);
    }

    public String add(String a, String b){
        return a+""+b;
    }
}
