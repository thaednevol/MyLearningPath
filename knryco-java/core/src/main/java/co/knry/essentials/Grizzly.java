package co.knry.essentials;

import java.util.Date;

public record Grizzly(String name, Date birthDate) {
    public Grizzly {
        if (name.isBlank()) {
            name = "Standard Grizzy";
        }
    }

    public Grizzly(Date birthDate){
        this("Abandoned Grizzly", birthDate);
    }

}
