package zoo.chain;

import zoo.model.animal.Animal;
import zoo.model.habitat.Habitat;

/**
 * CHAIN OF RESPONSIBILITY - Handler.
 * Each handler decides if it can house the animal; if not, passes it on.
 */
public abstract class HabitatHandler {
    private HabitatHandler next;
    protected final Habitat habitat;

    protected HabitatHandler(Habitat habitat) {
        this.habitat = habitat;
    }

    /** Returns the next handler so calls can be chained fluently. */
    public HabitatHandler setNext(HabitatHandler next) {
        this.next = next;
        return next;
    }

    /** Template: try to handle here, otherwise forward. */
    public Habitat place(Animal animal) {
        if (canHandle(animal) && !habitat.isFull()) {
            habitat.addAnimal(animal);
            return habitat;
        }
        if (next != null) {
            return next.place(animal);
        }
        return null; // TODO: end of chain - should never hit if QuarantineHandler is last
    }

    public Habitat getHabitat() { return habitat; }

    protected abstract boolean canHandle(Animal animal);
}
