package zoo.model.animal;

import zoo.model.environment.Environment;

/** BRIDGE - Refined Abstraction (animals without a backbone). */
public abstract class Invertebrate extends Animal {
    protected Invertebrate(String name, Environment environment) {
        super(name, environment);
    }

    @Override
    public boolean hasBackbone() { return false; }

    
}
