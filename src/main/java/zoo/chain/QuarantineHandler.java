package zoo.chain;

import zoo.model.animal.Animal;
import zoo.model.environment.EnvironmentType;
import zoo.model.habitat.Habitat;

/** CHAIN OF RESPONSIBILITY - Concrete Handler: catch-all at the end of the chain */
public class QuarantineHandler extends HabitatHandler {
    public QuarantineHandler(Habitat habitat) { super(habitat); }

    @Override
    protected boolean canHandle(Animal animal) {
        // TODO: refine rule
        return true;
    }
}
