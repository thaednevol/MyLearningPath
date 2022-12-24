package co.knry.essentials.streams;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class MyOptional {

    public static void main(String ... args){
       Optional.of(getSomething()).ifPresentOrElse(s -> consumeIt(s), runIt());

       var empty =
               Stream.of(1,"a", new Date());

       var list = List.of("1", 1, new Date());
       list.stream().forEach(e -> {
               if (e instanceof String s){
                   System.out.println(s);
               }
               else if (e instanceof Date d){
                   doSomethingWithADate(d);
               }
       });

        Comparator<Duck> byWeight = (d1, d2) -> d1.weight() - d2.weight();

        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo", "Perro", "Gato", "Gallina", "Otros");
        AtomicInteger i = new AtomicInteger();
        s.forEach(a -> {
            i.getAndIncrement();
            System.out.println(a+ " "+i);
        });

        var array = new String[] { "w", "o", "l", "f" };
        var result = "";
        for (var str: array) result = result + str;
        System.out.println(result);

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (str, c) -> str + c);
        System.out.println(word); // wolf

        var myStream = Stream.of("black bear", "brown bear", "grizzly");
        long count = myStream.filter(str -> str.startsWith("g"))
                .peek(x -> {System.out.println(x);}).count();              // grizzly
        System.out.println(count);

        var ourList = List.of("Toby", "Anna", "Leroy", "Alex");
        ourList.stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);


    }

    private static void doSomethingWithADate(Date d) {
    }

    private static Runnable runIt() {
        Runnable r = () -> System.out.println("I'm running!");
        return r;
    }

    private static void consumeIt(String s) {
        System.out.println(s);
    }

    private static String getSomething() {
        return "null";
    }

}
