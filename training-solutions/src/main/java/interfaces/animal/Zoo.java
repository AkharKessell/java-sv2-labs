package interfaces.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = new ArrayList<>(animals);
    }

    public int getNumberOfAnimal() {
        return animals.size();
    }

    public int getNumberOfAllLegs() {
        int count = 0;
        for (Animal actual : animals) {
            count += actual.getNumberOfLegs();
        }
        return count;
    }
}
