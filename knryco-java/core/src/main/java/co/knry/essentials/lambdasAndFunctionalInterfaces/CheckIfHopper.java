package co.knry.essentials.lambdasAndFunctionalInterfaces;

public class CheckIfHopper implements CheckTrait{
    @Override
    public boolean test(Animal animal) {
        return animal.canHop();
    }
}
