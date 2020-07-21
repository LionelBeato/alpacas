package works.lionel.testapp.Repository;

import org.springframework.data.repository.CrudRepository;
import works.lionel.testapp.Model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
