package zoo.model.animal.vertebrates;

import zoo.model.animal.Vertebrate;
import zoo.model.environment.Environment;

public class Lion extends Vertebrate {
    public Lion(String name, Environment environment) {
        super(name, environment);
    }

    @Override
    public String getSpecies() { return "Lion"; }

    @Override
    public String describe() {
        // TODO: flesh out
        return getName() + " the Lion - " + move();
    }
}
