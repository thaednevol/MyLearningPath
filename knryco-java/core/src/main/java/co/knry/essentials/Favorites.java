package co.knry.essentials;

public class Favorites {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY;
        static Flavors DEFAULT = STRAWBERRY;

         String expectedVisitors = "";


    }
    public static void main(String[] args) {
        for(final var e : Flavors.values())
            System.out.print(e.ordinal()+" ");
    }
}

