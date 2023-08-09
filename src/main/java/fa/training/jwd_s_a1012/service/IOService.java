package fa.training.jwd_s_a1012.service;

import fa.training.jwd_s_a1012.model.entity.Pet;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class IOService {

    private final String FILE_PATH = "pets.txt";

    public void savePets(List<Pet> pets) {
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            outputStream.writeObject(pets);
            outputStream.close();
            System.out.println("Pets saved to file " + FILE_PATH);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Pet> getPets() {
        List<Pet> pets = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
            pets = (List<Pet>) inputStream.readObject();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return pets;
    }
}
