# BridgeProject

### By: Rabier and Dora
## Description
The BridgeProject is a Java-based application that demonstrates the use of the Bridge design pattern to separate abstraction from implementation, allowing both to vary independently.

The project includes examples of how to implement the Bridge pattern in Java, showcasing the decoupling of abstraction and implementation layers.
The Chain of Responsibility pattern is also demonstrated, illustrating how to pass requests along a chain of handlers until one of them handles the request.

All of this is done in the form of a zoo management system, where animals are placed in appropriate habitats based on their environment adaptations. 
- The bridge pattern is used to separate the abstraction (animals) from the implementation (environments), allowing both to vary independently.
- The Chain of Responsibility pattern is used to handle the placement of animals into appropriate habitats, passing the request along a chain of handlers until one can handle it.

## Folder Structure
The project has the following folder structure:

- `docs`: the folder to maintain project documentation files as well as UML diagrams
- `src`: the folder to maintain sources, including the Bridge pattern implementation files
- `chain`: the folder to maintain Chain of Responsibility pattern implementation files, including handler classes and request processing logic
- `gui`: the folder to maintain TGUI (Text-based Graphical User Interface) implementation files
- `model`: the folder to maintain model classes used in the project
- `service`: the folder to maintain service classes used in the project
- `bin`: the folder to maintain compiled output files
- `README.md`: the file containing project documentation
- `lib`: the folder to maintain dependencies


```
model/
├── animal/          ← Abstraction side
│   ├── Animal.java           Abstraction (holds the Environment reference, which is the "bridge")
│   ├── Vertebrate.java       Refined Abstraction
│   ├── Invertebrate.java     Refined Abstraction
│   ├── vertebrates/          Lion, Eagle, Shark
│   └── invertebrates/        Butterfly, Octopus, Spider
├── environment/     ← Implementor side
│   ├── Environment.java      Implementor (interface)
│   ├── LandEnvironment.java  Concrete Implementor
│   ├── WaterEnvironment.java Concrete Implementor
│   └── AirEnvironment.java   Concrete Implementor
└── habitat/         ← NOT part of the Bridge
    ├── Habitat.java
    ├── LandHabitat.java (add these later)
    ├── WaterHabitat.java
    └── AirHabitat.java
```

## To Run the Project

Run this in terminal:

```
javac -d out $(find src/main/java -name "*.java") && java -cp out zoo.Main
```

This will create an ouput directory as well as run the `zoo.Main` class to start the application.