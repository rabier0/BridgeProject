package zoo.model.animal.invertebrates;

import zoo.model.animal.Invertebrate;
import zoo.model.environment.Environment;

public class Octopus extends Invertebrate {
    public Octopus(String name, Environment environment) {
        super(name, environment);
    }

    @Override
    public String getSpecies() { return "Octopus"; }

    @Override
    public String describe() {
        // TODO: flesh out
        return getName() + " the Octopus - " + move();
    }
}
