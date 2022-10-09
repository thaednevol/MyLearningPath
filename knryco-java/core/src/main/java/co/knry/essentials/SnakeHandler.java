package co.knry.essentials;

import java.util.ArrayList;
import java.util.List;

abstract class Snake {}
class Cobra extends Snake {}
class GardenSnake extends Cobra {}
public class SnakeHandler {
    private Snake snakey;
    public void setSnake( Snake mySnake) {
        this.snakey = mySnake;
    }
    public static void main( String[] args) {
        new SnakeHandler().setSnake(new Snake() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
    }

    interface Walk {
        private static List move() {
            return null;
        }
    }

    interface Run extends Walk {
        public ArrayList move();
    }

    class Leopard implements Walk {
        public List move() { // X
            return null;
        }
    }

    class Panther implements Run {
        public ArrayList move() { // Z
            return null;
        }
    }



}



