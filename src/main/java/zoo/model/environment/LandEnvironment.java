package zoo.model.environment;

/** BRIDGE - Concrete Implementor */
public class LandEnvironment implements Environment {
    @Override
    public EnvironmentType getType() { return EnvironmentType.LAND; }

    @Override
    public String describeMovement() { return "walks/crawls on land"; }
}
