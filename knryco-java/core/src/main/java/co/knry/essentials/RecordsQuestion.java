package co.knry.essentials;

public class RecordsQuestion {

    public record Iguana( int age) {
        //private static final int age = 10;
    }

    public final record Gecko() {}

    //public abstract record Chameleon() { private static String name; }

    public record BeardedDragon( boolean fun) { @Override public boolean fun() { return false; } }

    public record Newt( long size) {
        @Override public boolean equals( Object obj) { return false; }
        public void setSize( long size)
        { //this.size = size;
             }
    }

}
