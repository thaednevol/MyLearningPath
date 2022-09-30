package co.knry.essentials;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Zoo {

    public Zoo() {
        Chinese bear = new Chinese();
        bear.eat();

        Grizzly grizzly = new Grizzly(new Date());
        System.out.println(grizzly.name());
    }

    public static void main(String ... args){
        Zoo zoo = new Zoo();
        zoo.addCage();

        Cage cage = zoo.new Cage();
        cage.addBear(new Panda(), new Food());
    }

    private void addCage() {
        Cage cage = new Cage();
        cage.addBear(new Panda(), new Food());
        cage.addBear(new Chinese(), new Food());
    }

    private class Cage{
        List<Bear> bearList;
        Food food;

        Cage(){
            if (bearList==null){
                bearList = new ArrayList<>();
            }
        }

        private void addBear(Bear bear, Food food){
            bearList.add(bear);
            this.food = food;
        }

        private class Floor {

        }
    }

    record Food() {

    }

}
