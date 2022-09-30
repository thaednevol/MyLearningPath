package co.knry.essentials;

public class BadCasts {

    interface Canine { }
    interface Dog { }

    class Wolf implements Canine {}

    public static void main(String ... args){
        BadCasts badCasts = new BadCasts();

    }

    public BadCasts (){
        Wolf wolf = new Wolf();
        Dog badDog = (Dog) wolf;
    }

}
