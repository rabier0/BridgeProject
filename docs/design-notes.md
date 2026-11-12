# Design Notes

## Bridge
| Role | Class(es) |
|---|---|
| Abstraction | `model.animal.Animal` |
| Refined Abstraction | `Vertebrate`, `Invertebrate` |
| Implementor | `model.environment.Environment` |
| Concrete Implementor | `LandEnvironment`, `WaterEnvironment`, `AirEnvironment` |

Why: two independent dimensions (backbone vs. environment). Without the bridge we'd need
classes like `LandVertebrate`, `WaterInvertebrate`, ... for every combination.

## Chain of Responsibility
| Role | Class(es) |
|---|---|
| Handler | `chain.HabitatHandler` |
| Concrete Handlers | `SavannaHandler`, `AquariumHandler`, `AviaryHandler`, `InsectariumHandler`, `QuarantineHandler` |
| Client | `service.ZooService` |
| Chain assembly | `HabitatChainBuilder` |

Why: placement rules live in separate handlers; adding a habitat = add a handler, no edits to existing code.

## TODO
- UML class diagram (put in `docs/uml/`)
- Sequence diagram for "Admit Animal"
