package co.knry.essentials.beyondclasses;

public class Deer {
    enum Food {APPLES, BERRIES, GRASS}

    protected class Diet {
        private static Food getFavorite() {
            return Food.BERRIES;
        }

        public static void main(String[] seasons) {
            System.out.print(switch (getFavorite()) {
                case APPLES -> "a";
                case BERRIES -> "b";
                default -> "c";
            });
        }
    }
}

