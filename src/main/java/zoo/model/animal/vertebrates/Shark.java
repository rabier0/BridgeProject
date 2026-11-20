package zoo.model.animal.vertebrates;

import zoo.model.animal.Vertebrate;
import zoo.model.environment.Environment;

public class Shark extends Vertebrate {
    public Shark(String name, Environment environment) {
        super(name, environment);
    }

    @Override
    public String getSpecies() { return "Shark"; }

    @Override
    public String describe() {
        return getName() + " the Shark - " + move();
    }
}
