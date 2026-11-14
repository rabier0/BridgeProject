package zoo.model.animal.invertebrates;

import zoo.model.animal.Invertebrate;
import zoo.model.environment.Environment;

public class Butterfly extends Invertebrate {
    public Butterfly(String name, Environment environment) {
        super(name, environment);
    }

    @Override
    public String getSpecies() { return "Butterfly"; }

    @Override
    public String describe() {
        // TODO: describe the butterfly's unique characteristics
        return getName() + " the Butterfly - " + move();

    }
}
