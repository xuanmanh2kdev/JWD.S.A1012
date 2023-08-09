package fa.training.jwd_s_a1012;

import fa.training.jwd_s_a1012.model.entity.Pet;
import fa.training.jwd_s_a1012.service.IOService;

import java.util.List;

public class Test {

    private IOService ioService;

    public Test(IOService ioService) {
        this.ioService = ioService;
    }

    public static void main(String[] args) {

        IOService iOService = new IOService();
        Test test = new Test(iOService);

        List<Pet> pets = List.of(
                new Pet("Mowzer", "cat", 2),
                new Pet("Buddy", "dog", 3),
                new Pet("Felix", "cat", 1)
        );

        iOService.savePets(pets);

        List<Pet> savedPets = iOService.getPets();
        for (Pet pet : savedPets) {
            pet.makeNoise();
        }
    }
}
