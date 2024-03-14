package program;

import program.controllers.PetController;
import program.models.Pet;
import program.repositories.IRepository;
import program.repositories.PetRepository;
import program.userinterfaces.ConsoleMenu;

public class Main {
    public static void main(String[] args) {
        IRepository<Pet> pet_system = new PetRepository();
        PetController controller = new PetController(pet_system);
        new ConsoleMenu(controller).start();
    }
}