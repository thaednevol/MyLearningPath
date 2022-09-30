package co.knry.essentials;

public class EmperorPenguin extends Penguin {
    public int getHeight(){
        return 8;
    }

    public static void main (String ... args){
        new EmperorPenguin().printInfo();
    }

}

class Penguin {
    public int getHeight(){
        return 3;
    }

    public static int getAge(){
        return 10;
    }

    public void printInfo(){
        System.out.println(this.getHeight());
        System.out.println(this.getAge());
        //System.out.println(super.getHeight());
    }

}
