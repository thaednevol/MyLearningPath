package co.knry.essentials;

public class Park {

    static class Ride {
        public int price = 6;
    }

    public static void main(String ... args){
        var ride = new Ride();
        System.out.println(ride.price);
    }
}
