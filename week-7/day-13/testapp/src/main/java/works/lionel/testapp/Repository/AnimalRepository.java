package works.lionel.testapp.Repository;

import org.springframework.data.repository.CrudRepository;
import works.lionel.testapp.Model.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
