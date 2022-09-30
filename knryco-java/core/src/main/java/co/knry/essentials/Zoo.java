package co.knry.essentials;

import java.time.Instant;
import java.util.Date;

public class Zoo {

    public Zoo(){
        Chinese bear = new Chinese();
        bear.eat();

        var grizzly = new Grizzly("Pardo", Date.from(Instant.now()), 1.0, 2.0);
        grizzly.name();
    }

}
