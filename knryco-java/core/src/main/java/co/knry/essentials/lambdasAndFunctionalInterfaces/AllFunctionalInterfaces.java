package co.knry.essentials.lambdasAndFunctionalInterfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AllFunctionalInterfaces {

    public AllFunctionalInterfaces() {
    }

    public static void main(String ... args){
       supplierTest();
    }

    private static void supplierTest() {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        System.out.println(s1.get());
        System.out.println(s2.get());

        Supplier<StringBuilder> s3 = StringBuilder::new;
        Function<StringBuilder, StringBuilder> s4 = (str) -> str.append("Hola");

        BiFunction<String, DateTimeFormatter, LocalDate> transformer = LocalDate::parse;

        Function<String, DateTimeFormatter> formatter = DateTimeFormatter::ofPattern;


        System.out.println(s4.apply(s3.get()).append(" Mundo"));

        System.out.println(transformer.apply("16/08/2016", formatter.apply("d/MM/yyyy")));


        int[] arr = new int[]{2, 3, 4, 5, 6, 7};

        IntPredicate p1 = i -> i%2==0;

        IntStream a = Arrays.stream(arr).filter(p1);
    }
}
