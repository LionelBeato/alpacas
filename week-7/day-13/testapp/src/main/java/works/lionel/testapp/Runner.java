package works.lionel.testapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import works.lionel.testapp.Repository.AnimalRepository;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    AnimalRepository animalRepository;


    @Override
    public void run(String... args) throws Exception {

//        animalRepository.save(new Animal("snake", 0, "green", false));
//        animalRepository.save(new Animal("bear", 4, "brown", true));




    }
}
