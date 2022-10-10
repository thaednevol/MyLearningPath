package co.knry.essentials.lambdasAndFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class TraditionalSearch {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        // pass class that does check
        CheckTrait checker = animal -> checkAnimal(animal);
        print(animals, animal -> checkAnimal(animal));


        Converter lambda = x -> Math.round(x);


        prount(10, Math::round);

        Lovely lovely = Dog::cuddle;

        lovely.apachichar(1);

        var str = "";
        StringChecker lambda2 = s -> s.startsWith(" Zoo");

        StringChecker lambda3 = str::startsWith;

        boolean a = lambda3.check("zoo");

    }

    private static void prount(int x, Converter lambda) {
        lambda.convert(x);

    }

    private static boolean checkAnimal(Animal animal) {
        return animal.canHop();
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }



}
