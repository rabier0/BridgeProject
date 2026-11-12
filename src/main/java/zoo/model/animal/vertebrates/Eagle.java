package zoo.model.animal.vertebrates;

import zoo.model.animal.Vertebrate;
import zoo.model.environment.Environment;

public class Eagle extends Vertebrate {
    public Eagle(String name, Environment environment) {
        super(name, environment);
    }

    @Override
    public String getSpecies() { return "Eagle"; }

    @Override
    public String describe() {
        // TODO: flesh out
        return getName() + " the Eagle - " + move();
    }
}
