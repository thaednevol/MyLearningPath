package co.knry.essentials.beyondclasses;

import java.time.LocalDate;

public record RabbitFood(int size, String brand, LocalDate expires) {
    public static int MAX_STORAGE = 100;
    public RabbitFood() {
    }
}
