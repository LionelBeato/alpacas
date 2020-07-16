package works.lionel.testapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import works.lionel.testapp.Model.Animal;
import works.lionel.testapp.Repository.AnimalRepository;
import works.lionel.testapp.Service.AnimalService;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("animals")
public class AnimalController {

    @Autowired
    AnimalRepository animalRepository;
    @Autowired
    AnimalService animalService;

    // get method
    // this aligns with "read"

    @GetMapping("/get")
    public Iterable<Animal> getAnimals(){
//        return animalRepository.findAll();
        return animalService.getAnimals();
    }


    @GetMapping("/view")
    public ModelAndView viewAnimals(){
//        return animalRepository.findAll();
        Iterable<Animal> animals = animalService.getAnimals();
        Map<String, Object> params = new HashMap<>();
        params.put("animals", animals);
        return new ModelAndView("animals", params);
    }






    // post method
    // this aligns with "create"

    @PostMapping("/post")
    public void postAnimal(@RequestBody Animal animal){
        animalService.postAnimal(animal);
    }

    // put method
    // this aligns with "update"

    @PutMapping("/put/{id}")
    public Optional<Animal> updateAnimal(@RequestBody Animal newAnimal, @PathVariable Long id){
       return animalService.updateAnimal(newAnimal, id);
    }

    @RequestMapping("/a")
    public RedirectView localRedirect() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/animals/view");
        return redirectView;
    }

    // delete method
    // this aligns with "delete"

//    @DeleteMapping("/delete/{id}")
//    public void deleteAnimal(@PathVariable Long id){
//       animalService.deleteAnimal(id);
////       localRedirect();
//    }

    @RequestMapping("/delete/{id}")
    public RedirectView deleteAnimalRedirect(@PathVariable Long id){
        animalService.deleteAnimal(id);
        return localRedirect();
    }

}
