package zoo.model.animal;

import zoo.model.environment.Environment;

/** BRIDGE - Refined Abstraction (animals with a backbone). */
public abstract class Vertebrate extends Animal {
    protected Vertebrate(String name, Environment environment) {
        super(name, environment);
    }

    @Override
    public boolean hasBackbone() { return true; }

    // TODO: vertebrate-specific fields/behavior (e.g., body temperature regulation)
}
