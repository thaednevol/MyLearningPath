package co.knry.essentials;

@FunctionalInterface
public interface MyFunctionalInterface {
    int m1();//THIS IS THE ABSTRACT METHOD
    boolean equals(Object o);
    String toString();
    int hashCode();
    /*
    Object class's methods i.e. equals and toString do not count towards the number of abstract methods.
    Therefore, this interface has no abstract method and is not a valid functional interface.
    A functional interface may have any number of fields.
     */
}
