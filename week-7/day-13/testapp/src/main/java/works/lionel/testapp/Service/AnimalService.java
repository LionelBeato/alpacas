package works.lionel.testapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import works.lionel.testapp.Model.Animal;
import works.lionel.testapp.Repository.AnimalRepository;

import java.util.Optional;

@Service
public class AnimalService {
    
    @Autowired
    AnimalRepository animalRepository;

    public Iterable<Animal> getAnimals(){
        return animalRepository.findAll();
    }

    public void postAnimal(Animal animal){
        animalRepository.save(animal);
    }

    public Optional<Animal> updateAnimal(Animal newAnimal, Long id){
        animalRepository.findById(id).map(animal -> {
            animal.setName(newAnimal.getName());
            animal.setAmountOfLegs(newAnimal.getAmountOfLegs());
            animal.setColor(newAnimal.getColor());
            animal.setFluffy(newAnimal.isFluffy());
            return animalRepository.save(animal);
        });
        return animalRepository.findById(id);
    }


    public void deleteAnimal(Long id){
        animalRepository.deleteById(id);
    }

}
