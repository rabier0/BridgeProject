package zoo.model.habitat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zoo.model.animal.Animal;

/** A place in the zoo that holds animals. */
public class Habitat {
    private final String name;
    private final int capacity;
    private final List<Animal> residents = new ArrayList<>();

    public Habitat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() { return name; }
    public boolean isFull() { return residents.size() >= capacity; }
    public List<Animal> getResidents() { return Collections.unmodifiableList(residents); }

    public void addAnimal(Animal animal) {
        // TODO: decide what happens when full (exception? return false?)
        // if (isFull()) {
        //     throw new IllegalArgumentException("")
        // }
        residents.add(animal);

    }
}
