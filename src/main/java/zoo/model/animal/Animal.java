package zoo.model.animal;

import zoo.model.environment.Environment;

/**
 * BRIDGE - Abstraction.
 * Holds a reference to an Environment (the Implementor), so the
 * "what kind of animal" hierarchy and the "where it lives / how it moves"
 * hierarchy can vary independently.
 */
public abstract class Animal {
    protected final String name;
    protected final Environment environment; // the bridge

    protected Animal(String name, Environment environment) {
        this.name = name;
        this.environment = environment;
    }

    public String getName() { return name; }
    public Environment getEnvironment() { return environment; }

    /** Delegates to the implementor. */
    public String move() {
        return name + " " + environment.describeMovement();
    }

    public abstract boolean hasBackbone();
    public abstract String getSpecies();
    public abstract String describe();
}
