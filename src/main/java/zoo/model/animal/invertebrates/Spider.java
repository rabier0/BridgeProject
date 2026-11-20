package zoo.model.animal.invertebrates;

import zoo.model.animal.Invertebrate;
import zoo.model.environment.Environment;

public class Spider extends Invertebrate {
    public Spider(String name, Environment environment) {
        super(name, environment);
    }

    @Override
    public String getSpecies() { return "Spider"; }

    @Override
    public String describe() {
        return getName() + " the Spider - " + move();
    }
}
