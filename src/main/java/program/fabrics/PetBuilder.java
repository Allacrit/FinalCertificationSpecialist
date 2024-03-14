package program.fabrics;

import program.enums.PetType;
import program.models.Cat;
import program.models.Dog;
import program.models.Hamster;
import program.models.Pet;

public class PetBuilder extends Builder {
    @Override
    protected Pet createNewPet(PetType type) {

        return switch (type) {
            case Cat -> new Cat();
            case Dog -> new Dog();
            case Hamster -> new Hamster();
        };
    }
}