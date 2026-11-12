package zoo.service;

import java.util.List;
import zoo.chain.HabitatChainBuilder;
import zoo.chain.HabitatHandler;
import zoo.model.animal.Animal;
import zoo.model.habitat.Habitat;

/** Core app logic; the GUI talks only to this class. */
public class ZooService {
    private final HabitatChainBuilder builder = new HabitatChainBuilder();
    private final HabitatHandler chainHead = builder.build();

    public Habitat admit(Animal animal) {
        return chainHead.place(animal);
    }

    public List<Habitat> getHabitats() {
        return builder.getHandlers().stream().map(HabitatHandler::getHabitat).toList();
    }
}
