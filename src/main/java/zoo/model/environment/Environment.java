package zoo.model.environment;

/**
 * BRIDGE - Implementor.
 * The second dimension of variation: the environment an animal is adapted to.
 * The habitat chain also reads this to decide placement.
 */
public interface Environment {
    EnvironmentType getType();
    String describeMovement();
}
